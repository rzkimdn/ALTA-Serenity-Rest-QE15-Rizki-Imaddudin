package starter.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.reqres.ReqresAPI;
import starter.utils.Constants;

import java.io.File;

public class RegisterUserStep {
    @Steps
    ReqresAPI reqresAPI;

    @Given("User register with valid json {string}")
    public void userRegisterWithValidJson(String fileName) {
        File jsonFile = new File(Constants.REQ_BODY + fileName);
        reqresAPI.registerUser(jsonFile);
    }

    @When("Send request post register users")
    public void sendRequestPostRegisterUsers() {
        SerenityRest.when().post(ReqresAPI.REGISTER_USER);
    }

    @Given("User register with invalid json {string}")
    public void userRegisterWithInvalidJson(String fileName) {
        File jsonFile = new File(Constants.REQ_BODY + fileName);
        reqresAPI.registerUser(jsonFile);
    }

    @Given("User register with empty email {string}")
    public void userRegisterWithEmptyEmail(String emptyEmail) {
        File jsonFile = new File(Constants.REQ_BODY + emptyEmail);
        reqresAPI.registerUser(jsonFile);
    }

    @Given("User register with empty password {string}")
    public void userRegisterWithEmptyPassword(String emptyPassword) {
        File jsonFile = new File(Constants.REQ_BODY + emptyPassword);
        reqresAPI.registerUser(jsonFile);
    }

    @Given("user register with empty email & password json {string}")
    public void userRegisterWithEmptyEmailPasswordJson(String empty) {
        File jsonFile = new File(Constants.REQ_BODY + empty);
        reqresAPI.registerUser(jsonFile);
    }

    @Given("User register with special character json {string}")
    public void userRegisterWithSpecialCharacterJson(String specialChar) {
        File jsonFile = new File(Constants.REQ_BODY + specialChar);
        reqresAPI.registerUser(jsonFile);
    }
}
