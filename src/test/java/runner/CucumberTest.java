package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/test.feature",
        glue = "com.example.stepDefs"
)

public class CucumberTest extends AbstractTestNGCucumberTests {
}
