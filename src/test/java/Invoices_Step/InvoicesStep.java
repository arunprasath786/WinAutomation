package Invoices_Step;

import java.net.MalformedURLException;

import org.sikuli.script.FindFailed;

import Base.BaseClass;
import Win.Adagio.Framework.Invoices;
import Win.Adagio.Framework.PayablesApp;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InvoicesStep extends BaseClass{
	@Given("launch Invoices application.")
	public void launch_Invoices_application() throws MalformedURLException, InterruptedException {
		new Invoices().launchApp();
	   	}
	@Given("enter username & password.")
	public void enter_username_password() {
		new Invoices().Login();
	   	}
	@When("click on open button")
	public void click_on_open_button() {
		new Invoices().OpenClick();
	}
	//*************************************************************TC02 invoice batch***********************************
	@When("Click invoice icon from Toolbar.")
	public void click_invoice_icon_from_Toolbar() {
		new Invoices().Invoices_IconClick();
	}
	@When("Click New button & give batch desccription.")
	public void click_New_button_give_batch_desccription() {
		new Invoices().Batch_Desc();
	}
	@When("Give customer code details for invoice batch.")
	public void give_customer_code_details_for_invoice_batch() {
		new Invoices().Customer_Details("BCS01");
	}
	@Then("Navigate to items section & click New buttton.")
	public void navigate_to_items_section_click_New_buttton() throws InterruptedException {
		new Invoices().Items_Include();
	}
	@Then("Give invoice item code (.*) & click  ok button.")
	public void give_invoice_item_code_itemcode_click_ok_button(String itemcode) {
		new Invoices().ItemCodes(itemcode);
	}
	@Then("close the batch windows.")
	public void close_the_batch_windows() {
		new Invoices().Close_Windows();
	}
	@Then("post the batch & print the report.")
	public void post_the_batch_print_the_report() throws FindFailed, InterruptedException {
		new Invoices().Post_Batch();
		new Invoices().Report_Print();
	}
	//*******************************************************TC03 IN credit note******************************************
	@When("Give customer code details for invoice credit note batch.")
	public void give_customer_code_details_for_invoice_credit_note_batch() throws FindFailed {
		new Invoices().IN_CreditNote("CHE01");
	}
	//*******************************************************TC04 IN inventory code***************************************
	@Then("Give inventory item code (.*) & click  ok button.")
	public void give_inventory_item_code_BKH_UNI_click_ok_button(String inventorycode) {
		new Invoices().InventoryItem_Details(inventorycode);
	}
	//******************************************************Reports TC06-TC15*********************************************
	@When("Select Reports-->Invoice Listing  from Invoice menu bar.")
	public void select_Reports_Invoice_Listing_from_Invoice_menu_bar() {
		new Invoices().InvoiceListing();
	}
	@When("Click ep icon button for report print.")
	public void click_ep_icon_button_for_report_print() throws FindFailed, InterruptedException {
		new Invoices().EP_Icon_Print();
		new Invoices().CloseButton();
	}
	@When("Select Reports-->Tax Summary  from Invoice menu bar.")
	public void select_Reports_Tax_Summary_from_Invoice_menu_bar() {
		new Invoices().TaxSummary();
	}
	@When("Click ep icon button for report print & dont clear the summary.")
	public void click_ep_icon_button_for_report_print_dont_clear_the_summary() throws FindFailed, InterruptedException {
		new Invoices().EP_Icon_Print();
		new Invoices().No();
		new Invoices().CloseButton();
	}
	@When("Select Reports-->Tax Tracking  from Invoice menu bar.")
	public void select_Reports_Tax_Tracking_from_Invoice_menu_bar() {
		new Invoices().TaxTracking();
	}
	@When("Click ep icon button for report print & dont clear records.")
	public void click_ep_icon_button_for_report_print_dont_clear_records() throws FindFailed, InterruptedException {
		new Invoices().EP_Icon_Print();
		new Invoices().No();
		new Invoices().CloseButton();
	}
	@When("Select Reports-->History Listing  from Invoice menu bar.")
	public void select_Reports_History_Listing_from_Invoice_menu_bar() {
		new Invoices().HistoryListing();
	}
	@When("Click ep icon button for report print & wait till it completes.")
	public void click_ep_icon_button_for_report_print_wait_till_it_completes() throws FindFailed, InterruptedException {
		new Invoices().EP_Icon_Print();
		new Invoices().wait2mins();
		new Invoices().CloseButton();
	}
	@When("Select Reports-->Deleted Invoices Audit List  from Invoice menu bar.")
	public void select_Reports_Deleted_Invoices_Audit_List_from_Invoice_menu_bar() {
		new Invoices().DeletedInvoicesAuditList();
	}
	@When("Click ep icon button for report print & dont clear the audit list.")
	public void click_ep_icon_button_for_report_print_dont_clear_the_audit_list() throws FindFailed, InterruptedException {
		new Invoices().EP_Icon_Print();
		new Invoices().No();
		new Invoices().CloseButton();
	}
	@When("Select Reports-->General Reports-->Batch Status  from Invoice menu bar.")
	public void select_Reports_General_Reports_Batch_Status_from_Invoice_menu_bar() {
		new Invoices().BatchStatus();
	}
	@When("Click ep icon button for report print & dont purge the batch information.")
	public void click_ep_icon_button_for_report_print_dont_purge_the_batch_information() throws FindFailed, InterruptedException {
		new Invoices().EP_Icon_Print();
		new Invoices().No();
		new Invoices().CloseButton();
	}
	@When("Select Reports-->General Reports-->Company Profile  from Invoice menu bar.")
	public void select_Reports_General_Reports_Company_Profile_from_Invoice_menu_bar() {
		new Invoices().Companyprofile();
	}
	@When("Select Reports-->General Reports-->Tax Tables  from Invoice menu bar.")
	public void select_Reports_General_Reports_Tax_Tables_from_Invoice_menu_bar() {
		new Invoices().TaxTables();
	}
	@When("Select Reports-->General Reports-->Item Listing  from Invoice menu bar.")
	public void select_Reports_General_Reports_Item_Listing_from_Invoice_menu_bar() {
		new Invoices().ItemListing();
	}
	@When("Select Reports-->General Reports-->Text Listing  from Invoice menu bar.")
	public void select_Reports_General_Reports_Text_Listing_from_Invoice_menu_bar() {
		new Invoices().TextListing();
	}


	//*************************************************************Exit app***********************************************
	@When("close the application.")
	public void close_the_application() {
		new Invoices().Appexit();
	}

}
