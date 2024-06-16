package starter.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.reqres.ReqresAPI;
import starter.reqres.ReqresResponses;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;

public class SingleUserSteps {
    @Steps
    ReqresAPI reqresAPI;

    @Given("Get single user with valid parameter id {int}")
    public void getSingleUserWithValidParameterId(int id) {
        reqresAPI.getSingleUser(id);
    }

    @When("Send request get single users")
    public void sendRequestGetSingleUsers() {
        SerenityRest.when().get(ReqresAPI.USER_WITH_ID);
    }

    @And("Response body single user should be id {int}")
    public void responseBodySingleUserShouldBeId(int id) {
        SerenityRest.and().body(ReqresResponses.ID_USER, equalTo(id));
    }

    @Given("Get single user with special character {string}")
    public void getSingleUserWithSpecialCharacter(String specialChar) {
        reqresAPI.getSingleUserInvalid(specialChar);
    }

    @And("Response body error should be null")
    public void responseBodyErrorShouldBeNull() {
        SerenityRest.and().body(ReqresResponses.ID_USER, equalTo(nullValue()));
    }

    @Given("Get single user with invalid parameter id {int}")
    public void getSingleUserWithInvalidParameterId(int id) {
        reqresAPI.getSingleUser(id);
    }

    @And("Response body single user should be {string}")
    public void responseBodySingleUserShouldBeNull(String nullField) {
        SerenityRest.and().body(equalTo(nullField));
    }
}
