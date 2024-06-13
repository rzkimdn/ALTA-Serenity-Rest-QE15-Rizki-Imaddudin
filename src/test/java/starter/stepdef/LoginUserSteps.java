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
        token = "QpwL5tke4Pnpja7X4";
        SerenityRest.and().body(ReqresResponses.TOKEN, equalTo(token));
    }

    @And("Response body error should be {string}")
    public void responseBodyErrorShouldBe(String error) {
        error = "Missing password";
        SerenityRest.and().body(ReqresResponses.ERROR, equalTo(error));
    }
}
