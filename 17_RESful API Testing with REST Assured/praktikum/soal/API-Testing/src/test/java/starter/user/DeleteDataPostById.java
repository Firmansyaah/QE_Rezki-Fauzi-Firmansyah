package starter.user;


import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.annotations.Step;

public class DeleteDataPostById {
    private String apiEndpoint = "https://jsonplaceholder.typicode.com";

    @Step("I set API endpoint for deleting data by ID")
    public String setApiEndpointDelete() { return apiEndpoint + "posts" + "1"; }

    @Step("I send a DELETE request to delete post data by ID 1")
    public Response sendDeleteRequest(int postId) {
        return SerenityRest.given()
                .pathParam("postId", 1)
                .delete(apiEndpoint + "/{postId}");
    }

    @Step("I send a DELETE request to delete post data by invalid ID -1")
    public Response sendDeleteRequestinvalid(int postId) {
        return SerenityRest.given()
                .pathParam("postId", -1)
                .delete(apiEndpoint + "/{postId}");
    }

}
