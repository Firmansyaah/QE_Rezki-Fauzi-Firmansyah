package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import net.serenitybdd.annotations.Steps;
import starter.user.GetAllDataPost;

public class GetAllDataPostSteps {

    @Steps
    GetAllDataPost getAllDataPost;

    @Given("I set API endpoint for get all data post")
    public void setApiEndpoint() {
        getAllDataPost.setApiEndpoint();
    }

    @When("I send a request to get all data post")
    public void sendGetAllDataPostRequest() {
        getAllDataPost.sendGetAllPostRequest();
    }

    @Then("I receive status code 200")
    public void receiveStatusCode200() {
        getAllDataPost.receiveStatusCode200();
    }

    @And("I receive valid data for all data post")
    public void receiveValidAllDataPost() {
        getAllDataPost.receiveValidAllDataPost();
    }

    @Then("I receive status code 500")
    public void receiveStatusCode500() { getAllDataPost.receiveStatusCode500();}

    @And("I receive an error message 'Internal Server Error'")
    public void receiveErrorMessageInternalServerError() { getAllDataPost.receiveErrorMessageInternalServerError(); }
}