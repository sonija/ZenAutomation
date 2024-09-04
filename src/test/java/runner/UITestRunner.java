package runner;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


//@RunWith(Cucumber.class)
@CucumberOptions(
    features = {"src/test/resources/features"},
    glue = {"stepDefs", "hooks"},
   tags= "@UI"
    //plugin = {"pretty", "html:target/cucumber-reports.html"}
)
public class UITestRunner extends AbstractTestNGCucumberTests {
}