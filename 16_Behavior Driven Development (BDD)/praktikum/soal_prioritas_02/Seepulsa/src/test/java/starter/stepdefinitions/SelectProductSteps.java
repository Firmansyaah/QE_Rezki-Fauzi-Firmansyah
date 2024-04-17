package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
public class SelectProductSteps {

    @Given("I has successfully logged in to their Sepulsa account")
    public void userHasLoggedInToSepulsa() { }

    @When("I selects a product category")
    public void userSelectsProductCategory() { }

    @When("I selects a specific product")
    public void userSelectsSpecificProduct() { }

    @Then("the system should display a summary page with the selected product details")
    public void systemDisplaysSummaryPage() { }

    @And("I should be able to proceed to the payment step")
    public void userProceedsToPayment() { }

    @When("I tries to select a product category that is not available")
    public void userTriesToSelectUnavailableCategory() { }

    @Then("the system should display an error message indicating that the product category is not found")
    public void systemDisplaysCategoryNotFoundError() { }

    @And("I should not be able to proceed to select other products")
    public void userCannotProceedToSelectProducts() { }
}






