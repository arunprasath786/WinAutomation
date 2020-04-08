package Payables_Step;

import java.net.MalformedURLException;

import org.sikuli.script.FindFailed;

import Base.BaseClass;
import Win.Adagio.Framework.BankRec;
import Win.Adagio.Framework.PayablesApp;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PayablesStep extends BaseClass{
	@Given("launch payables application.")
	public void launch_payables_application() throws MalformedURLException, InterruptedException {
		new PayablesApp().launchApp();
	   	}
	@Given("enter username & password.")
	public void enter_username_password() {
		new PayablesApp().Login();
	   	}
	@When("click on open button")
	public void click_on_open_button() {
		new PayablesApp().OpenClick();
	}
	//***************************************************************************************TC02*****************************************
	@When("Select Reports-->Batch Listings-->Invoice Batch List from Payables menu bar.")
	public void select_Reports_Batch_Listings_Invoice_Batch_List_from_Payables_menu_bar() {
		new PayablesApp().InvoiceBList_Report();
	}
	@When("Click ep icon button for report print.")
	public void click_ep_icon_button_for_report_print() throws FindFailed, InterruptedException {
		new PayablesApp().EP_Icon_Print();
		new PayablesApp().CloseButton();
	}	
	//*****************************************************************************************TC03****************************************
	@When("Select Reports-->Batch Listings-->Manual Check Batch List from Payables menu bar.")
	public void select_Reports_Batch_Listings_Manual_Check_Batch_List_from_Payables_menu_bar() {
		new PayablesApp().ManualCBList_Report();
	}
	//******************************************************************************************TC04****************************************
	@When("Select Reports-->Letters from Payables menu bar.")
	public void select_Reports_Letters_from_Payables_menu_bar() {
		new PayablesApp().Letters_Report();
	}
	@When("Click ep icon button for report print & click ok button after print.")
	public void click_ep_icon_button_for_report_print_click_ok_button_after_print() throws FindFailed, InterruptedException {
		new PayablesApp().EP_Icon_Print();
		new PayablesApp().Ok();
		new PayablesApp().CloseButton1();
	}
	//********************************************************************************************TC05***********************************
	@When("Select Reports-->Transaction and Analysis-->Open Payables from Payables menu bar.")
	public void select_Reports_Transaction_and_Analysis_Open_Payables_from_Payables_menu_bar() {
		new PayablesApp().OPenPayables_Report();
	}
	//*********************************************************************************************TC06**********************************
	@When("Select Reports-->Transaction and Analysis-->Aged Open Payables from Payables menu bar.")
	public void select_Reports_Transaction_and_Analysis_Aged_Open_Payables_from_Payables_menu_bar() {
		new PayablesApp().AgedOPenPayables_Report();
	}
	//*********************************************************************************************TC07**********************************
	@When("Select Reports-->Transaction and Analysis-->Aged Overdue Payables from Payables menu bar.")
	public void select_Reports_Transaction_and_Analysis_Aged_Overdue_Payables_from_Payables_menu_bar() {
		new PayablesApp().AgedOverduePayables_Report();
	}
	//************************************************************************************************TC08******************************
	@When("Select Reports-->Transaction and Analysis-->Aged Cash Requirements from Payables menu bar.")
	public void select_Reports_Transaction_and_Analysis_Aged_Cash_Requirements_from_Payables_menu_bar() {
		new PayablesApp().AgedCashReq_Report();
	}
	//*************************************************************************************************TC09*****************************
	@When("Select Reports-->Transaction and Analysis-->Vendor Transactions  from Payables menu bar.")
	public void select_Reports_Transaction_and_Analysis_Vendor_Transactions_from_Payables_menu_bar() {
		new PayablesApp().VendorTxion_Report();
	}
	//*************************************************************************************************TC10****************************
	@When("Select Reports-->Transaction and Analysis-->Vendor List  from Payables menu bar.")
	public void select_Reports_Transaction_and_Analysis_Vendor_List_from_Payables_menu_bar() {
		new PayablesApp().VendorList_Report();
	}
	//*************************************************************************************************TC11****************************
	@When("Select Reports-->Transaction and Analysis-->Tax tracking  from Payables menu bar.")
	public void select_Reports_Transaction_and_Analysis_Tax_tracking_from_Payables_menu_bar() {
		new PayablesApp().TaxTracking_Report();
	}
	@When("Click ep icon button for report print & dont clear records after print.")
	public void click_ep_icon_button_for_report_print_dont_clear_records_after_print() throws FindFailed, InterruptedException {
		new PayablesApp().GLReport_Dontclear();
	}
	//************************************************************************************************TC12******************************
	@When("Select Reports-->Print Consolidate G\\/L Transaction report  from Payables menu bar.")
	public void select_Reports_Print_Consolidate_G_L_Transaction_report_from_Payables_menu_bar() {
		new PayablesApp().PCGLTxion_Report();
	}
	//*************************************************************************************************TC13&14****************************
	@When("Select Reports-->onezeroninenine report  from Payables menu bar.")
	public void select_Reports_onezeroninenine_report_from_Payables_menu_bar() {
		new PayablesApp().R1099_Report();
	}
	@When("Click ep icon button for report print & click yes to ptint.")
	public void click_ep_icon_button_for_report_print_click_yes_to_ptint() throws FindFailed, InterruptedException {
		new PayablesApp().R10995018_Report();
	}
	@When("Select Reports-->fivezerooneeight  from Payables menu bar.")
	public void select_Reports_fivezerooneeight_from_Payables_menu_bar() {
		new PayablesApp().R5018_Report();
	}
	//*************************************************************************************************TC15*****************************
	@When("Select Reports-->General Reports-->Batch status  from Payables menu bar.")
	public void select_Reports_General_Reports_Batch_status_from_Payables_menu_bar() {
		new PayablesApp().BatchStatus_Report();
	}
	//************************************************************************************************TC16****************************
	@When("Select Reports-->General Reports-->System check Status  from Payables menu bar.")
	public void select_Reports_General_Reports_System_check_Status_from_Payables_menu_bar() {
		new PayablesApp().SystemCheckStatus_Report();
	}
	//************************************************************************************************TC17*****************************
	@When("Select Reports-->General Reports-->Company Profile from Payables menu bar.")
	public void select_Reports_General_Reports_Company_Profile_from_Payables_menu_bar() {
		new PayablesApp().CompanyProfile_Report();
	}
	//***********************************************************************************************TC18*****************************
	@When("Select Reports-->General Reports-->Banks from Payables menu bar.")
	public void select_Reports_General_Reports_Banks_from_Payables_menu_bar() {
		new PayablesApp().Banks_Report();
	}
	//*************************************************************************************************TC19***************************
	@When("Select Reports-->General Reports-->Distributions from Payables menu bar.")
	public void select_Reports_General_Reports_Distributions_from_Payables_menu_bar() {
		new PayablesApp().Distributions_Report();
	}
    //************************************************************************************************TC20****************************
	@When("Select Reports-->General Reports-->Distribution Sets from Payables menu bar.")
	public void select_Reports_General_Reports_Distribution_Sets_from_Payables_menu_bar() {
		new PayablesApp().DistributionSets_Report();
	}
	//************************************************************************************************TC21-25***************************
	@When("Select Reports-->General Reports-->Control Accounts from Payables menu bar.")
	public void select_Reports_General_Reports_Control_Accounts_from_Payables_menu_bar() {
		new PayablesApp().ControlAccounts_Report();
	}
	@When("Select Reports-->General Reports-->Terms from Payables menu bar.")
	public void select_Reports_General_Reports_Terms_from_Payables_menu_bar() {
		new PayablesApp().Terms_Report();
	}
	@When("Select Reports-->General Reports-->Vendor Notes from Payables menu bar.")
	public void select_Reports_General_Reports_Vendor_Notes_from_Payables_menu_bar() {
		new PayablesApp().VendorNotes_Report();
	}
	@When("Select Reports-->General Reports-->Form Types from Payables menu bar.")
	public void select_Reports_General_Reports_Form_Types_from_Payables_menu_bar() {
		new PayablesApp().FormTypes_Report();
	}
	@When("Select Reports-->General Reports-->Report Groups from Payables menu bar.")
	public void select_Reports_General_Reports_Report_Groups_from_Payables_menu_bar() {
		new PayablesApp().ReportGroups_Report();
	}



	//*******************************************************************************************
	@Then("Exit Payables application.")
	public void exit_Payables_application() {
		new PayablesApp().Appexit();
	}
	@When("close the application.")
	public void close_the_application() {
		new PayablesApp().Appexit();
	}

}
