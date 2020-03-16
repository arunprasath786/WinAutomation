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

public class BankRec extends BaseClass{
	public BankRec() {
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
	@FindBy(name = "Company Profile") WebElement Cprofile;
	@FindBy(name = "Banks") WebElement Banks;
	@FindBy(name = "Distributions") WebElement Distributions;
	@FindBy(name = "Distribution Sets") WebElement DSets;
	@FindBy(name = "Bank Notes") WebElement BNotes;
	@FindBy(name = "Print") WebElement Print;
	@FindBy(name = "Information") WebElement Information;
	@FindBy(name = "Batch Reports") WebElement BatchReports;
	@FindBy(name = "Batch Status") WebElement BatchStatus;
	@FindBy(name = "Batches") WebElement Batches;
	@FindBy(name = "No") WebElement No;
	@FindBy(name = "Yes") WebElement Yes;
	@FindBy(name = "Print/Consolidate G/L Transactions") WebElement GLTransactions;
	@FindBy(name = "Bank Transactions") WebElement BTransactions;
	@FindBy(name = "Bank Historical Transactions") WebElement BHTransactions;
	@FindBy(name = "Bank Reconciliation") WebElement BRecon;
	@FindBy(name = "Deposit Slip") WebElement DSlip;
	@FindBy(name = "Cash Flow") WebElement CFlow;
	@FindBy(name = "Reconciliation Worksheet") WebElement RWorksheet;
	@FindBy(name = "Receipt Audit List") WebElement RAList;
	@FindBy(className = "TSEFinder") WebElement BankReference;
	@FindBy(className = "TSEFinder") WebElement TSEFinder1;
	@FindBy(xpath = "//*[@ClassName = 'TSEFinder'][2]")  WebElement TSEFinder2;
	@FindBy(xpath = "//*[@ClassName = 'TSEMCCurrEdit'][1]")  WebElement TSEMCCurrEdit1;
	@FindBy(xpath = "//*[@ClassName = 'TSEMCCurrEdit'][2]")  WebElement TSEMCCurrEdit2;
	@FindBy(name = "Confirm") WebElement Confirm;
	@FindBy(name = "User Setup") WebElement UserSetup;
	@FindBy(name = "New") WebElement New;
	@FindBy(xpath = "//*[@ClassName = 'TSEEdit'][1]")  WebElement TSEEdit1;
	@FindBy(xpath = "//*[@ClassName = 'TSEEdit'][2]")  WebElement TSEEdit2;
	@FindBy(xpath = "//*[@ClassName = 'TSEEdit'][3]")  WebElement TSEEdit3;
	@FindBy(xpath = "//*[@ClassName = 'TSEEdit'][4]")  WebElement TSEEdit4;
	@FindBy(name = "Edit columns") WebElement Editcolumns;
	@FindBy(name = "Edit Gridview") WebElement EditGridview;
	@FindBy(name = "Edit PDF setup") WebElement EditPDFsetup;
	@FindBy(name = "Security Group Setup") WebElement SecurityGroupSetup;
	@FindBy(name = "Currency Codes") WebElement CurrencyCodes;
	@FindBy(className = "Edit") WebElement Edit;
	@FindBy(name = "Batch Entry") WebElement BatchEntry;
	@FindBy(name = "Edit") WebElement EditButton;
	@FindBy(name = "Rename") WebElement RenameButton;

	public void launchApp() throws MalformedURLException, InterruptedException {
		DesktopOptions options = new DesktopOptions();
		options.setApplicationPath("C:\\Softrak\\BankRec\\BankRec.exe");
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
	//*********************************************************************TC02******************
	public void MenuDatIntegrity() {
		File.click();
		Integrity.click();
	}
	public void ClickCheck() {
		ClickCheck.click();
		ClickOk.click();
	}
	//**********************************************************************TC03****************
	public void Menu_Cprofile_Report() {
		Reports.click();
		MainReports.click();
		Cprofile.click();
	}
	public void EP_Icon_Print() throws FindFailed, InterruptedException {
		Screen screen = new Screen();
		Pattern EP_Icon_Print = new Pattern("D:\\Arun\\sikulisnaps\\EP_Icon_Print.PNG");
		screen.click(EP_Icon_Print);
		Thread.sleep(6000);
	}
	public void CloseButton() throws FindFailed {
		Screen screen = new Screen();
		Pattern Sik_CloseButton = new Pattern("D:\\Arun\\sikulisnaps\\CloseButton.PNG");
		screen.click(Sik_CloseButton);
	}
	public void CloseButton1() throws FindFailed {
		Screen screen = new Screen();
		Pattern Sik_CloseButton = new Pattern("D:\\Arun\\sikulisnaps\\CloseButton1.PNG");
		screen.click(Sik_CloseButton);
	}
	public void Report_Ok() throws FindFailed {
			Screen screen = new Screen();
			Pattern ReportOk = new Pattern("D:\\Arun\\sikulisnaps\\ReportOk.PNG");
			screen.click(ReportOk);
	}
	//*******************************************************************TC04************************
	public void Menu_Banks_Report() {
		Reports.click();
		MainReports.click();
		Banks.click();
	}
	//********************************************************************TC05**************************
	public void Menu_Distributions_Report() {
		Reports.click();
		MainReports.click();
		Distributions.click();
	}
	//********************************************************************TC06************************
	public void Menu_DistSets_Report() {
		Reports.click();
		MainReports.click();
		DSets.click();
	}
	//*********************************************************************TC07**********************
	public void Menu_BNotes_Report() {
		Reports.click();
		MainReports.click();
		BNotes.click();
	}
	//*********************************************************************TC08*********************
	public void Batch_Status_Report() {
		Reports.click();
		BatchReports.click();
		BatchStatus.click();
	}
	public void No() {
		No.click();
	}
	//**********************************************************************TC09*************************
	public void Batches_Report() {
		Reports.click();
		BatchReports.click();
		Batches.click();
	}
	//***********************************************************************TC10***********************
	public void GL_Transaction_Report() {
		Reports.click();
		GLTransactions.click();
	}
	public void Information() throws FindFailed {
		if(Information.isDisplayed()) {
			ClickOk.click();
			CloseButton1();
		}
		else {
			CloseButton();
		}
	}
	//**************************************************************************TC11*************************
	public void BankTransactions_Report() {
		Reports.click();
		BTransactions.click();
	}
	//****************************************************************************TC12************************
	public void Bank_Hist_Transactions_Report() {
		Reports.click();
		BHTransactions.click();
	}
	//*****************************************************************************TC13************************
	public void Bank_Recon_Report() {
		Reports.click();
		BRecon.click();
	}
	//*****************************************************************************TC14**************************
	public void Deposit_Slip_Report() {
		Reports.click();
		DSlip.click();
	}
	public void BankReference() {
		BankReference.sendKeys("SDP20200309");
	}
	//******************************************************************************TC15*************************
	public void CashFlow_Report() {
		Reports.click();
		CFlow.click();
	}
	//******************************************************************************TC16*************************
	public void Recon_Worksheet_Report() {
		Reports.click();
		RWorksheet.click();
	}
	//******************************************************************************TC17*************************
	public void Receipt_List_Report() {
		Reports.click();
		RAList.click();
	}
	public void Confirm() throws FindFailed {
		if(Confirm.isDisplayed()) {
			No.click();
			CloseButton1();
		}
		else {
			CloseButton();
		}
	}
	//**************************************************************************TC18****************************
	public void File_UserSetup() {
		File.click();
		UserSetup.click();
	}
	public void New() {
		New.click();
	}
	public void NewUser_Details() {
		TSEEdit3.sendKeys("yss");
		TSEEdit2.sendKeys("System Account1");
		TSEEdit1.sendKeys("sys");
		Editcolumns.click();
		EditGridview.click();
		EditPDFsetup.click();
		Ok();
	}
	public void NewUser_Login() {
		OpenClick();
		TSEEdit4.sendKeys("yss");
		OpenClick();
	}
	public void OldUser_Login() {
		OpenClick();
		Login();
		TSEEdit4.clear();
		TSEEdit4.sendKeys("sys");
		OpenClick();
	}
	//****************************************************************************TC19********************************
	public void SecurityGroupSetup() {
		File.click();
		SecurityGroupSetup.click();
	}
	public void SecurityGroup_Details() throws FindFailed {
		TSEFinder1.sendKeys("sys");
		TSEEdit1.sendKeys("sys security group");
		Screen screen = new Screen();
		Pattern SGroupHelp = new Pattern("D:\\Arun\\sikulisnaps\\SGroupHelp.PNG");
		screen.click(SGroupHelp);
		Ok();
	}
	//****************************************************************************TC20***********************************
	public void Currency_Codes() {
		File.click();
		CurrencyCodes.click();
	}
	public void Currency_Details() {
		TSEFinder1.sendKeys("YEN");
		TSEEdit1.sendKeys("Japanese");
		Edit.sendKeys("¥");
		Ok();
	}
	//*****************************************************************************TC21*********************************
	public void BatchEntry(){
		BatchEntry.click();
	}
	public void SelectBank_And_Desc(String BatchName,String Reference){
		TSEEdit2.clear();
		TSEEdit2.sendKeys(BatchName);
		TSEEdit1.clear();
		TSEEdit1.sendKeys(Reference);
		Ok();
	}
	public void CustDetails_Amount() {
		TSEFinder2.sendKeys("BCS01");
		TSEMCCurrEdit2.clear();
		TSEMCCurrEdit2.sendKeys("85.00");
	}
	public void Apply_RecptAmount() {
		Screen screen = new Screen();
		screen.type(Key.TAB);
		screen.type(Key.TAB);
		screen.type(Key.TAB);
		screen.type(Key.SPACE);
		Ok();
		/*New();
		TSEFinder2.sendKeys("TAX");
		TSEMCCurrEdit2.clear();
		TSEMCCurrEdit2.sendKeys("285.00");
		Ok();
		Ok();*/
	}
	//****************************************************************************TC22************************************
	public void Batch_Edit() throws FindFailed {
		Screen screen = new Screen();
		Pattern ReceiptBatch = new Pattern("D:\\Arun\\sikulisnaps\\ReceiptBatch.PNG");
		screen.click(ReceiptBatch);
		Pattern EditButton = new Pattern("D:\\Arun\\sikulisnaps\\Edit.PNG");
		screen.click(EditButton);
		screen.click(EditButton);
	}
	public void Edit_Confirm() {
		TSEEdit3.sendKeys("BCS Receipt");
		Ok();
	}
	//*******************************************************************************TC23*************************************
	public void Rename_Batch() throws FindFailed {
		Screen screen = new Screen();
		Pattern ReceiptBatch = new Pattern("D:\\Arun\\sikulisnaps\\ReceiptBatch.PNG");
		screen.click(ReceiptBatch);
		RenameButton.click();
		TSEEdit2.sendKeys("RefBatchPost");
		Ok();
	}
	public void PostBatch() throws FindFailed {
		Screen screen = new Screen();
		Pattern PostBatch = new Pattern("D:\\Arun\\sikulisnaps\\post.PNG");
		screen.click(PostBatch);
		Yes.click();
		Ok();
		CloseButton1();
	}
	//******************************************************************CloseApp********************************
	public void Appexit() {
		Exitapp.click();
	}
	public void CloseApp() {
		CloseApp.click();
	}
}
