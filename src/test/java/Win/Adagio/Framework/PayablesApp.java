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
@FindBy(name = "Security Group Setup") WebElement SecurityGroupSetup;
@FindBy(name = "User Setup") WebElement UserSetup;
@FindBy(name = "Edit columns") WebElement Editcolumns;
@FindBy(name = "Edit Gridview") WebElement EditGridview;
@FindBy(name = "Edit PDF setup") WebElement EditPDFsetup;
@FindBy(name = "Backup") WebElement Backup;
@FindBy(name = "Payables Data") WebElement PayablesData;
@FindBy(name = "Related Data") WebElement RelatedData;
@FindBy(name = "Complete Dataset") WebElement CompleteDataset;
@FindBy(name = "Backup Options") WebElement BackupOptions;
@FindBy(name = "Start") WebElement Start;
@FindBy(name = "Export") WebElement Export;
@FindBy(name = "Vendors") WebElement Vendors;
@FindBy(name = "Import") WebElement Import;
@FindBy(name = "Invoices") WebElement Invoices;
@FindBy(name = "Manual Checks") WebElement ManualChecks;
@FindBy(name = "Check") WebElement ClickCheck;
@FindBy(name = "Checks") WebElement Checks;
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
@FindBy(name = "Series") WebElement Series;
@FindBy(name = "Use a separate check series") WebElement CheckSeries;
@FindBy(name = "Rename") WebElement RenameButton;
@FindBy(name = "Customers") WebElement Customers;
@FindBy(name = "View") WebElement View;
@FindBy(name = "Next") WebElement Next;
@FindBy(name = "Find") WebElement Find;
@FindBy(name = "Highlight") WebElement Highlight;
@FindBy(name = "Options") WebElement Options;
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
@FindBy(className = "TEdit") WebElement BatchName;
@FindBy(name = "Ready To Post") WebElement ReadyToPost;
@FindBy(name = "Post Only") WebElement PostOnly;
@FindBy(name = "Copy") WebElement CopyButton;
@FindBy(name = "Move document") WebElement MoveDoc;
@FindBy(name = "New batch") WebElement NewBatch;
@FindBy(name = "Adjust") WebElement Adjust;
@FindBy(name = "Notes/Alerts") WebElement NotesAlerts;
@FindBy(className = "TSEMemo") WebElement AddVendorNotes;
@FindBy(name = "Favorite Reports") WebElement FavoriteReports;
@FindBy(name = "AgedOpenPayablesSummary") WebElement AgedOpenPayablesSummary;
@FindBy(name = "AgedOverduePayablesSummary") WebElement AgedOverduePayablesSummary;
@FindBy(name = "APAdjustmentBatchListing") WebElement APAdjustmentBatchListing;
@FindBy(name = "APAdjustmentPostingJournal") WebElement APAdjustmentPostingJournal;
@FindBy(name = "APCheckReconPostingJournal") WebElement APCheckReconPostingJournal;
@FindBy(name = "APGLTransactionsByAccount") WebElement APGLTransactionsByAccount;
@FindBy(name = "APGLTransactionsByDate") WebElement APGLTransactionsByDate;
@FindBy(name = "APGLTransactionsByEntry") WebElement APGLTransactionsByEntry;
@FindBy(name = "APInvoiceBatchListing") WebElement APInvoiceBatchListing;
@FindBy(name = "APInvoicePostingJournal") WebElement APInvoicePostingJournal;
@FindBy(name = "APManCheckBatchListing") WebElement APManCheckBatchListing;
@FindBy(name = "APManualCheckPostingJournal") WebElement APManualCheckPostingJournal;
@FindBy(name = "APSystemCheckRegister") WebElement APSystemCheckRegister;
@FindBy(name = "Payments") WebElement Payments;
@FindBy(name = "Archived Manual Checks") WebElement ArchivedManualChecks;


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
	
	//*********************************************************************************************Invoice TC26********************
	public void InvoiceIcon_Click() throws InterruptedException {
		Thread.sleep(2000);
		Invoices.click();
	}
	public void NewBatch_Desc(String Desc) {
		New.click();
		BatchName.sendKeys(Desc);
		Ok();
	}
	public void EnterVendor_code(String Vendor_Code) {
		TSEFinder4.sendKeys(Vendor_Code);
		/*Screen screen = new Screen();
		screen.type("BEN01");*/
	}
	public void Dist_Details(String Dist_Code,String Amount) {
		New.click();
		TSEFinder4.sendKeys(Dist_Code);
		TSEMCCurrEdit2.sendKeys(Amount);
		Ok();
	}
	public void Ok_Close() throws FindFailed{
		Ok();
		Screen screen = new Screen();
		Pattern Sik_CloseButton = new Pattern("D:\\Arun\\sikulisnaps\\close.PNG");
		screen.wait(Sik_CloseButton,30);
		screen.click(Sik_CloseButton);
	}
	//******************************************************************************************Invoice Edit TC27******************
	public void Invoice_Edit() throws FindFailed, InterruptedException {
		Screen screen = new Screen();
		Pattern Sik_CloseButton = new Pattern("D:\\Arun\\sikulisnaps\\APInvoice.PNG");
		screen.wait(Sik_CloseButton,30);
		screen.click(Sik_CloseButton);
		Pattern Edit = new Pattern("D:\\Arun\\sikulisnaps\\Edit.PNG");
		screen.click(Edit);
		Thread.sleep(1000);
		screen.click(Edit);
		TSEEdit5.sendKeys("AP Invoice");
	}
	//********************************************************************************************In post TC28*********************
	public void Invoice_post() throws FindFailed {
		Screen screen = new Screen();
		Pattern Sik_CloseButton = new Pattern("D:\\Arun\\sikulisnaps\\APInvoice.PNG");
		screen.wait(Sik_CloseButton,30);
		screen.click(Sik_CloseButton);
		//ReadyToPost.click();
		Pattern PostBatch = new Pattern("D:\\Arun\\sikulisnaps\\post.PNG");
		screen.click(PostBatch);
		PostOnly.click();
		Ok();
	}
	//*****************************************************************************************Credit note TC29*********************
	public void CreditNote_Vendor() {
		Screen screen = new Screen();
		screen.type(Key.TAB);
		screen.type(Key.DOWN);	
	}
	public void DocumNo(String DocumNo) {
		Screen screen = new Screen();
		screen.type(Key.TAB);
		screen.type(Key.TAB);
		screen.type(DocumNo);
	}
	public void PostCredit_Note() throws FindFailed {
		Screen screen = new Screen();
		ReadyToPost.click();
		Pattern PostBatch = new Pattern("D:\\Arun\\sikulisnaps\\post.PNG");
		screen.click(PostBatch);
		PostOnly.click();
		Ok();
	}
	//************************************************************************************Debit note TC30*****************************
	public void DebitNote_Vendor(){
		Screen screen = new Screen();
		screen.type(Key.TAB);
		screen.type(Key.DOWN);
		screen.type(Key.DOWN);
	}
	//**************************************************************************Check  pay TC31****************************************
	public void ChecksIcon_Click() throws InterruptedException {
		Thread.sleep(2000);
		Checks.click();
	}
	public void SelectBank_And_Desc(String BankCode,String BatchName){
		New.click();
		TSEFinder1.clear();
		TSEFinder1.sendKeys(BankCode);
		TSEEdit2.clear();
		TSEEdit2.sendKeys(BatchName);
		Ok();
	}
	public void CheckPayVendor_Details(String Vendor_Code,String CheckNo,String PayDesc) throws InterruptedException, FindFailed {
		//TSEFinder5.sendKeys(Vendor_Code);
		Screen screen = new Screen();
		screen.type(Vendor_Code);
		Pattern CheckNumber = new Pattern("D:\\Arun\\sikulisnaps\\CheckNumber.PNG");
		screen.type(CheckNumber,CheckNo);
		//TSEFinder4.sendKeys(CheckNo);
		TSEEdit3.sendKeys(PayDesc);
		screen.type(Key.TAB);
		screen.type(Key.TAB);
		screen.type(Key.TAB);
		screen.type(Key.TAB);
		screen.type(Key.TAB);
		screen.type(Key.SPACE);
	}
	//*******************************************************************************Cash invoice TC32*********************************
	public void CashInvoice(String Vendor_Code,String CheckNo,String PayDesc,String CasIn) throws FindFailed, InterruptedException {
		Thread.sleep(1500);
		Screen screen = new Screen();
		screen.type(Vendor_Code);
		screen.type(Key.TAB);
		screen.type(Key.TAB);
		screen.type(Key.UP);
		screen.type(Key.TAB);
		screen.type(CasIn);
		Pattern CheckNumber = new Pattern("D:\\Arun\\sikulisnaps\\CheckNumber.PNG");
		screen.type(CheckNumber,CheckNo);
	}
		public void Wait() throws InterruptedException {
			Thread.sleep(2000);
		}
	
	//*************************************************************************Prepayment TC33******************************************
	public void PrePayment(String Vendor_Code,String CheckNo,String PayDesc) throws FindFailed, InterruptedException {
		Thread.sleep(1500);
		Screen screen = new Screen();
		screen.type(Vendor_Code);
		screen.type(Key.TAB);
		screen.type(Key.TAB);
		screen.type(Key.DOWN);
		Pattern CheckNumber = new Pattern("D:\\Arun\\sikulisnaps\\CheckNumber.PNG");
		screen.type(CheckNumber,CheckNo);
	}
	public void PrePay_Amount(String Amount) throws FindFailed, InterruptedException {
		Thread.sleep(1500);
		Screen screen = new Screen();
		Pattern Edit = new Pattern("D:\\Arun\\sikulisnaps\\Edit.PNG");
		screen.click(Edit);
		screen.type(Key.TAB);
		screen.type(Amount);
		Ok();
	}
	//*********************************************************************copy batch Tc38************************************************
	public void CopyBatch_Exis() {
		CopyButton.click();
	}
	//*********************************************************************edit bank check series TC39*************************************
	public void EditBank() {
		MenuBarEdit.click();
		Banks.click();
	}
	public void EditButtonClick() throws FindFailed {
		Screen screen = new Screen();
		screen.type(Key.ENTER);
	}
	public void CheckSeries(String CheckSerNo) throws InterruptedException {
		Series.click();
		CheckSeries.click();
		Screen screen = new Screen();
		screen.type(Key.TAB);
		screen.type("20");
		Ok();
	}
	//**************************************************************Check batch for Auto check no TC40****************************************
	public void CheckPayVendor_DetailsAutoCHKNO(String Vendor_Code,String PayDesc) throws InterruptedException, FindFailed {
		//TSEFinder5.sendKeys(Vendor_Code);
		Screen screen = new Screen();
		screen.type(Vendor_Code);
		TSEEdit3.sendKeys(PayDesc);
		screen.type(Key.TAB);
		screen.type(Key.TAB);
		screen.type(Key.TAB);
		screen.type(Key.TAB);
		screen.type(Key.TAB);
		screen.type(Key.SPACE);
	}
	//****************************************************************************Adjustment batch TC41************************************
	public void AdjustIcon_Click() throws InterruptedException {
		Thread.sleep(2000);
		Adjust.click();
	}
	public void AdjustVendor_code(String Vendor_Code,String AdjustNo) {
		Screen screen = new Screen();
		screen.type(Vendor_Code);
		//TSEFinder5.sendKeys(Vendor_Code);
		screen.type(Key.TAB);
		screen.type(AdjustNo);
		//TSEFinder3.sendKeys(AdjustNo);
	}
	public void Adjust_Dist_Details(String Dist_Code,String CreditAmount) {
		New.click();
		TSEFinder4.sendKeys(Dist_Code);
		TSEMCCurrEdit3.sendKeys(CreditAmount);
		Ok();
	}
	public void Adjust_post() throws FindFailed {
		Screen screen = new Screen();
		ReadyToPost.click();
		Pattern PostBatch = new Pattern("D:\\Arun\\sikulisnaps\\post.PNG");
		screen.click(PostBatch);
		PostOnly.click();
		Ok();
	}
	//*************************************************************File menu TC42-TC4 ***********************************************
	public void DataIntegrityCheck() {
		File.click();
		Integrity.click();
	}
	public void ClickCheck() throws FindFailed {
		ClickCheck.click();
		Ok();
		CloseButton1();
	}
	public void SecurityGroupSetup() {
		File.click();
		SecurityGroupSetup.click();
	}
	public void SecurityGroup_Details() throws FindFailed {
		New.click();
		TSEFinder1.sendKeys("yys");
		TSEEdit1.sendKeys("sys security group");
		Screen screen = new Screen();
		Pattern SGroupHelp = new Pattern("D:\\Arun\\sikulisnaps\\SGroupHelp.PNG");
		screen.click(SGroupHelp);
		Ok();
	}
	public void File_UserSetup() {
		File.click();
		UserSetup.click();
	}
	public void NewUser_Details() {
		New.click();
		TSEEdit3.sendKeys("yys");
		TSEEdit2.sendKeys("System Account1");
		TSEEdit1.sendKeys("sys");
		TSEFinder1.sendKeys("yys");
		Editcolumns.click();
		EditGridview.click();
		EditPDFsetup.click();
		Ok();
	}
	public void NewUser_Login() {
		OpenClick();
		TSEEdit4.sendKeys("yys");
		OpenClick();
		Ok();
	}
	public void OldUser_Login() {
		OpenClick();
		//Login();
		TSEEdit4.clear();
		TSEEdit4.sendKeys("sys");
		OpenClick();
		
	}
	public void Login_Open() {
		File.click();
		ClickOpen.click();
		Set<String> allwin = driver.getWindowHandles();
		List<String> windows = new ArrayList<String>(allwin);
		String wind = windows.get(0);
		driver.switchTo().window(wind);
		ClickOpen.click();
	}
	public void Backup_Payables() {
		File.click();
		Backup.click();
		PayablesData.click();
	}
	public void Backup_Related() {
		File.click();
		Backup.click();
		RelatedData.click();
	}
	public void Backup_CompleteData() {
		File.click();
		Backup.click();
		CompleteDataset.click();
	}
	public void Backup_BackupOptions() {
		File.click();
		Backup.click();
		BackupOptions.click();
		Ok();
	}
	public void Start_Backup() throws FindFailed, InterruptedException {
		Screen screen = new Screen();
		screen.type("S", Key.ALT);
		Thread.sleep(10000);
		screen.type(Key.ENTER);
		CloseButton1();
	}
	public void File_Export_Vendors() {
		File.click();
		Export.click();
		Vendors.click();
	}public void Export_Vendors() throws InterruptedException, FindFailed {
		Screen screen = new Screen();
		Export.click();
		Thread.sleep(1000);
		screen.type("S", Key.ALT);
		screen.type(Key.ENTER);
		Ok();
		CloseButton1();
	}
	//*************************************************************Archive Invoice TC52*****************************
	public void Archive_Invoice() {
		EditButton.click();
		ArchivedInvoices.click();
	}
	public void CopyBatch_Archive() {
		CopyButton.click();
		Ok();
	}
	public void EnterVendor_Archive(String Vendor_Code,String DocNo) throws InterruptedException {
		TSEFinder4.sendKeys(Vendor_Code);
		Screen screen = new Screen();
		screen.type(Key.TAB);
		screen.type(Key.TAB);
		screen.type(DocNo);
	}
	public void ArchiveInvoice_post() throws FindFailed {
		Screen screen = new Screen();
		Pattern Sik_CloseButton = new Pattern("D:\\Arun\\sikulisnaps\\ArchiveInvoice.PNG");
		screen.wait(Sik_CloseButton,30);
		screen.click(Sik_CloseButton);
		//ReadyToPost.click();
		Pattern PostBatch = new Pattern("D:\\Arun\\sikulisnaps\\post.PNG");
		screen.click(PostBatch);
		PostOnly.click();
		Ok();
	}
	//*************************************************************Archive Manual check TC53*****************************
	public void Archive_ManualCheck() {
		Payments.click();
		ArchivedManualChecks.click();
	}
	public void ArchiveManualCheck_post() throws FindFailed {
		Screen screen = new Screen();
		Pattern Sik_CloseButton = new Pattern("D:\\Arun\\sikulisnaps\\APArchiveCheck.PNG");
		screen.wait(Sik_CloseButton,30);
		screen.click(Sik_CloseButton);
		//ReadyToPost.click();
		Pattern PostBatch = new Pattern("D:\\Arun\\sikulisnaps\\post.PNG");
		screen.click(PostBatch);
		PostOnly.click();
		Ok();
	}
	//******************************************Add vendor notes TC54**************************************************************
	public void VendorsIcon_Click() throws InterruptedException {
		Thread.sleep(2000);
		Vendors.click();
	}
	public void AddVendor_Notes() {
		Screen screen = new Screen();
		screen.type(Key.ENTER);
		NotesAlerts.click();
		AddVendorNotes.sendKeys("Vendor Notes");
		Ok();
	}
	//****************************************Favorite Reports TC55 - TC66 ***********************************************************
	public void AgedOpenPayablesSummary() {
		Reports.click();
		FavoriteReports.click();
		AgedOpenPayablesSummary.click();
	}
	public void AgedOverduePayablesSummary() {
		Reports.click();
		FavoriteReports.click();
		AgedOverduePayablesSummary.click();
	}
	public void APAdjustmentBatchListing() {
		Reports.click();
		FavoriteReports.click();
		APAdjustmentBatchListing.click();
	}
	public void APAdjustmentPostingJournal() {
		Reports.click();
		FavoriteReports.click();
		APAdjustmentPostingJournal.click();
	}
	public void APGLTransactionsByAccount() {
		Reports.click();
		FavoriteReports.click();
		APGLTransactionsByAccount.click();
	}
	public void APGLTransactionsByDate() {
		Reports.click();
		FavoriteReports.click();
		APGLTransactionsByDate.click();
	}
	public void APGLTransactionsByEntry() {
		Reports.click();
		FavoriteReports.click();
		APGLTransactionsByEntry.click();
	}
	public void APInvoiceBatchListing() {
		Reports.click();
		FavoriteReports.click();
		APInvoiceBatchListing.click();
	}
	public void APInvoicePostingJournal() {
		Reports.click();
		FavoriteReports.click();
		APInvoicePostingJournal.click();
	}
	public void APManCheckBatchListing() {
		Reports.click();
		FavoriteReports.click();
		APManCheckBatchListing.click();
	}
	public void APManualCheckPostingJournal() {
		Reports.click();
		FavoriteReports.click();
		APManualCheckPostingJournal.click();
	}
	public void APSystemCheckRegister() {
		Reports.click();
		FavoriteReports.click();
		APSystemCheckRegister.click();
	}
	//*****************************************************Reports efcodes TC67 - TC ***********************************
	public void Give_epcodes(String epcodes) throws FindFailed, InterruptedException {
		Options.click();
		TSEEdit1.clear();
		TSEEdit1.sendKeys(epcodes);
		Ok();
		EP_Icon_Print();
		CloseButton();
	}
	//******************************************************************************************************************
	public void Appexit() {
		Exitapp.click();
	}
}
