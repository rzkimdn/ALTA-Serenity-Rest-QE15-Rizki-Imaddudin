package starter.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.reqres.ReqresAPI;
import starter.utils.Constants;

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
}
