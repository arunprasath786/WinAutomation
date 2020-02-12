package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features ="src/test/java/feature/AdagioPayables.Feature" ,glue = "StepDefinition"
,monochrome = true,strict = true/*,tags = "@sanity" /*dryRun = true,snippets=SnippetType.CAMELCASE*/)

public class PayablesRunner extends AbstractTestNGCucumberTests  {
	

				
}
