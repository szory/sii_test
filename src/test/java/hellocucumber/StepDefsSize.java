package hellocucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

class IsItMySize {
    static String isMySize(String today) {
        return "180 cm";
    }
}

public class StepDefsSize {
    private String size;
    private String actualAnswer;

    @Given("I'm 180cm tall")
    public void i_m_180cm_tall() {
        // Write code here that turns the phrase above into concrete actions
        size = "190cm";
    }

    @When("Is asking how tall you are")
    public void is_asking_how_tall_you_are() {
        // Write code here that turns the phrase above into concrete actions
        actualAnswer = IsItMySize.isMySize(size);
    }

    @Then("It should be told {string}")
    public void i_should_be_told(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }
}
