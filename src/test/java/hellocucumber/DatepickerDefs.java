package hellocucumber;

import common.TableMonthCommon;
import common.WebDriverFactory;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.DatepickerPage;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class DatepickerDefs {

    WebDriver driver;
    private String day;
    private String actualAnswer;

    @Before
    public void initialize(Scenario scenario){
        if (scenario.getName().equals("pick a date")){
            WebDriverFactory webDriverFactory = new WebDriverFactory("http://seleniumui.moderntester.pl/datepicker.php");
            driver = webDriverFactory.getWebDriverHandler();
        }
    }

    @Given("is picked a {int} of date")
    public void is_picked_a_date(Integer day_nr) {
        day = day_nr.toString();
    }
    @When("question what date is today")
    public void question_what_date_is_today() {

        DatepickerPage datepickerPage = new DatepickerPage(driver);
        datepickerPage.getDatepickerWebElement().click();

        //String day = "14";
        String month = "2";
        String year = "2010";

        datepickerPage.setDatepicker(""+month+"/"+day+"/"+year+"");

        List<WebElement> count_tr = driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td/a"));
        for (WebElement elem: count_tr) {
            if (elem.getAttribute("class").contains("ui-state-default ui-state-active")){
                actualAnswer = elem.getText();
            }
        }
    }
    @Then("it should be selected {string}")
    public void it_should_be_written(String expectedAnswer) throws InterruptedException {
        assertEquals(expectedAnswer, actualAnswer);
        driver.quit();
        Thread.sleep(1000);
    }
}
