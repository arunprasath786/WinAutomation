package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features ="src/test/java/feature/AdagioBankRec.Feature",glue = "StepDefinition"
,monochrome = true,strict = true,tags = "@efcodes"/*dryRun = true,snippets=SnippetType.CAMELCASE*/)

public class PayablesRunner extends AbstractTestNGCucumberTests  {
	
}
