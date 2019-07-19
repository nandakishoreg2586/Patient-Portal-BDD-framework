package runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "features" //Path of the feature files
		,glue={"stepDefinition"} //path of the step definition file
		,tags={"@Feature-3"} // test cases to be run based on tags
	//	,dryRun=true // to see if all gherkin steps are implemented 
		,monochrome=true // to generated result in good format
	//	,format={"junit:junit_xml/cucumber.xml"} // to generate report in different format (HTML,JSON,XML)
	//	,strict=true // to check if all gherkin are implemented will run not fail like dryRun 
		,plugin={"pretty","html:target/cucumber-html-report","com.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReport.html"} //"json:target/cucumber.json"
		
		)

public class TestRunner {
	
	
	@AfterClass
	public static void setup()
	{
	Reporter.loadXMLConfig("config/extent-config.xml");
	
	}
	

}
