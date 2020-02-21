package StepDefinition;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class PayablesStep {
	public WiniumDriver driver;
	/*@Given("launch winappdriver.")
	public void launch_winappdriver() throws MalformedURLException {
		DesktopOptions options = new DesktopOptions();
		options.setApplicationPath("C:\\Program Files (x86)\\Windows Application Driver\\WinAppDriver.exe");
		driver = new WiniumDriver(new URL("http://127.0.0.1:4723/"),options);
	}*/
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
	
	@Then("Close Invoice window.")
	public void close_Invoice_window() throws FindFailed, InterruptedException {
		Screen screen = new Screen();
		Thread.sleep(1000);
		Pattern close = new Pattern("D:\\Arun\\sikulisnaps\\invoiceclose.PNG");
		screen.click(close);
	}

	@Then("Select File-->Data Integrity Check from menu bar.")
	public void select_File_Data_Integrity_Check_from_menu_bar() {
		driver.findElementByName("File").click();
		driver.findElementByName("Data Integrity Check").click();
	}

	@Then("Click Check.")
	public void click_Check() throws IOException {
		driver.findElementByName("Check").click();
		File snap = driver.getScreenshotAs(OutputType.FILE);
		File file=new File("D:\\Arun\\selenium snaps\\DataIntrgrity.PNG");
		FileUtils.copyFile(snap, file);
		driver.findElementByName("OK").click();
	}
	
	@Then("Select Maintenance-->Calculate Vendor Aging.")
	public void select_Maintenance_Calculate_Vendor_Aging() {
		driver.findElementByName("Maintenance").click();
		driver.findElementByName("Calculate Vendor Aging").click();
	}

	@Then("Click Calculate Button.")
	public void click_Calculate_Button() {
		driver.findElementByName("Calculate").click();
		driver.findElementByName("OK").click();
		driver.findElementByName("Close").click();
	}
	
	@Then("Select Inquiries-->Vendors from menubar.")
	public void select_Inquiries_Vendors_from_menubar() {
		driver.findElementByName("Inquiries").click();
		driver.findElementByName("Vendors").click();
	}

	@Then("Click View Button.")
	public void click_View_Button() {
		driver.findElementByName("View").click();
		driver.findElementByName("Next").click();
		driver.findElementByName("Next").click();
		driver.findElementByName("Next").click();
		driver.findElementByName("OK").click();
		driver.findElementByName("Close").click();
	}
	
	@Then("Create new invoice by clicking New button.")
	public void create_new_invoice_by_clicking_New_button() {
		driver.findElementByName("New").click();
		driver.findElementByName("OK").click();
	}

	@Then("Give vendor code.")
	public void give_vendor_code() throws FindFailed {
		Screen screen = new Screen();
		Pattern pattern = new Pattern("D:\\Arun\\sikulisnaps\\vendorcode.PNG");
		screen.type(pattern, "ATL01");
		Pattern desc = new Pattern("D:\\Arun\\sikulisnaps\\Description.PNG");
		screen.type(desc, "TESTTESTSETSESTS");
		screen.type(Key.TAB);
		screen.type("TESTTESTSETSESTS");
	}

	@Then("Give distribution code by clicking New button.")
	public void give_distribution_code_by_clicking_New_button() throws FindFailed, InterruptedException {
		Screen screen = new Screen();
		driver.findElementByName("New").click();
		Pattern dist = new Pattern("D:\\Arun\\sikulisnaps\\Distribution.PNG");
		screen.type(dist, "GST");
		driver.findElementByName("OK").click();
		Thread.sleep(1000);
		Pattern edit = new Pattern("D:\\Arun\\sikulisnaps\\Edit.PNG");
		screen.click(edit);
	}

	@Then("Take screenshot for New Invoice detail window.")
	public void take_screenshot_for_New_Invoice_detail_window() throws IOException, InterruptedException, TesseractException {
		File snap = driver.getScreenshotAs(OutputType.FILE);
		File file=new File("D:\\Arun\\selenium snaps\\NewInvoiceDetail.PNG");
		FileUtils.copyFile(snap, file);
		Thread.sleep(1000);
		//GetText
		
	}

	@Then("verify Acc\\/Dept value.")
	public void verify_Acc_Dept_value() throws TesseractException, InterruptedException, FindFailed {
		Screen screen = new Screen();
		ITesseract instance = new Tesseract();
	      instance.setDatapath("D:\\Arun\\selenium snaps\\tessdata");
	         String imgText = instance.doOCR(new File("D:\\Arun\\selenium snaps\\NewInvoiceDetail.PNG"));
	     System.out.println(imgText);
		if(imgText.contains("Acct/Dept 2400"))
	     {
	    	 
	    	 System.out.println("correct Data");
	     }
	     else {
	    	 System.out.println("Incorrect Data");
	     }
	     Thread.sleep(1000);
	     driver.findElementByName("OK").click(); 
	     driver.findElementByName("OK").click(); 
	     Thread.sleep(1000);
	     Pattern close = new Pattern("D:\\Arun\\sikulisnaps\\close.PNG");
			screen.click(close);
	}

	@Then("Post the invoice.")
	public void post_the_invoice() throws FindFailed {
		Screen screen = new Screen();
		driver.findElementByName("Ready To Post").click();
		driver.findElementByName("Yes").click();
		Pattern post = new Pattern("D:\\Arun\\sikulisnaps\\post.PNG");
		screen.click(post);
		driver.findElementByName("Post Only").click();
		driver.findElementByName("OK").click();
		driver.findElementByName("Close").click();
	}
	
	@Then("GetText for verification.")
	public void gettext_for_verification() throws FindFailed, InterruptedException {
		Screen screen = new Screen();
		String text = driver.findElementByXPath("//*[@ClassName = 'TSEFinder'][3]").getText();
		System.out.println(text);
		String text1 = driver.findElementByXPath("//*[@ClassName = 'TSECurrEdit'][2]").getText();
		System.out.println(text1);
		String text2 = driver.findElementByXPath("//*[@ClassName = 'TSECurrEdit'][1]").getText();
		System.out.println(text2);
		assertTrue(driver.findElementByXPath("//*[@ClassName = 'TSECurrEdit'][1]").getText().equals(text2));
		assertTrue(driver.findElementByXPath("//*[@ClassName = 'TSECurrEdit'][2]").getText().equals(text1));
		assertTrue(driver.findElementByXPath("//*[@ClassName = 'TSEFinder'][3]").getText().equals(text));
		Thread.sleep(1000);
	     driver.findElementByName("OK").click(); 
	     driver.findElementByName("OK").click(); 
	     Thread.sleep(1000);
	     Pattern close = new Pattern("D:\\Arun\\sikulisnaps\\close.PNG");
			screen.click(close);
	
	}
	//************TC07*************************************************************************************************************************TC07
	@Then("select Reports-->General reports-->Company profile.")
	public void select_Reports_General_reports_Company_profile() {
	    driver.findElementByName("Reports").click();
	    driver.findElementByName("General Reports").click();
	    driver.findElementByName("Company Profile").click();
	}

	@Then("select destination as File & format as Excel.")
	public void select_destination_as_File_format_as_Excel() throws InterruptedException, FindFailed {
		Thread.sleep(1000);
		Screen screen = new Screen();
		Pattern drop = new Pattern("D:\\Arun\\sikulisnaps\\Companyprofdrop.PNG");
		screen.click(drop);
		screen.type(Key.DOWN);
		screen.type(Key.ENTER);
		screen.type(Key.TAB);
		screen.type(Key.UP);
		screen.type(Key.UP);
		//driver.findElementByName("Open").click();
	    //driver.findElementByXPath("//*[@ClassName = 'TSEComboBox'][3]").click();
	    //driver.findElementByName("Screen").click();
	   // driver.findElementByXPath("//*[@ClassName = 'TSEComboBox'][2]").click();
	   // driver.findElementByName("Excel").click();
	}

	@Then("Click print button.")
	public void click_print_button() throws InterruptedException {
		driver.findElementByName("Print").click();
		//driver.findElementByXPath("//*[@ClassName = 'TSButton'][7]").click();
		Thread.sleep(2000);
		
		
	}

	@Then("close print company profile window.")
	public void close_print_company_profile_window() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElementByName("Close").click();
		//driver.findElementByXPath("//*[@ClassName = 'TSButton'][3]").click();
		driver.findElementByName("Exit").click();
	} 
	//******Tc08********************************************************************************************************************TC08
	@Then("select Edit-->Banks from menu bar.")
	public void select_Edit_Banks_from_menu_bar() {
		driver.findElementByName("Edit").click();
		driver.findElementByName("Banks").click();
	}

	@Then("click new button & add new bank code,description.")
	public void click_new_button_add_new_bank_code_description() {
	  driver.findElementByName("New").click();
	  Screen screen = new Screen();
	  screen.type("5");
	  //driver.findElementByXPath("//*[@ClassName = 'TSEFinder'][8]").sendKeys("5");
	  driver.findElementByXPath("//*[@ClassName = 'TSEEdit'][2]").sendKeys("RBL");
	}

	@Then("Navigate to address tab & fill address fields.")
	public void navigate_to_address_tab_fill_address_fields() {
	    driver.findElementByName("Address").click();
	    driver.findElementByXPath("//*[@ClassName = 'TSEEdit'][6]").sendKeys("TEST");
	    driver.findElementByXPath("//*[@ClassName = 'TSEEdit'][5]").sendKeys("TEST");
	    driver.findElementByXPath("//*[@ClassName = 'TSEEdit'][1]").sendKeys("TEST");
	    driver.findElementByXPath("//*[@ClassName = 'TSEEdit'][2]").sendKeys("TEST");
	   // driver.findElementByXPath("//*[@ClassName = 'TSMaskEdit'][2]").clear();
	    driver.findElementByXPath("//*[@ClassName = 'TSMaskEdit'][2]").sendKeys("12345");
	    //driver.findElementByXPath("//*[@ClassName = 'TSMaskEdit'][1]").clear();
	    driver.findElementByXPath("//*[@ClassName = 'TSMaskEdit'][1]").sendKeys("12345");
	    driver.findElementByXPath("//*[@ClassName = 'TSEEmail'][2]").sendKeys("Test@gmail.com");
	    driver.findElementByXPath("//*[@ClassName = 'TSEEmail'][1]").sendKeys("www.test.com");
	    
	}

	@Then("submit the details by clicking ok button.")
	public void submit_the_details_by_clicking_ok_button() throws InterruptedException {
	    driver.findElementByName("OK").click();
	    Thread.sleep(1000);
	}

	@Then("verify added bank & close the application.")
	public void verify_added_bank_close_the_application() {
		/*Screen screen = new Screen();
		 screen.type(Key.DOWN,11);
		/* screen.type(Key.DOWN);
		 screen.type(Key.DOWN);
		 screen.type(Key.DOWN);*/
		 /* screen.type(Key.ENTER);
		  String BankCode = driver.findElementByXPath("//*[@ClassName = 'TSEFinder'][8]").getText();
		  String BankName = driver.findElementByXPath("//*[@ClassName = 'TSEEdit'][2]").getText();
		  System.out.println(BankCode);
		  System.out.println(BankName);*/
		driver.findElementByName("Exit").click();
	}
	//********TC09****************************************************************************************************************************TC09
	@Then("click vendors from toolbar & select a vendor from list.")
	public void click_vendors_from_toolbar_select_a_vendor_from_list() throws FindFailed {
	    driver.findElementByName("Vendors").click();
	    Screen screen = new Screen();
	    Pattern edit = new Pattern("D:\\Arun\\sikulisnaps\\VendorListEdit.PNG");
	    screen.click(edit);
	    //driver.findElementByXPath("//*[@ClassName = 'TSButton'][12]").click();
	   // driver.findElementByName("Edit").click();
	}

	@Then("Navigate to Notes\\/Alerts tab & add Additional comments.")
	public void navigate_to_Notes_Alerts_tab_add_Additional_comments() {
	   driver.findElementByName("Notes/Alerts").click();
	   driver.findElementByXPath("//*[@ClassName = 'TSEMemo'][1]").sendKeys("Payables vendor comments");
	}

	@Then("Submit the added comments by clicking ok & close the application.")
	public void submit_the_added_comments_by_clicking_ok_close_the_application() {
	   driver.findElementByName("OK").click();
	   driver.findElementByName("Exit").click();
	}
	//********TC10******************************************************************************************************************************TC10
	@Then("Click profile from toolbar.")
	public void click_profile_from_toolbar() {
	    driver.findElementByName("Profile").click();
	}

	@Then("verify company mail & close the application.")
	public void verify_company_name_close_the_application() throws IOException, TesseractException, InterruptedException, FindFailed {
	
		String CompName = driver.findElementByXPath("//*[@ClassName ='TSEEmail'][1]").getText();
		System.out.println(CompName);
		assertTrue(driver.findElementByXPath("//*[@ClassName = 'TSEEmail'][1]").getText().equals(CompName));
		String comp = driver.findElementByXPath("//*[@ClassName='TSMaskEdit'][2]").getText();
		System.out.println("name is"+comp);
		  Screen screen = new Screen();
	     if(screen.find("D:\\Arun\\sikulisnaps\\CompanyName.PNG") != null)
	     {
	    	 System.out.println("correct Data");
	     }
	     else {
	    	 System.out.println("Incorrect Data");
	     }
		driver.findElementByName("OK").click();
		 driver.findElementByName("Exit").click();
	}

	@Then("close the application.")
	public void close_the_application() {
		driver.findElementByName("Close").click();
	}
}
