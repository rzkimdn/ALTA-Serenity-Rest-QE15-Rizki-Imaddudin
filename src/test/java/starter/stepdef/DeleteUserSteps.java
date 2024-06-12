package starter.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.reqres.ReqresAPI;

public class DeleteUserSteps {
    @Steps
    ReqresAPI reqresAPI;

    @Given("Delete user with id {int}")
    public void deleteUserWithId(int id) {
        reqresAPI.deleteUser(id);
    }

    @When("Send request delete users")
    public void sendRequestDeleteUsers() {
        SerenityRest.when().delete(ReqresAPI.USER_WITH_ID);
    }
}
