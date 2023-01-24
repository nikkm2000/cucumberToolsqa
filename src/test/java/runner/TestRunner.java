package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src\\test\\resources\\featureFile",
		glue="\\src\\test\\java\\stepDef"
		
		)



public class TestRunner extends AbstractTestNGCucumberTests{

}
