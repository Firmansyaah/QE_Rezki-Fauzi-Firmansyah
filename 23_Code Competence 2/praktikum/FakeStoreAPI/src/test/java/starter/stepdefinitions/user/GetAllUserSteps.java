package starter.stepdefinitions.user;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.user.user.GetAllUser;

public class GetAllUserSteps {
    @Steps
    GetAllUser getAllUsers;

    @Given("I set the API endpoint to retrieve all users data")
    public void setAPIEndpointAllUsersData(){
        getAllUsers.setAPIEndpointAllUsersData();
    }

    @When("I send a request to retrieve all users data")
    public void sendRequestAllUsersData(){
        getAllUsers.sendRequestAllUsersData();
    }

    @Then("I should receive all users data")
    public void receiveAllUsersData(){
        getAllUsers.receiveAllUsersData();
    }
    @When("I send a request to retrieve all users data with unauthorized access")
    public void iSendARequestToRetrieveAllUsersDataWithUnauthorizedAccess() {
        getAllUsers.sendRequestAllUsersDataUnauthorized();
    }
    @Then("I should receive a status code of 400")
    public void iShouldReceiveAStatusCodeOf401() {
        getAllUsers.receiveUnauthorizedErrorMessage();
    }

    @Then("I should receive an unauthorized error message")
    public void iShouldReceiveAnUnauthorizedErrorMessage() {
        getAllUsers.receiveUnauthorizedErrorMessage();
    }
}
