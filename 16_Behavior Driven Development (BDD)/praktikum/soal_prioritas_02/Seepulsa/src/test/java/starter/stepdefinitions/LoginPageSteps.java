package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class LoginPageSteps {

    @Given("I opens the Sepulsa login page")
    public void openSepulsaLoginPage() { }

    @When("I enters a valid username and password")
    public void enterValidCredentials() { }

    @And("I clicks the login button")
    public void clickLoginButton() { }

    @Then("I should successfully login to their account")
    public void verifySuccessfulLogin() { }


    @When("I enters a valid username and password, including non-sensitive characters")
    public void enterValidCredentialsWithNonSensitiveChars() { }

    @When("I enters wrong username")
    public void enterWrongUsername() { }

    @And("I enters correct password")
    public void enterCorrectPassword() { }

    @Then("the system should display an error message that the username entered is invalid")
    public void verifyInvalidUsernameErrorMessage() { }

    @When("I enters the correct username")
    public void enterCorrectUsername() { }

    @When("I entered wrong password")
    public void enterWrongPassword() { }

    @Then("the system should display an error message that the password entered is invalid")
    public void verifyInvalidPasswordErrorMessage() { }

}

