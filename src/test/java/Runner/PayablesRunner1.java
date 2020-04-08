package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features ="src/test/java/feature/AdagioPayables1.Feature" ,glue = "Payables_Step"
,monochrome = true,strict = true,tags = "@Reports" /*dryRun = true,snippets=SnippetType.CAMELCASE*/)

public class PayablesRunner1 extends AbstractTestNGCucumberTests{
	 
}
