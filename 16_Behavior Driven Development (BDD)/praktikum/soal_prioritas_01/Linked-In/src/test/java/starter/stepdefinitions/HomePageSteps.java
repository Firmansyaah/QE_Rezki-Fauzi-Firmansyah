package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
public class HomePageSteps {

    @Given("I am a logged-in user of LinkedIn")
    public void loggedUserOfLinkedIn() { }

    @When("I navigate to the LinkedIn home page")
    public void navigateToTheLinkedInHomePage() { }

    @Then("I should see the home page with the latest news and updates from my network")
    public void shouldSeeTheHomePageWithTheLatestNewsAndUpdatesFromMyNetwork() { }

    @Given("I am not logged in to LinkedIn")
    public void notLoggedInToLinkedIn() { }

    @When("I try to navigate to the LinkedIn home page")
    public void tryToNavigateToLinkedInHomePage() { }

    @Then("I should be redirected to the login page")
    public void shouldRedirectToLoginPage() { }

    @When("I select the {string} option on the LinkedIn home page")
    public void selectOptionOnLinkedInHomePage(String option) { }

    @And("I enter a valid job keyword")
    public void enterValidJobKeyword() { }

    @And("I click the {string} button")
    public void clickButton(String button) { }

    @Then("I should see a list of jobs that match my search criteria")
    public void seeListOfJobsMatchingSearchCriteria() { }

    @And("I enter an invalid job keyword")
    public void enterInvalidJobKeyword() { }

    @Then("I should see a message indicating no results found")
    public void seeMessageIndicatingNoResultsFound() { }

    @And("I enter valid contact information")
    public void enterValidContactInformation() { }

    @Then("I should see a list of contacts that match my search criteria")
    public void seeListOfContactsMatchingSearchCriteria() { }

    @Then("I should see a message indicating no contacts found")
    public void seeMessageIndicatingNoContactsFound() { }

    @Given("I am a logged-in user of LinkedIn with an expired session")
    public void loggedInUserOfLinkedInWithExpiredSession() { }

    @Given("I am a logged-in user of LinkedIn with insufficient permissions")
    public void loggedInUserOfLinkedInWithInsufficientPermissions() {  }

    @Then("I should see an error message indicating insufficient permissions")
    public void seeErrorMessageIndicatingInsufficientPermissions() { }

    @Then("I should see a message indicating the required field is empty")
    public void seeMessageIndicatingRequiredFieldEmpty() {}

    @And("I leave the contact search field empty")
    public void leaveContactSearchFieldEmpty() { }

    @And("I leave the job keyword field empty")
    public void leaveJobKeywordFieldEmpty() { }

    @And("I enter invalid contact information")
    public void enterInvalidContactInformation() { }

}
