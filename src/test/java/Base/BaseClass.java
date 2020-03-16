package Base;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Win.Adagio.Framework.PayablesApp;

public class BaseClass {
public static WiniumDriver driver;
/*
	@BeforeMethod
	public void startApp() throws MalformedURLException, InterruptedException {
		/*DesktopOptions options = new DesktopOptions();
		options.setApplicationPath("C:\\Softrak\\Payables\\Payables.exe");
		driver = new WiniumDriver(new URL("http://127.0.0.1:4723/"),options);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(1000);
		System.out.println("Launch App");
	}
	@AfterMethod
	public void closeApp() {
		System.out.println("Application CLosed");
}
*/
}
