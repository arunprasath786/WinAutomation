package StepDefinition;

import java.net.MalformedURLException;

import org.sikuli.script.FindFailed;

import Base.BaseClass;
import Win.Adagio.Framework.BankRec;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BankRecStep extends BaseClass{
	@Given("launch BankRec application.")
	public void launch_BankRec_application() throws MalformedURLException, InterruptedException {
	    new BankRec().launchApp();
	}
	@Given("enter username & password for BankRec.")
	public void enter_username_password_for_BankRec() {
		new BankRec().Login();
	}
	@When("click open button after entering password")
	public void click_open_button_after_entering_password() {
		new BankRec().OpenClick();
	}
	//*********************************************************************************************************TC02********************
@Then("Select File-->Data Integrity Check from BankRec menu bar.")
public void select_File_Data_Integrity_Check_from_BankRec_menu_bar() {
	new BankRec().MenuDatIntegrity();
}
@Then("Click Check button.")
public void click_Check_button() {
	new BankRec().ClickCheck();
}
//***********************************************************************************************************Tc03**********************
@Then("Select Reports-->Maintenance Reports-->Company Profile from BankRec menu bar.")
public void select_Reports_Maintenance_Reports_Company_Profile_from_BankRec_menu_bar() {
	new BankRec().Menu_Cprofile_Report();
}
@When("Click ep icon button for report print.")
public void click_ep_icon_button_for_report_print() throws FindFailed, InterruptedException {
	new BankRec().EP_Icon_Print();
	new BankRec().CloseButton();
}
//****************************************************************************************************TC04***************************
@Then("Select Reports-->Maintenance Reports-->Banks from BankRec menu bar.")
public void select_Reports_Maintenance_Reports_Banks_from_BankRec_menu_bar() {
	new BankRec().Menu_Banks_Report();
}
//****************************************************************************************************TC05************************
@Then("Select Reports-->Maintenance Reports-->Distributions from BankRec menu bar.")
public void select_Reports_Maintenance_Reports_Distributions_from_BankRec_menu_bar() {
	new BankRec().Menu_Distributions_Report();
}
//*****************************************************************************************************TC06************************
@Then("Select Reports-->Maintenance Reports-->Distribution sets from BankRec menu bar.")
public void select_Reports_Maintenance_Reports_Distribution_sets_from_BankRec_menu_bar() {
	new BankRec().Menu_DistSets_Report();
}
//*****************************************************************************************************TC07*************************
@Then("Select Reports-->Maintenance Reports-->Bank Notes from BankRec menu bar.")
public void select_Reports_Maintenance_Reports_Bank_Notes_from_BankRec_menu_bar() {
	new BankRec().Menu_BNotes_Report();
}
//******************************************************************************************************Tc08***************************
@When("Select Reports-->Batch Reports-->Batch Status from BankRec menu bar.")
public void select_Reports_Batch_Reports_Batch_Status_from_BankRec_menu_bar() {
	new BankRec().Batch_Status_Report();
}
@When("Click ep icon button for report print & dont clear batches after printing.")
public void click_ep_icon_button_for_report_print_dont_clear_batches_after_printing() throws FindFailed, InterruptedException {
	new BankRec().EP_Icon_Print();
	new BankRec().No();
	new BankRec().CloseButton();
}
//*******************************************************************************************************TC09**************************
@When("Select Reports-->Batch Reports-->Batches from BankRec menu bar.")
public void select_Reports_Batch_Reports_Batches_from_BankRec_menu_bar() {
	new BankRec().Batches_Report();
}
//********************************************************************************************************TC10**************************
@When("Select Reports-->Print\\/Consolidate G\\/L Transactions from BankRec menu bar.")
public void select_Reports_Print_Consolidate_G_L_Transactions_from_BankRec_menu_bar() {
	new BankRec().GL_Transaction_Report();
}
@When("Click ep icon button for report print & Close the print report window.")
public void click_ep_icon_button_for_report_print_Close_the_print_report_window() throws FindFailed, InterruptedException {
	new BankRec().EP_Icon_Print();
	new BankRec().Information();
}
//*********************************************************************************************************TC11**************************
@When("Select Reports-->Bank Transactions from BankRec menu bar.")
public void select_Reports_Bank_Transactions_from_BankRec_menu_bar() {
	new BankRec().BankTransactions_Report();
}
//*********************************************************************************************************TC12*************************
@When("Select Reports-->Bank Historical Transactions from BankRec menu bar.")
public void select_Reports_Bank_Historical_Transactions_from_BankRec_menu_bar() {
	new BankRec().Bank_Hist_Transactions_Report();
}
//***********************************************************************************************************TC13************************
@When("Select Reports-->Bank Reconciliation from BankRec menu bar.")
public void select_Reports_Bank_Reconciliation_from_BankRec_menu_bar() {
	new BankRec().Bank_Recon_Report();
}
//***********************************************************************************************************TC14*********************
@When("Select Reports-->Deposit Slip from BankRec menu bar.")
public void select_Reports_Deposit_Slip_from_BankRec_menu_bar() {
	new BankRec().Deposit_Slip_Report();
}
@When("Enter bank reference to print doposit slip.")
public void enter_bank_reference_to_print_doposit_slip() {
	new BankRec().BankReference();
}
//***********************************************************************************************************Tc15*********************
@When("Select Reports-->Cash Flow from BankRec menu bar.")
public void select_Reports_Cash_Flow_from_BankRec_menu_bar() {
	new BankRec().CashFlow_Report();
}
//************************************************************************************************************TC16***********************
@When("Select Reports-->Reconciliation Worksheet from BankRec menu bar.")
public void select_Reports_Reconciliation_Worksheet_from_BankRec_menu_bar() {
	new BankRec().Recon_Worksheet_Report();
}
//*************************************************************************************************************TC17******************
@When("Select Reports-->Receipt Audit List from BankRec menu bar.")
public void select_Reports_Receipt_Audit_List_from_BankRec_menu_bar() {
	new BankRec().Receipt_List_Report();
}
@When("Click ep icon button for report print & dont clear the list by clicking no in confirm window..")
public void click_ep_icon_button_for_report_print_dont_clear_the_list_by_clicking_no_in_confirm_window() throws FindFailed, InterruptedException {
	new BankRec().EP_Icon_Print();
	new BankRec().Confirm();
}
//**************************************************************************************************************TC18**********************
@When("Select File-->User Setup from BankRec menu bar.")
public void select_File_User_Setup_from_BankRec_menu_bar() {
	new BankRec().File_UserSetup();
}
@Then("Click New button to add user.")
public void click_New_button_to_add_user() {
	new BankRec().New();
}
@Then("Give new user details in edit user window & submit it by clicking ok button.")
public void give_new_user_details_in_edit_user_window_submit_it_by_clicking_ok_button() {
	new BankRec().NewUser_Details();
}
@Then("Try logging in with new user account.")
public void try_logging_in_with_new_user_account() {
	new BankRec().NewUser_Login();
}
@Then("Exit the new user account & login with old user account.")
public void exit_the_new_user_account_login_with_old_user_account() {
	new BankRec().OldUser_Login();
}
//*************************************************************************************************************TC19************************
@When("Select File-->Security Group Setup from BankRec menu bar.")
public void select_File_Security_Group_Setup_from_BankRec_menu_bar() {
	new BankRec().SecurityGroupSetup();
}
@Then("Give group name,untick Help option in edit security group window & submit it by clicking ok button.")
public void give_group_name_untick_Help_option_in_edit_security_group_window_submit_it_by_clicking_ok_button() throws FindFailed {
	new BankRec().SecurityGroup_Details();
}
//************************************************************************************************************TC20**************************
@When("Select File-->Currency Codes from BankRec menu bar.")
public void select_File_Currency_Codes_from_BankRec_menu_bar() {
	new BankRec().Currency_Codes();
}
@Then("Give currency details & click ok in Edit currency code window.")
public void give_currency_details_click_ok_in_Edit_currency_code_window() {
	new BankRec().Currency_Details();
}
//***************************************************************************************************************TC21************************
@When("Click Batch Entry icon from tool bar.")
public void click_Batch_Entry_icon_from_tool_bar() {
	new BankRec().BatchEntry();
}
@Then("Click new button to add new batch entry.")
public void click_new_button_to_add_new_batch_entry() {
	new BankRec().New();
}
@Then("Select bank code,give description & then click ok button.")
public void select_bank_code_give_description_then_click_ok_button() {
	new BankRec().SelectBank_And_Desc("ReceiptBatch","RefBatch");
}
@Then("Enter  Customer code,receipt amount.")
public void enter_Customer_code_receipt_amount() {
	new BankRec().CustDetails_Amount();
}
@Then("Apply invoice amount & click ok button.")
public void apply_invoice_amount_click_ok_button() {
	new BankRec().Apply_RecptAmount();
}
@Then("close the batch window.")
public void close_the_batch_window() throws FindFailed {
	new BankRec().CloseButton1();
}
//*****************************************************************************************************************TC22*************************
@Then("Select a batch & click Edit button.")
public void select_a_batch_click_Edit_button() throws FindFailed {
	new BankRec().Batch_Edit();
}
@Then("confirm the changes.")
public void confirm_the_changes() {
	new BankRec().Edit_Confirm();
}
//******************************************************************************************************************TC23*************************
@Then("Select a batch & click Rename button.")
public void select_a_batch_click_Rename_button() throws FindFailed {
	new BankRec().Rename_Batch();
}
@Then("post the batch.")
public void post_the_batch() throws FindFailed, InterruptedException {
	new BankRec().PostBatch();
	new BankRec().EP_Icon_Print();
	new BankRec().CloseButton();
}
//**********************************************************************CloseApp*********************************************
@Then("Exit BankRec application.")
public void exit_BankRec_application() {
	new BankRec().CloseApp();
}
@Then("close BankRec application.")
	public void close_BankRec_application() {
		new BankRec().Appexit();
	}
}
