package starter.stepdefinitions.cart;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import starter.user.cart.GetASingleCartData;

public class GetASingleCartDataSteps {

    GetASingleCartData getASingleCartData = new GetASingleCartData();

    @Given("I set the API endpoint for a single cart data")
    public void iSetTheAPIEndpointForASingleCartData() {
        getASingleCartData.setAPIEndpointSingleCart();
    }

    @Given("I set the API endpoint for a single cart data with invalid parameters")
    public void iSetTheAPIEndpointForASingleCartDataWithInvalidParameters() {
        getASingleCartData.setAPIEndpointForSingleCartDataWithInvalidParameters();
    }

    @When("I send a request to retrieve single cart data")
    public void iSendARequestToRetrieveSingleCartData() {
        getASingleCartData.sendRequestSingleCart();
    }

    @When("I send a request to retrieve single cart data with invalid URL")
    public void iSendARequestToRetrieveSingleCartDataWithInvalidURL() {
        getASingleCartData.sendRequestSingleCartWithInvalidUrl();
    }

    @Then("I should receive a specific single cart data")
    public void iShouldReceiveASpecificSingleCartData() {
        getASingleCartData.receiveSingleCartData();
    }

    @Then("I should receive an error message")
    public void iShouldReceiveAnErrorMessage() {
        getASingleCartData.receiveErrorMessage();
    }
}
