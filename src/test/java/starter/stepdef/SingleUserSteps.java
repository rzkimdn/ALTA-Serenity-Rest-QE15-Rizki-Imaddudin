package starter.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.reqres.ReqresAPI;
import starter.reqres.ReqresResponses;

import static org.hamcrest.Matchers.equalTo;

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
}
