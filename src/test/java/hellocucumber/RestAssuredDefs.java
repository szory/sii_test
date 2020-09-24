package hellocucumber;

import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import model.ModelsActorTest;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertEquals;

public class RestAssuredDefs {

    private String path;
    private Response response;

    @BeforeStep
    public void doSomethingBeforeStep(Scenario scenario){
        if (scenario.getName().equals("Get a list of users")){}
            //System.out.println("BEFORE STEP");
    }

    @Given("the users endpoint exists")
    public void the_users_endpoint_exists() {
        RestAssured.baseURI = "http://gitlab.moderntester.pl/";
        RestAssured.port = 8811;
        path = "/users";
    }

    @When("I send a valid get user payload")
    public void i_send_a_valid_get_user_payload() {
        response =
                given().basePath("/api/actor")
                        .contentType("application/json")
                        .when()
                        .get();
    }
    @Then("response status code should be {int}")
    public void response_status_code_should_be(int code) {
        assertEquals(code, response.getStatusCode());
    }

    @And("get user response should be size {int}")
    public void get_user_response_should_be_size(int int1) {
        int sizeJson = response.jsonPath().get("content.size");
        //List<ModelsActorTest> list = response.jsonPath().getList("content", ModelsActorTest.class);
        //assertEquals(int1,response.jsonPath().getList("content", ModelsActorTest.class).size());
        assertEquals(int1,sizeJson);
    }
}