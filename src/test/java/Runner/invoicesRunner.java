package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features ="src/test/java/feature/AdagioInvoices.Feature",glue = "Invoices_Step"
,monochrome = true,strict = true,tags = "@test"/*dryRun = true,snippets=SnippetType.CAMELCASE*/)

public class invoicesRunner extends AbstractTestNGCucumberTests{

}
 