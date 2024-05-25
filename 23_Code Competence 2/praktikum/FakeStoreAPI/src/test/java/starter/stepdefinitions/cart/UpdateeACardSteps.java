package starter.stepdefinitions.cart;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.user.cart.UpdateACard;

public class UpdateeACardSteps {

    UpdateACard updateACard = new UpdateACard();

    @Given("I set the API endpoint for update a specific cart data")
    public void iSetTheAPIEndpointForUpdateASpecificCartData() {
        updateACard.setAPIUpdatedCartData();
    }

    @When("I send a request to update cart data")
    public void iSendARequestToUpdateCartData() {
        updateACard.sendRequestUpdateCartData();
    }

    @Then("I should get the data cart that I updated")
    public void iShouldGetTheDataCartThatIUpdated() {
        updateACard.receiveDataCartUpdated();
    }

    @Given("I set the invalid API endpoint for update a specific cart data")
    public void iSetTheInvalidAPIEndpointForUpdateASpecificCartData() {
        updateACard.setInvalidAPIUpdatedCartData();
    }

    @When("I send a request to update cart data with invalid endpoint")
    public void iSendARequestToUpdateCartDataWithInvalidEndpoint() {
        updateACard.sendRequestUpdateCartDataWithInvalidEndpoint();
    }

    @Then("I should receive a status code of 404")
    public void iShouldReceiveAStatusCodeOf404() {
        updateACard.verifyStatusCode404();
    }

    @Then("I should receive an update error message")
    public void iShouldReceiveAnUpdateErrorMessage() {
        updateACard.receiveUpdateErrorMessage();
    }
}
