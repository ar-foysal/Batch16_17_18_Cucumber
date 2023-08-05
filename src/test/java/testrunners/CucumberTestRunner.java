package testrunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src\\test\\java\\features",
        glue = "step_definitions"
)
public class CucumberTestRunner extends AbstractTestNGCucumberTests {
}
