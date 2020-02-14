package StepDefinition1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PayablesStep1 {
	public WiniumDriver driver = null;
	
	@Given("launch payables application.")
	public void launch_payables_application() throws MalformedURLException, InterruptedException {
		DesktopOptions options = new DesktopOptions();
		options.setApplicationPath("C:\\Softrak\\Payables\\Payables.exe");
		driver = new WiniumDriver(new URL("http://127.0.0.1:4723/"),options);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(1000);
	}

	@Given("enter username & password.")
	public void enter_username_password() {
		Set<String> allwin = driver.getWindowHandles();
		List<String> windows = new ArrayList<String>(allwin);
		String wind = windows.get(0);
		driver.switchTo().window(wind);
		driver.findElementByClassName("TSEEdit").sendKeys("sys");
	}

	@When("click on open button")
	public void click_on_open_button() {
		driver.findElementByName("Open").click();
	}

	@Then("Click ok button.")
	public void click_ok_button() {
		driver.findElementByName("OK").click();
		driver.findElementByName("OK").click();
	}
	
	@Then("close the application.")
	public void close_the_application() {
		driver.findElementByName("Close").click();
	}
}
