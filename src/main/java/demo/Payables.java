package demo;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Payables {
	public WiniumDriver driver = null;
	// @BeforeClass
		public void LaunchApp() throws InterruptedException, MalformedURLException {
		Screen screen = new Screen();
		Pattern pattern = new Pattern("D:\\Arun\\sikulisnaps\\vendorcode.PNG");
				DesktopOptions options = new DesktopOptions();
				options.setApplicationPath("C:\\Softrak\\Payables\\Payables.exe");
				driver = new WiniumDriver(new URL("http://127.0.0.1:4723/"),options);
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				Thread.sleep(1000);
				Set<String> allwin = driver.getWindowHandles();
				List<String> windows = new ArrayList<String>(allwin);
				String wind = windows.get(0);
				driver.switchTo().window(wind);
				driver.findElementByClassName("TSEEdit").sendKeys("sys");
				driver.findElementByName("Open").click();
				driver.findElementByName("OK").click();
	}
//@Test
	public  void Invoice_Post() throws InterruptedException, MalformedURLException, FindFailed {
		Screen screen = new Screen();
		Pattern pattern = new Pattern("D:\\Arun\\sikulisnaps\\vendorcode.PNG");
				driver.findElementByName("New").click();
				driver.findElementByName("OK").click();
				screen.type(pattern, "ATL01");
				driver.findElementByName("New").click();
				Pattern dist = new Pattern("D:\\Arun\\sikulisnaps\\Distribution.PNG");
				screen.type(dist, "GST");
				driver.findElementByName("OK").click();
				driver.findElementByName("OK").click();
			
				Pattern close = new Pattern("D:\\Arun\\sikulisnaps\\close.PNG");
				screen.click(close);
				driver.findElementByName("Ready To Post").click();
				driver.findElementByName("Yes").click();
				Pattern post = new Pattern("D:\\Arun\\sikulisnaps\\post.PNG");
				screen.click(post);
				driver.findElementByName("Post Only").click();
				driver.findElementByName("OK").click();
				driver.findElementByName("Close").click();
				driver.findElementByName("Exit").click();
}
}
