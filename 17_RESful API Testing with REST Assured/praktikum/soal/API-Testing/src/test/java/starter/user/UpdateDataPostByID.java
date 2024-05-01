package starter.user;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.annotations.Step;

public class UpdateDataPostByID {
    private String url = "https://jsonplaceholder.typicode.com";

    @Step("I set API endpoint for update data by ID")
    public String setApiEndpointUpdate() {
        return url + "posts" + "1";
    }

    @Step("I send a PUT request to update post data by ID 1")
    public Response sendPutRequest(int postId, String requestBody) {
        return SerenityRest.given()
                .contentType("application/json")
                .pathParam("postId", 1)
                .body(requestBody)
                .put("/post" + "{postId}");
    }

    @Step("I send a PUT request to update post data by invalid ID -1")
    public Response sendPutRequestInvalid(int postId, String requestBody) {
        return SerenityRest.given()
                .contentType("application/json")
                .pathParam("postId", -1)
                .body(requestBody)
                .put("/post" + "{postId}");
    }

    @Step("the request is successful")
    public void requestIsSuccessful() {
    }


    @Step("the request fails")
    public void requestFails() {
    }


    public void sendPutRequest(int i) {
    }

    public void sendPutRequestInvalid(int i) {
    }
}
