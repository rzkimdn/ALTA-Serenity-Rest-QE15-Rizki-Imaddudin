package starter.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.reqres.ReqresAPI;
import starter.reqres.ReqresResponses;
import starter.utils.Constants;
import static org.hamcrest.Matchers.equalTo;

import java.io.File;

public class LoginUserSteps {
    @Steps
    ReqresAPI reqresAPI;

    @Given("User login with valid json {string}")
    public void userLoginWithValidJson(String fileName) {
        File jsonFile = new File(Constants.REQ_BODY + fileName);
        reqresAPI.loginUser(jsonFile);
    }

    @When("Send request post login user")
    public void sendRequestPostLoginUser() {
        SerenityRest.when().post(ReqresAPI.LOGIN_USER);
    }

    @Given("user login with invalid data {string}")
    public void userLoginWithInvalidData(String fileName) {
        File jsonFile = new File(Constants.REQ_BODY + fileName);
        reqresAPI.loginUser(jsonFile);
    }

    @And("Response body token should be {string}")
    public void responseBodyTokenShouldBe(String token) {
        SerenityRest.and().body(ReqresResponses.TOKEN, equalTo(token));
    }

    @And("Response body error should be {string}")
    public void responseBodyErrorShouldBe(String error) {
        SerenityRest.and().body(ReqresResponses.ERROR, equalTo(error));
    }

    @Given("User login with empty email json {string}")
    public void userLoginWithEmptyEmailJson(String emptyEmail) {
        File jsonFile = new File(Constants.REQ_BODY + emptyEmail);
        reqresAPI.loginUser(jsonFile);
    }

    @Given("User login with empty password json {string}")
    public void userLoginWithEmptyPasswordJson(String emptyPassword) {
        File jsonFile = new File(Constants.REQ_BODY + emptyPassword);
        reqresAPI.loginUser(jsonFile);
    }

    @Given("User login with empty email & password json {string}")
    public void userLoginWithEmptyEmailPasswordJson(String empty) {
        File jsonFile = new File(Constants.REQ_BODY + empty);
        reqresAPI.loginUser(jsonFile);
    }

    @Given("User login with special character json {string}")
    public void userLoginWithSpecialCharacterJson(String specialChar) {
        File jsonFile = new File(Constants.REQ_BODY + specialChar);
        reqresAPI.loginUser(jsonFile);
    }
}
