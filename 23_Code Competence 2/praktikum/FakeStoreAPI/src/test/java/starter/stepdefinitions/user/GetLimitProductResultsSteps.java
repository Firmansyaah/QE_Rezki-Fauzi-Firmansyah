package starter.stepdefinitions.user;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.user.user.GetLimitedProductResults;


public class GetLimitProductResultsSteps {
    @Steps
    GetLimitedProductResults getLimitProductResults;

    @Given("I set the API endpoint to fetch user data limited to 5 products")
    public void setAPIEndpointLimitedProducts(){
        getLimitProductResults.setAPIEndpointLimitedProducts();
    }
    @Given("I set an invalid API endpoint to fetch user data")
    public void iSetAnInvalidAPIEndpointToFetchUserData() {
        getLimitProductResults.setInvalidAPIEndpoint();
    }
    @When("I request to fetch user data from invalid endpoint")
    public void iRequestToFetchUserDataFromInvalidEndpoint() {
        getLimitProductResults.sendRequestInvalidEndpoint();
    }

    @When("I request to fetch user data limited to 5 products")
    public void sendRequestLimitedProducts(){
        getLimitProductResults.sendRequestLimitedProducts();
    }

    @Then("I should receive valid data containing only 5 products")
    public void receiveLimitedDataProducts(){
        getLimitProductResults.receiveLimitedDataProducts();
    }


}
