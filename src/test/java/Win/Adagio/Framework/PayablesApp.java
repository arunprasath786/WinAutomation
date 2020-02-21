package Win.Adagio.Framework;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

public class PayablesApp {
	public  WiniumDriver driver;

	public void launchApp() throws MalformedURLException, InterruptedException {
		DesktopOptions options = new DesktopOptions();
		options.setApplicationPath("C:\\Softrak\\Payables\\Payables.exe");
		driver = new WiniumDriver(new URL("http://127.0.0.1:4723/"),options);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(1000);
	}
	
	public void Login() {
		Set<String> allwin = driver.getWindowHandles();
		List<String> windows = new ArrayList<String>(allwin);
		String wind = windows.get(0);
		driver.switchTo().window(wind);
		WebElement password = driver.findElementByClassName("TSEEdit");
		password.sendKeys("sys");
	}
	public void Ok() {
		WebElement ClickOk = driver.findElementByName("OK");
		ClickOk.click();
		WebElement ClickOk1 = driver.findElementByName("OK");
		ClickOk1.click();
	}
	public void OpenClick() {
		WebElement ClickOpen = driver.findElementByName("Open");
		ClickOpen.click();
	}
	public void Appexit() {
		WebElement Exitapp = driver.findElementByName("Exit");
		Exitapp.click();
	}
}
