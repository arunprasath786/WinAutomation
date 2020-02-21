package StepDefinition1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

import Win.Adagio.Framework.PayablesApp;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PayablesStep1 extends PayablesApp{
	//public WiniumDriver driver;
	//PayablesApp app;
	
	@Given("launch payables application.")
	public void launch_payables_application() throws MalformedURLException, InterruptedException {
		launchApp();
	}
	
	@Given("enter username & password.")
	public void enter_username_password() throws MalformedURLException, InterruptedException {
		
		Login();
	}

	@When("click on open button")
	public void click_on_open_button() {
		
		OpenClick();
	}

	@Then("Click ok button.")
	public void click_ok_button() throws InterruptedException {
		
		Ok();
		
	}
	
	@Then("close the application.")
	public void close_the_application() throws InterruptedException {
		Appexit();
	}

}
