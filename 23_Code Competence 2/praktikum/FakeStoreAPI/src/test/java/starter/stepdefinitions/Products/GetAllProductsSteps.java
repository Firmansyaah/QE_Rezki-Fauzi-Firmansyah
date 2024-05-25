package starter.stepdefinitions.products;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

import starter.user.products.GetAllProducts;

public class GetAllProductsSteps {
    @Steps
    GetAllProducts getAllProducts;

    @Given("I set the API endpoint to retrieve all data products")
    public void setApiEndpointAllProducts(){
        getAllProducts.setApiEndpointAllProducts();
    }
    @Given("I set the API endpoint to retrieve all data products with invalid Endpoint")
    public void iSetTheAPIEndpointToRetrieveAllDataProductsWithInvalidEndpoint() {
        getAllProducts.setAPIEndpointAllProductsInvalidEndpoint();
    }
    @When("I send a request to retrieve all data products with invalid endpoint")
    public void iSendARequestToRetrieveAllDataProductsWithInvalidEndpoint() {
        getAllProducts.sendRequestAllProductsWithInvalidEndpoint(); }

    @When("I send a request to retrieve all data products")
    public void sendRequestAllProducts(){
        getAllProducts.sendRequestAllProducts();
    }

    @And("I should receive a status code of 200")
    public void receiveStatusCode200(){
        getAllProducts.receiveStatusCode200();
    }

    @Then("I should receive valid data for all products")
    public void receiveValidAllDataProducts(){
        getAllProducts.receiveValidAllDataProducts();
    }

}
