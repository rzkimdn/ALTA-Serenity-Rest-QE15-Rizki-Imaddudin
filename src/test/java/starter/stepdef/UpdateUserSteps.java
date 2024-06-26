package starter.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.reqres.ReqresAPI;
import starter.utils.Constants;

import java.io.File;

public class UpdateUserSteps {
    @Steps
    ReqresAPI reqresAPI;

    @Given("Update user with parameter id {int} and valid json {string}")
    public void updateUserWithParameterIdAndValidJson(int id, String JsonFileName) {
        File jsonFile = new File(Constants.REQ_BODY + JsonFileName);
        reqresAPI.putUpdateUser(id, jsonFile);
    }

    @When("Send request put update user")
    public void sendRequestPutUpdateUser() {
        SerenityRest.when().put(ReqresAPI.USER_WITH_ID);
    }

    @When("Send request patch update user")
    public void sendRequestPatchUpdateUser() {
        SerenityRest.when().patch(ReqresAPI.USER_WITH_ID);
    }

    @Given("Update user with empty id {int} and job {string}")
    public void updateUserWithEmptyNameAndJob(int id, String fileName) {
        File jsonFile = new File(Constants.REQ_BODY + fileName);
        reqresAPI.putUpdateUser(id, jsonFile);
    }
}
