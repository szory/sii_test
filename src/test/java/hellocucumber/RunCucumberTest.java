package hellocucumber;

import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","json:target/cucumber-report/cucumber.json"}
        //plugin = { "de.monochromata.cucumber.report.PrettyReports:target/cucumber" }
)

public class RunCucumberTest {

}