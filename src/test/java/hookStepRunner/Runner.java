package hookStepRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions
(
		features={"src\\test\\resources\\featureFiles\\AutomationEx1.feature"},
		glue={"hookStepRunner"},
		plugin={"pretty", "html:target/cucumber-reports"},
		tags= ("@Regression or @Retesting or @Sanity")
)
public class Runner extends AbstractTestNGCucumberTests
{
	
}
