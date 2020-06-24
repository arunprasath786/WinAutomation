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
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import Base.BaseClass;

public class Invoices extends BaseClass{
	public Invoices() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className = "TSEEdit") WebElement password; 
	@FindBy(className = "TEdit") WebElement BatchDesc; 
	@FindBy(name = "OK") WebElement ClickOk; 
	@FindBy(name = "Open") WebElement ClickOpen; 
	@FindBy(name = "Exit") WebElement Exitapp;
	@FindBy(name = "File") WebElement File;
	@FindBy(name = "Data Integrity Check") WebElement Integrity;
	@FindBy(name = "Security Group Setup") WebElement SecurityGroupSetup;
	@FindBy(name = "User Setup") WebElement UserSetup;
	@FindBy(name = "Backup") WebElement Backup;
	@FindBy(name = "Related Data") WebElement RelatedData;
	@FindBy(name = "Complete Dataset") WebElement CompleteDataset;
	@FindBy(name = "Backup Options") WebElement BackupOptions;
	@FindBy(name = "Start") WebElement Start;
	@FindBy(name = "Export") WebElement Export;
	@FindBy(name = "Vendors") WebElement Vendors;
	@FindBy(name = "Import") WebElement Import;
	@FindBy(name = "Invoices") WebElement Invoices;
	@FindBy(name = "Close") WebElement CloseApp;
	@FindBy(name = "Maintenance Reports") WebElement MainReports;
	@FindBy(name = "Print") WebElement Print;
	@FindBy(name = "Information") WebElement Information;
	@FindBy(name = "No") WebElement No;
	@FindBy(name = "Yes") WebElement Yes;
	@FindBy(className = "TSEFinder") WebElement BankReference;
	@FindBy(className = "TSEFinder") WebElement TSEFinder1;
	@FindBy(className = "TMEFinder") WebElement TMEFinder1;
	@FindBy(xpath = "//*[@ClassName = 'TMEFinder'][2]") WebElement TMEFinder2;
	@FindBy(xpath = "//*[@ClassName = 'TSEFinder'][2]")  WebElement TSEFinder2;
	@FindBy(xpath = "//*[@ClassName = 'TSEFinder'][3]")  WebElement TSEFinder3;
	@FindBy(xpath = "//*[@ClassName = 'TSEFinder'][4]")  WebElement TSEFinder4;
	@FindBy(xpath = "//*[@ClassName = 'TSEFinder'][5]")  WebElement TSEFinder5;
	@FindBy(xpath = "//*[@ClassName = 'TSEFinder'][6]")  WebElement TSEFinder6;
	@FindBy(xpath = "//*[@ClassName = 'TSEMCCurrEdit'][1]")  WebElement TSEMCCurrEdit1;
	@FindBy(xpath = "//*[@ClassName = 'TSEMCCurrEdit'][2]")  WebElement TSEMCCurrEdit2;
	@FindBy(xpath = "//*[@ClassName = 'TSEMCCurrEdit'][3]")  WebElement TSEMCCurrEdit3;
	@FindBy(xpath = "//*[@ClassName = 'TSECurrEdit'][1]")  WebElement TSECurrEdit1;
	@FindBy(xpath = "//*[@ClassName = 'TSECurrEdit'][2]")  WebElement TSECurrEdit2;
	@FindBy(xpath = "//*[@ClassName = 'TSECurrEdit'][3]")  WebElement TSECurrEdit3;
	@FindBy(name = "Confirm") WebElement Confirm;
	@FindBy(name = "New") WebElement New;
	@FindBy(xpath = "//*[@ClassName = 'TSEEdit'][1]")  WebElement TSEEdit1;
	@FindBy(xpath = "//*[@ClassName = 'TSEEdit'][2]")  WebElement TSEEdit2;
	@FindBy(xpath = "//*[@ClassName = 'TSEEdit'][3]")  WebElement TSEEdit3;
	@FindBy(xpath = "//*[@ClassName = 'TSEEdit'][4]")  WebElement TSEEdit4;
	@FindBy(xpath = "//*[@ClassName = 'TSEEdit'][5]")  WebElement TSEEdit5;
	@FindBy(xpath = "//*[@ClassName = 'TSEEdit'][7]")  WebElement TSEEdit7;
	@FindBy(className = "Edit") WebElement Edit;
	@FindBy(name = "Archived Invoices") WebElement ArchivedInvoices;
	@FindBy(name = "Edit") WebElement EditButton;
	@FindBy(name = "Edit") WebElement MenuBarEdit;
	@FindBy(name = "Rename") WebElement RenameButton;
	@FindBy(name = "Customers") WebElement Customers;
	@FindBy(name = "View") WebElement View;
	@FindBy(name = "Next") WebElement Next;
	@FindBy(name = "Find") WebElement Find;
	@FindBy(name = "Highlight") WebElement Highlight;
	@FindBy(name = "Options") WebElement Options;
	@FindBy(name = "Banks") WebElement Banks;
	@FindBy(name = "Distributions") WebElement Distributions;
	@FindBy(name = "Distribution Sets") WebElement DSets;
	@FindBy(name = "Vendor Notes") WebElement VendorNotes;
	@FindBy(name = "Ready To Post") WebElement ReadyToPost;
	@FindBy(name = "Post Only") WebElement PostOnly;
	@FindBy(name = "Copy") WebElement CopyButton;
	@FindBy(name = "Move document") WebElement MoveDoc;
	@FindBy(name = "New batch") WebElement NewBatch;
	@FindBy(name = "Reports") WebElement Reports;
	@FindBy(name = "Invoice Listing") WebElement InvoiceListing;
	@FindBy(name = "Tax Summary") WebElement TaxSummary;
	@FindBy(name = "Tax Tracking") WebElement TaxTracking;
	@FindBy(name = "History Listing") WebElement HistoryListing;
	@FindBy(name = "Deleted Invoices Audit List") WebElement DeletedInvoicesAuditList;
	@FindBy(name = "General Reports") WebElement GeneralReports;
	@FindBy(name = "Company Profile") WebElement Companyprofile;
	@FindBy(name = "Batch Status") WebElement BatchStatus;
	@FindBy(name = "Tax Tables") WebElement TaxTables;
	@FindBy(name = "Item Listing") WebElement ItemListing;
	@FindBy(name = "Text Listing") WebElement TextListing;
	
	
	public void launchApp() throws MalformedURLException, InterruptedException {
		DesktopOptions options = new DesktopOptions();
		options.setApplicationPath("C:\\Softrak\\Invoices\\Invoices.exe");
		driver = new WiniumDriver(new URL("http://127.0.0.1:4723/"),options);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(1000);
	}
	
	public void Login() {
		Set<String> allwin = driver.getWindowHandles();
		List<String> windows = new ArrayList<String>(allwin);
		String wind = windows.get(0);
		driver.switchTo().window(wind);
		password.sendKeys("sys");
	}
	public void Ok() {
		ClickOk.click();
	}
	public void OpenClick() {
		ClickOpen.click();
	}
	
	public void EP_Icon_Print() throws FindFailed, InterruptedException {
		Screen screen = new Screen();
		Pattern EP_Icon_Print = new Pattern("D:\\Arun\\sikulisnaps\\EP_Icon_Print.PNG");
		screen.click(EP_Icon_Print);
		Thread.sleep(14000);
	}
	public void CloseButton() throws FindFailed {
		Screen screen = new Screen();
		Pattern Sik_CloseButton = new Pattern("D:\\Arun\\sikulisnaps\\CloseButton.PNG");
		screen.wait(Sik_CloseButton,30);
		screen.click(Sik_CloseButton);
	}
	public void CloseButton1() throws FindFailed {
		Screen screen = new Screen();
		Pattern Sik_CloseButton = new Pattern("D:\\Arun\\sikulisnaps\\CloseButton1.PNG");
		screen.wait(Sik_CloseButton,30);
		screen.click(Sik_CloseButton);
	}
	//**********************************************************TC02 invoice batch*******************************
	public void Invoices_IconClick(){
		Invoices.click();
	}
	public void Batch_Desc() {
		New.click();
		BatchDesc.sendKeys("InvoiceBatch");
		Ok();
	}
	public void Customer_Details(String CustomerCode) {
		TSEFinder3.sendKeys(CustomerCode);
		Ok();
	}
	public void Items_Include() throws InterruptedException {
		Thread.sleep(2000);
		Screen screen = new Screen();
		screen.type("i", Key.ALT);
		New.click();
	}
	public void ItemCodes(String itemcode) {
		TSEFinder2.sendKeys(itemcode);
		Ok();
		Ok();
	}
	public void Close_Windows() {
		Screen screen = new Screen();
		screen.type("c", Key.ALT);
		screen.type("c", Key.ALT);
	}
	public void Post_Batch() throws FindFailed {
		Screen screen = new Screen();
		Pattern PostBatch = new Pattern("D:\\Arun\\sikulisnaps\\post.PNG");
		screen.click(PostBatch);
		PostOnly.click();
		Ok();
	}
	public void Report_Print() throws FindFailed, InterruptedException {
		EP_Icon_Print();
		CloseButton();
	}
	//*******************************************************TC03 IN credit note******************************************
	public void IN_CreditNote(String CustomerCode) throws FindFailed {
		Screen screen = new Screen();
		Pattern Invoice = new Pattern("D:\\Arun\\sikulisnaps\\Invoice.PNG");
		screen.click(Invoice);
		screen.type(Key.DOWN);
		screen.type(Key.ENTER);
		TSEFinder3.sendKeys(CustomerCode);
		Ok();
	}
	//*******************************************************TC04 IN with inventory code************************************
	public void InventoryItem_Details(String inventorycode) {
		Screen screen = new Screen();
		screen.type("i", Key.ALT);
		screen.type(inventorycode);
		screen.type(Key.TAB);
		//TMEFinder2.sendKeys(inventorycode);
		Ok();
		Ok();
	}
	//********************************************************TC06 - TC15  Reports Menu*************************************
	public void InvoiceListing() {
		Reports.click();
		InvoiceListing.click();
	}
	public void TaxSummary() {
		Reports.click();
		TaxSummary.click();
	}
	public void No() {
		No.click();
	}
	public void TaxTracking() {
		Reports.click();
		TaxTracking.click();
	}
	public void HistoryListing() {
		Reports.click();
		HistoryListing.click();
	}
	public void wait2mins() throws InterruptedException {
		Thread.sleep(120000);
	}
	public void DeletedInvoicesAuditList() {
		Reports.click();
		DeletedInvoicesAuditList.click();
	}
	public void BatchStatus() {
		Reports.click();
		GeneralReports.click();
		BatchStatus.click();
	}
	public void Companyprofile() {
		Reports.click();
		GeneralReports.click();
		Companyprofile.click();
	}
	public void TaxTables() {
		Reports.click();
		GeneralReports.click();
		TaxTables.click();
	}
	public void ItemListing() {
		Reports.click();
		GeneralReports.click();
		ItemListing.click();
	}
	public void TextListing() {
		Reports.click();
		GeneralReports.click();
		TextListing.click();
	}
	//******************************************************************Close/exit app**************************
	public void Appexit() {
		Exitapp.click();
	}

}
