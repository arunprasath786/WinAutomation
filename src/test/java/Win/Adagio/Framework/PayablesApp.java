package Win.Adagio.Framework;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
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
import cucumber.api.java.en.When;

public class PayablesApp extends BaseClass{
	//public  WiniumDriver driver;
	
	public PayablesApp() {
		PageFactory.initElements(driver, this);
	}
@FindBy(className = "TSEEdit") WebElement password; 
@FindBy(name = "OK") WebElement ClickOk; 
@FindBy(name = "Open") WebElement ClickOpen; 
@FindBy(name = "Exit") WebElement Exitapp;
@FindBy(name = "File") WebElement File;
@FindBy(name = "Data Integrity Check") WebElement Integrity;
@FindBy(name = "Check") WebElement ClickCheck;
@FindBy(name = "Close") WebElement CloseApp;
@FindBy(name = "Reports") WebElement Reports;
@FindBy(name = "Maintenance Reports") WebElement MainReports;
@FindBy(name = "Print") WebElement Print;
@FindBy(name = "Information") WebElement Information;
@FindBy(name = "No") WebElement No;
@FindBy(name = "Yes") WebElement Yes;
@FindBy(className = "TSEFinder") WebElement BankReference;
@FindBy(className = "TSEFinder") WebElement TSEFinder1;
@FindBy(className = "TMEFinder") WebElement TMEFinder1;
@FindBy(xpath = "//*[@ClassName = 'TSEFinder'][2]")  WebElement TSEFinder2;
@FindBy(xpath = "//*[@ClassName = 'TSEFinder'][3]")  WebElement TSEFinder3;
@FindBy(xpath = "//*[@ClassName = 'TSEFinder'][4]")  WebElement TSEFinder4;
@FindBy(xpath = "//*[@ClassName = 'TSEMCCurrEdit'][1]")  WebElement TSEMCCurrEdit1;
@FindBy(xpath = "//*[@ClassName = 'TSEMCCurrEdit'][2]")  WebElement TSEMCCurrEdit2;
@FindBy(xpath = "//*[@ClassName = 'TSEMCCurrEdit'][3]")  WebElement TSEMCCurrEdit3;
@FindBy(name = "Confirm") WebElement Confirm;
@FindBy(name = "User Setup") WebElement UserSetup;
@FindBy(name = "New") WebElement New;
@FindBy(xpath = "//*[@ClassName = 'TSEEdit'][1]")  WebElement TSEEdit1;
@FindBy(xpath = "//*[@ClassName = 'TSEEdit'][2]")  WebElement TSEEdit2;
@FindBy(xpath = "//*[@ClassName = 'TSEEdit'][3]")  WebElement TSEEdit3;
@FindBy(xpath = "//*[@ClassName = 'TSEEdit'][4]")  WebElement TSEEdit4;
@FindBy(xpath = "//*[@ClassName = 'TSEEdit'][5]")  WebElement TSEEdit5;
@FindBy(xpath = "//*[@ClassName = 'TSEEdit'][7]")  WebElement TSEEdit7;
@FindBy(className = "Edit") WebElement Edit;
@FindBy(name = "Edit") WebElement EditButton;
@FindBy(name = "Rename") WebElement RenameButton;
@FindBy(name = "Customers") WebElement Customers;
@FindBy(name = "View") WebElement View;
@FindBy(name = "Next") WebElement Next;
@FindBy(name = "Find") WebElement Find;
@FindBy(name = "Highlight") WebElement Highlight;
@FindBy(name = "Options") WebElement Options;
@FindBy(name = "Copy") WebElement CopyButton;
@FindBy(name = "Batch Listings") WebElement BatchListings;
@FindBy(name = "Invoice Batch List") WebElement InvoiceBList;
@FindBy(name = "Manual Check Batch List") WebElement ManualCheckBList;
@FindBy(name = "Adjustment Batch List") WebElement AdjustmentBList;
@FindBy(name = "Letters") WebElement Letter;
@FindBy(name = "Print/Consolidate G/L Transactions") WebElement PCGLTxion;
@FindBy(name = "Transaction and Analysis Reports") WebElement TXAnaReport;
@FindBy(name = "Open Payables") WebElement OpenPay;
@FindBy(name = "Aged Open Payables") WebElement AgedOpenPay;
@FindBy(name = "Aged Overdue Payables") WebElement AgedOverduePay;
@FindBy(name = "Aged Cash Requirements") WebElement AgedCashReq;
@FindBy(name = "Vendor Transactions") WebElement VendorTxion;
@FindBy(name = "Vendor List") WebElement VendorList;
@FindBy(name = "Tax Tracking") WebElement TaxTracking;
@FindBy(name = "Blank Check Stock") WebElement BCheckStock;
@FindBy(name = "1099's") WebElement R1099;
@FindBy(name = "5018's") WebElement R5018;
@FindBy(name = "General Reports") WebElement GReports;
@FindBy(name = "Company Profile") WebElement Cprofile;
@FindBy(name = "Banks") WebElement Banks;
@FindBy(name = "Distributions") WebElement Distributions;
@FindBy(name = "Distribution Sets") WebElement DSets;
@FindBy(name = "Vendor Notes") WebElement VendorNotes;
@FindBy(name = "Batch Status") WebElement BatchStatus;
@FindBy(name = "System Check Status") WebElement SCheckStatus;
@FindBy(name = "Control Accounts") WebElement CAccounts;
@FindBy(name = "Terms") WebElement Terms;
@FindBy(name = "1099/5018 Forms Types") WebElement P10995018;
@FindBy(name = "Report Groups") WebElement RGroups;

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
		password.sendKeys("sys");
	}
	public void Ok() {
		ClickOk.click();
	}
	public void OpenClick() {
		ClickOpen.click();
	}
	public void Snapshot() throws IOException {
		File snap = driver.getScreenshotAs(OutputType.FILE);
		File file=new File("D:\\Arun\\selenium snaps\\login.PNG");
		FileUtils.copyFile(snap, file);
	}
	//*************************************************************************************TC02*************************
	public void InvoiceBList_Report() {
		Reports.click();
		BatchListings.click();
		InvoiceBList.click();
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
	//**************************************************************************************TC03*************************
	public void ManualCBList_Report() {
		Reports.click();
		BatchListings.click();
		ManualCheckBList.click();
	}
	//***************************************************************************************TC04*************************
	public void Letters_Report() {
		Reports.click();
		Screen screen = new Screen();
		screen.type(Key.DOWN);
		screen.type(Key.DOWN);
		screen.type(Key.ENTER);
	}
	//****************************************************************************************TC05************************
	public void OPenPayables_Report() {
		Reports.click();
		TXAnaReport.click();
		OpenPay.click();
	}
	//*****************************************************************************************TC06*********************
	public void AgedOPenPayables_Report() {
		Reports.click();
		TXAnaReport.click();
		AgedOpenPay.click();
	}
	//******************************************************************************************TC07*********************
	public void AgedOverduePayables_Report() {
		Reports.click();
		TXAnaReport.click();
		AgedOverduePay.click();
	}
	//*****************************************************************************************TC08***********************
	public void AgedCashReq_Report() {
		Reports.click();
		TXAnaReport.click();
		AgedCashReq.click();
	}
	//*****************************************************************************************TC09*********************
	public void VendorTxion_Report(){
		Reports.click();
		TXAnaReport.click();
		VendorTxion.click();
	}
	//*****************************************************************************************TC10********************
	public void VendorList_Report(){
		Reports.click();
		TXAnaReport.click();
		VendorList.click();
	}
	//*****************************************************************************************TC11********************
	public void TaxTracking_Report(){
		Reports.click();
		TXAnaReport.click();
		TaxTracking.click();
	}
	public void GLReport_Dontclear() throws FindFailed, InterruptedException {
		EP_Icon_Print();
		No.click();
		CloseButton();
	}
	//********************************************************************************************TC12********************
	public void PCGLTxion_Report() {
		Reports.click();
		PCGLTxion.click();
	}
	//**********************************************************************************************TC13&14****************
	
	public void R1099_Report() {
		Reports.click();
		R1099.click();
	}
	public void R5018_Report() {
		Reports.click();
		R5018.click();
	}
	public void R10995018_Report() throws FindFailed, InterruptedException {
		EP_Icon_Print();
		Yes.click();
		Ok();
		CloseButton1();
	}
	//*********************************************************************************************TC15 - 25*******************
	public void BatchStatus_Report() {
		Reports.click();
		GReports.click();
		Cprofile.click();
	}
	public void SystemCheckStatus_Report(){
		Reports.click();
		GReports.click();
		SCheckStatus.click();
	}
	public void CompanyProfile_Report() {
		Reports.click();
		GReports.click();
		Cprofile.click();
	}
	public void Banks_Report() {
		Reports.click();
		GReports.click();
		Banks.click();
	}
	public void Distributions_Report() {
		Reports.click();
		GReports.click();
		Distributions.click();
	}
	public void DistributionSets_Report() {
		Reports.click();
		GReports.click();
		DSets.click();
	}
	public void ControlAccounts_Report() {
		Reports.click();
		GReports.click();
		CAccounts.click();
	}
	public void Terms_Report() {
		Reports.click();
		GReports.click();
		Terms.click();
	}
	public void VendorNotes_Report() {
		Reports.click();
		GReports.click();
		VendorNotes.click();
	}
	public void FormTypes_Report() {
		Reports.click();
		GReports.click();
		P10995018.click();
	}
	public void ReportGroups_Report() {
		Reports.click();
		GReports.click();
		RGroups.click();
	}
	
	//*********************************************************************************************TC********************
	

	
	//******************************************************************************************************************
	public void Appexit() {
		Exitapp.click();
	}
}
