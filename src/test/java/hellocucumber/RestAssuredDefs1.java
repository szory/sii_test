package hellocucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class RestAssuredDefs1 {

    private Response response;

    @Given("the users endpoint address exists")
    public void the_users_endpoint_address_exists() {
        // Write code here that turns the phrase above into concrete actions
        RestAssured.baseURI = "http://gitlab.moderntester.pl/";
        RestAssured.port = 8811;

    }
    @When("I send user firstName {string} and lastName {string}")
    public void i_send_user_first_name_johnny(String name, String lastName) {
        // Write code here that turns the phrase above into concrete actions
        response =
                given().basePath("/api/actor")
                        .queryParam("firstName", name)
                        .queryParam("lastName", lastName)
                        .when()
                        .get();
    }
    @Then("response status will be {int}")
    public void response_status_will_be(int code) {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(code, response.getStatusCode());
    }
    @Then("response should contains firstName {string}")
    public void response_should_contains_first_name_johnny(String name) {
        // Write code here that turns the phrase above into concrete actions
        String firstName = response.jsonPath().get("content[0].firstName");
        //List<ModelsActorTest> list = response.jsonPath().getList("content", ModelsActorTest.class);
        //assertEquals(int1,response.jsonPath().getList("content", ModelsActorTest.class).size());
        assertEquals(name.toLowerCase(),firstName.toLowerCase());
    }
}