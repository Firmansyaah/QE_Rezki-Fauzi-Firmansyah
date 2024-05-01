package starter.stepdefinitions;



import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.annotations.Steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import starter.user.GetDataPostById;
import static org.hamcrest.Matchers.equalTo;



public class GetDataPostByIdSteps {
    private GetDataPostById getDataPostById = new GetDataPostById();

    @Given("I set API endpoint for get data by ID")
    public void setApiEndpointByID() { getDataPostById.setApiEndpointByID(); }

    @When("I send a GET request to get post data by ID 1")
    public void sendGetPostRequest() { getDataPostById.sendGetPostRequest(1); }

    @Then("I receive a response with status code 200")
    public void receiveStatusCode200() {
        getDataPostById.receiveStatusCode200();
    }

    @And("the post data is returned for ID {int}")
    public void verifyPostData(int postId) { getDataPostById.verifyPostData(1); }

    @Given("I send a GET request to get post data by invalid ID -1")
    public void sendGetPostRequestInvalid() { getDataPostById.sendGetPostRequestInvalid(-1); }

}

