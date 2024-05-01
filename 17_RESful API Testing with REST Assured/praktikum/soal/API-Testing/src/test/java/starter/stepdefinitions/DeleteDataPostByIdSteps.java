package starter.stepdefinitions;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import starter.user.DeleteDataPostById;

public class DeleteDataPostByIdSteps {
    private DeleteDataPostById deleteDataPostById = new DeleteDataPostById();

    @Given("I set API endpoint for deleting data by ID")
    public void setApiEndpointDelete() {
        deleteDataPostById.setApiEndpointDelete();
    }

    @When("I send a DELETE request to delete post data by ID 1")
    public void sendDeleteRequest() {
        deleteDataPostById.sendDeleteRequest(1);
    }

    @When("I send a DELETE request to delete post data by invalid ID -1")
    public void sendDeleteRequestInvalid() {
        deleteDataPostById.sendDeleteRequestinvalid(-1);
    }
}
