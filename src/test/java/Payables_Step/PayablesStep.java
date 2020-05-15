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
	//****************************************************************************************Invoice TC26*********************************
	@When("Click Invoices icon in menu bar.")
	public void click_Invoices_icon_in_menu_bar() throws InterruptedException {
		new PayablesApp().InvoiceIcon_Click();
	}
	@When("Click new button & enter batch description for new batch.")
	public void click_new_button_enter_batch_description_for_new_batch() {
		new PayablesApp().NewBatch_Desc("AP-InvoiceBatchEntry");
	}
	@Then("Enter vendor code.")
	public void enter_vendor_code() {
		new PayablesApp().EnterVendor_code("ABL01");
	}
	@Then("Click new button & give distribution,amount details.")
	public void click_new_button_give_distribution_amount_details() {
		new PayablesApp().Dist_Details("tr","1500");
	}
	@Then("Click ok button & close batch window.")
	public void click_ok_button_close_batch_window() throws FindFailed {
		new PayablesApp().Ok_Close();
	}
	//******************************************************************************Invoice Edit TC27***************************************
	@When("Select a batch to edit & enter description field.")
	public void select_a_batch_to_edit_enter_description_field() throws FindFailed, InterruptedException {
		new PayablesApp().Invoice_Edit();
	}
	//***********************************************************************************In post TC28*****************************************
	@When("Select a batch & post.")
	public void select_a_batch_post() throws FindFailed, InterruptedException {
		new PayablesApp().Invoice_post();
		new PayablesApp().EP_Icon_Print();
		new PayablesApp().CloseButton();
	}
	//***********************************************************************************Credit note TC29************************************
	@When("Click new button & enter batch description for credit note batch.")
	public void click_new_button_enter_batch_description_for_credit_note_batch() {
		new PayablesApp().NewBatch_Desc("AP-CreditNote");
	}
	@Then("Enter document type & vendor code.")
	public void enter_document_type_vendor_code() {
		new PayablesApp().EnterVendor_code("BEN01");
		new PayablesApp().CreditNote_Vendor();
		new PayablesApp().DocumNo("AP_CN1");
		
	}
	@Then("Click new button & give distribution,amount details for credit note.")
	public void click_new_button_give_distribution_amount_details_for_credit_note() {
		new PayablesApp().Dist_Details("tp","700");
	}
	@Then("Post the batch.")
	public void post_the_batch() throws FindFailed, InterruptedException {
		new PayablesApp().PostCredit_Note();
		new PayablesApp().EP_Icon_Print();
		new PayablesApp().CloseButton();
	}
	//************************************************************************************Debit Note TC30**********************************
	@When("Click new button & enter batch description for Debit note batch.")
	public void click_new_button_enter_batch_description_for_Debit_note_batch() {
		new PayablesApp().NewBatch_Desc("AP-DebitNote");
	}
	@Then("Enter document type & vendor code for Debit note..")
	public void enter_document_type_vendor_code_for_Debit_note() {
		new PayablesApp().EnterVendor_code("BEN01");
		new PayablesApp().DebitNote_Vendor();
		new PayablesApp().DocumNo("AP_DB1");
		
	}
	@Then("Click new button & give distribution,amount details for Debit note.")
	public void click_new_button_give_distribution_amount_details_for_Debit_note() {
		new PayablesApp().Dist_Details("ti","400");
	}
	//****************************************************************************Check pay TC31*******************************************
	@When("Click Checks icon in menu bar.")
	public void click_Checks_icon_in_menu_bar() throws InterruptedException {
		new PayablesApp().ChecksIcon_Click();
	}
	@When("Click new button & enter new check batch details.")
	public void click_new_button_enter_new_check_batch_details() {
		new PayablesApp().SelectBank_And_Desc("1","APCheckSIGNET");
	}
	@Then("Give vendor,check details & apply amount.")
	public void give_vendor_check_details_apply_amount() throws InterruptedException, FindFailed {
		new PayablesApp().CheckPayVendor_Details("DEL02","SIG3","AP Check Pay SIGNET");
	}
	//****************************************************************Check pay CRESTAR TC32****************************************************
	@When("Click new button & enter new check batch details for CRESTAR .")
	public void click_new_button_enter_new_check_batch_details_for_CRESTAR() {
		new PayablesApp().SelectBank_And_Desc("2","APCheckCRESTAR");
	}
	@Then("Give vendor,check details & apply amount for CRESTAR.")
	public void give_vendor_check_details_apply_amount_for_CRESTAR() throws FindFailed, InterruptedException {
		new PayablesApp().Wait();
		new PayablesApp().CheckPayVendor_Details("DEL02","CRE3","AP Check Pay CRESTAR");
	}
	//****************************************************************Check pay SIGNET EFT TC33**************************************************
	@When("Click new button & enter new check batch details for SIGNET EFT .")
	public void click_new_button_enter_new_check_batch_details_for_SIGNET_EFT() {
		new PayablesApp().SelectBank_And_Desc("3","APCheckSIGNETEFT");
	}
	@Then("Give vendor,check details & apply amount for SIGNET EFT .")
	public void give_vendor_check_details_apply_amount_for_SIGNET_EFT() throws FindFailed, InterruptedException {
		new PayablesApp().Wait();
		new PayablesApp().CheckPayVendor_Details("DEL02","APSEFT2","AP Check Pay SIGNET EFT");
	}
	//****************************************************************Check pay RBL TC34***********************************************************
	@When("Click new button & enter new check batch details for RBL.")
	public void click_new_button_enter_new_check_batch_details_for_RBL() {
		new PayablesApp().SelectBank_And_Desc("5","APCheckSIGNETEFT");
	}
	@Then("Give vendor,check details & apply amount for RBL.")
	public void give_vendor_check_details_apply_amount_for_RBL() throws FindFailed, InterruptedException {
		new PayablesApp().Wait();
		new PayablesApp().CheckPayVendor_Details("DEL02","APRBL2","AP Check Pay RBL");
	}
	//****************************************************************Check pay AMEX TC35***********************************************************
	@When("Click new button & enter new check batch details for AMEX.")
	public void click_new_button_enter_new_check_batch_details_for_AMEX() {
		new PayablesApp().SelectBank_And_Desc("AMEX","APCheckAMEX");
	}
	@Then("Give vendor,check details & apply amount for AMEX.")
	public void give_vendor_check_details_apply_amount_for_AMEX() throws FindFailed, InterruptedException {
		new PayablesApp().Wait();
		new PayablesApp().CheckPayVendor_Details("DEL02","APAMEX2","AP Check Pay AMEX");
	}
	//**************************************************************Cash invoice TC36***********************************************************
	@When("Click new button & enter new check batch details for cash invoice.")
	public void click_new_button_enter_new_check_batch_details_for_cash_invoice() {
		new PayablesApp().SelectBank_And_Desc("1","APCashInvoice");
	}
	@Then("Give vendor,check details & apply amount for cash invoice.")
	public void give_vendor_check_details_apply_amount_for_cash_invoice() throws FindFailed, InterruptedException {
		new PayablesApp().CashInvoice("DEL02","CASHIN","AP Cash Invoice","CASHIN");
		new PayablesApp().Dist_Details("tr", "2500");
	}
	//********************************************************************prepayment TC37**********************************************************
	@When("Click new button & enter new check batch details for prepayment.")
	public void click_new_button_enter_new_check_batch_details_for_prepayment() throws FindFailed, InterruptedException {
		new PayablesApp().SelectBank_And_Desc("1","APPrePayment");
		new PayablesApp().PrePayment("DEL02","PrePay3","AP Pre payment");
	}
	@Then("Give vendor,check details & apply amount for prepayment.")
	public void give_vendor_check_details_apply_amount_for_prepayment() throws FindFailed, InterruptedException {
		new PayablesApp().PrePay_Amount("300");
	}
	//*******************************************************************copy batch existing TC38******************************************
	@When("Click new button & enter new check batch details for copy batch.")
	public void click_new_button_enter_new_check_batch_details_for_copy_batch() {
		new PayablesApp().SelectBank_And_Desc("1","CopyBatchExist");
	}
	@Then("Give vendor,check details & apply amount for copy batch.")
	public void give_vendor_check_details_apply_amount_for_copy_batch() throws FindFailed, InterruptedException {
		new PayablesApp().CheckPayVendor_Details("DEL02","copy1","AP Check Pay SIGNET");
		new PayablesApp().Ok();
	}
	@Then("Select copy batch options.")
	public void select_copy_batch_options() {
		new PayablesApp().CopyBatch_Exis();
	}
	//*****************************************************************Edit bank check series TC39******************************************
	@When("Click Edit-->Banks from menubar options.")
	public void click_Edit_Banks_from_menubar_options() {
		new PayablesApp().EditBank();
	}
	@When("Click Edit button to Edit signet bank details.")
	public void click_Edit_button_to_Edit_signet_bank_details() throws FindFailed {
		new PayablesApp().EditButtonClick();
	}
	@Then("Navigate to series tab & enable use a separate check series.")
	public void navigate_to_series_tab_enable_use_a_separate_check_series() throws InterruptedException {
		new PayablesApp().CheckSeries("20");
	}
	//********************************************************Check batch for auto check number TC40****************************************
	@When("Click new button & enter new check batch details for auto check number. .")
	public void click_new_button_enter_new_check_batch_details_for_auto_check_number() {
		new PayablesApp().SelectBank_And_Desc("1","APAutoCheckNo");
	}
	@Then("Give vendor,check details & apply amount for auto check number.")
	public void give_vendor_check_details_apply_amount_for_auto_check_number() throws FindFailed, InterruptedException {
		new PayablesApp().CheckPayVendor_DetailsAutoCHKNO("DEL02", "AP Check Pay SIGNET");
	}
	//********************************************************Adjust batch TC41**************************************************************
	@When("Click Adjust icon in menu bar.")
	public void click_Adjust_icon_in_menu_bar() throws InterruptedException {
		new PayablesApp().AdjustIcon_Click();
	}
	@When("Select a vendor & give adjustment amount details.")
	public void select_a_vendor_give_adjustment_amount_details() throws FindFailed {
		new PayablesApp().NewBatch_Desc("AP-AdjustBatchEntry");
		new PayablesApp().AdjustVendor_code("DEL02", "AD1");
		new PayablesApp().Adjust_Dist_Details("tr", "3800");
		new PayablesApp().Ok_Close();
	}
	@When("Post the adjustment batch.")
	public void post_the_adjustment_batch() throws FindFailed, InterruptedException {
		new PayablesApp().Adjust_post();
		new PayablesApp().EP_Icon_Print();
		new PayablesApp().CloseButton();
	}
	//************************************************File menu TC42-TC4 ****************************************************************************
	@When("Select File-->Data Integrity Check from AP menu bar.")
	public void select_File_Data_Integrity_Check_from_AP_menu_bar() {
		new PayablesApp().DataIntegrityCheck();
	}
	@When("Click Check button for data integrity check.")
	public void click_Check_button_for_data_integrity_check() throws FindFailed {
		new PayablesApp().ClickCheck();
	}
	@When("Select File-->Security Group Setup from AP menu bar.")
	public void select_File_Security_Group_Setup_from_AP_menu_bar() {
		new PayablesApp().SecurityGroupSetup();
	}
	@When("Click New button & Give group name,untick Help option in edit security group window & submit it by clicking ok button.")
	public void click_New_button_Give_group_name_untick_Help_option_in_edit_security_group_window_submit_it_by_clicking_ok_button() throws FindFailed {
		new PayablesApp().SecurityGroup_Details();
	}
	@When("Select File-->User Setup from AP menu bar.")
	public void select_File_User_Setup_from_BankRec_menu_bar() {
		new PayablesApp().File_UserSetup();
	}
	@When("Click New button & Give new user details in edit user window & submit it by clicking ok button.")
	public void click_New_button_Give_new_user_details_in_edit_user_window_submit_it_by_clicking_ok_button() {
		new PayablesApp().NewUser_Details();
	}
	@When("Try logging in with newly created user account.")
	public void try_logging_in_with_newly_created_user_account() {
		new PayablesApp().NewUser_Login();
	}
	@When("Exit the newly created user account & login with old user account.")
	public void exit_the_newly_created_user_account_login_with_old_user_account() {
		new PayablesApp().OldUser_Login();
	}
	@When("Select File-->Open from AP menu bar & login.")
	public void select_File_Open_from_AP_menu_bar_login() {
		new PayablesApp().Login_Open();
	}
	@When("Select File-->Backup-->Payables Data from AP menu bar option.")
	public void select_File_Backup_Payables_Data_from_AP_menu_bar_option() {
		new PayablesApp().Backup_Payables();
	}
	@When("Click Start button to take Backup.")
	public void click_Start_button_to_take_Backup() throws FindFailed, InterruptedException {
		new PayablesApp().Start_Backup();
	}
	@When("Select File-->Backup-->Related Data from AP menu bar option.")
	public void select_File_Backup_Related_Data_from_AP_menu_bar_option() {
		new PayablesApp().Backup_Related();
	}
	@When("Select File-->Backup-->CompleteData set from AP menu bar option.")
	public void select_File_Backup_CompleteData_set_from_AP_menu_bar_option() {
		new PayablesApp().Backup_CompleteData();
	}
	@When("Select File-->Backup-->Backup Options from AP menu bar option.")
	public void select_File_Backup_Backup_Options_from_AP_menu_bar_option() {
		new PayablesApp().Backup_BackupOptions();
	}
	@When("Select File-->Export-->Vendors from AP menu bar option.")
	public void select_File_Export_Vendors_from_AP_menu_bar_option() {
		new PayablesApp().File_Export_Vendors();
	}
	@When("Click Export button for exporting vendor data.")
	public void click_Export_button_for_exporting_vendor_data() throws InterruptedException, FindFailed {
		new PayablesApp().Export_Vendors();
	}
	//**********************************************************Archived Invoice TC52*****************************************
	@When("Select Edit-->Archived Invoices from AP menu bar option.")
	public void select_Edit_Archived_Invoices_from_AP_menu_bar_option() {
		new PayablesApp().Archive_Invoice();
	}
	@When("Click new button & enter batch description for Archive batch.")
	public void click_new_button_enter_batch_description_for_Archive_batch() {
		new PayablesApp().NewBatch_Desc("Archived Invoice Batch");
	}
	@Then("Enter vendor code & Click new button to give distribution,amount details.")
	public void enter_vendor_code_Click_new_button_to_give_distribution_amount_details() throws InterruptedException {
		new PayablesApp().EnterVendor_Archive("DEL02", "ARC1");
		new PayablesApp().Dist_Details("tr", "300");
	}
	@Then("Copy the batch to current batch.")
	public void copy_the_batch_to_current_batch() {
		new PayablesApp().CopyBatch_Archive();
	}
	@Then("post the copied archive batch.")
	public void post_the_copied_archive_batch() throws FindFailed, InterruptedException {
		new PayablesApp().ArchiveInvoice_post();
		new PayablesApp().EP_Icon_Print();
		new PayablesApp().CloseButton();
	}
	//***************************************************Archived manual check TC53*********************************************
	@When("Select Payments-->Archived Manual Checks from AP menu bar option.")
	public void select_Payments_Archived_Manual_Checks_from_AP_menu_bar_option() {
		new PayablesApp().Archive_ManualCheck();
	}
	@When("Click new button & enter new check batch details for Archived manual check batch.")
	public void click_new_button_enter_new_check_batch_details_for_Archived_manual_check_batch() {
		new PayablesApp().SelectBank_And_Desc("1","APArchiveCheck");
	}
	@Then("Give vendor,check details & apply amount for Archived manual check batch.")
	public void give_vendor_check_details_apply_amount_for_Archived_manual_check_batch() throws FindFailed, InterruptedException {
		new PayablesApp().CheckPayVendor_Details("DEL02","APARCH","AP Archive Check Pay");
	}
	@Then("Click Checks icon in menu bar to post archived batch.")
	public void click_Checks_icon_in_menu_bar_to_post_archived_batch() throws InterruptedException {
		new PayablesApp().ChecksIcon_Click();
	}
	@Then("post the copied Archived archive batch.")
	public void post_the_copied_Archived_archive_batch() throws FindFailed, InterruptedException {
		new PayablesApp().ArchiveManualCheck_post();
		new PayablesApp().EP_Icon_Print();
		new PayablesApp().CloseButton();
	}
	//******************************************Add vendor notes TC54**************************************************************
	@When("Click vendors icon from tool bar options.")
	public void click_vendors_icon_from_tool_bar_options() throws InterruptedException {
		new PayablesApp().VendorsIcon_Click();
	}
	@When("Add notes to vendor & give confirmation.")
	public void add_notes_to_vendor_give_confirmation() {
		new PayablesApp().AddVendor_Notes();
	}
	//******************************************Favorite reports TC55 - TC ******************************************************
	@When("Select Reports-->Favorite Reports-->AgedOpenPayablesSummary from Payables menu bar.")
	public void select_Reports_Favorite_Reports_AgedOpenPayablesSummary_from_Payables_menu_bar() {
		new PayablesApp().AgedOpenPayablesSummary();
	}
	@When("Select Reports-->Favorite Reports-->AgedOverduePayablesSummary from Payables menu bar.")
	public void select_Reports_Favorite_Reports_AgedOverduePayablesSummary_from_Payables_menu_bar() {
		new PayablesApp().AgedOverduePayablesSummary();
	}
	@When("Select Reports-->Favorite Reports-->APAdjustmentBatchListing from Payables menu bar.")
	public void select_Reports_Favorite_Reports_APAdjustmentBatchListing_from_Payables_menu_bar() {
		new PayablesApp().APAdjustmentBatchListing();
	}
	@When("Select Reports-->Favorite Reports-->APAdjustmentPostingJournal from Payables menu bar.")
	public void select_Reports_Favorite_Reports_APAdjustmentPostingJournal_from_Payables_menu_bar() {
		new PayablesApp().APAdjustmentPostingJournal();
	}
	@When("Select Reports-->Favorite Reports-->APGLTransactionsByAccount from Payables menu bar.")
	public void select_Reports_Favorite_Reports_APGLTransactionsByAccount_from_Payables_menu_bar() {
		new PayablesApp().APGLTransactionsByAccount();
	}
	@When("Select Reports-->Favorite Reports-->APGLTransactionsByDate from Payables menu bar.")
	public void select_Reports_Favorite_Reports_APGLTransactionsByDate_from_Payables_menu_bar() {
		new PayablesApp().APGLTransactionsByDate();
	}
	@When("Select Reports-->Favorite Reports-->APGLTransactionsByEntry from Payables menu bar.")
	public void select_Reports_Favorite_Reports_APGLTransactionsByAPSystemCheckRegisterEntry_from_Payables_menu_bar() {
		new PayablesApp().APGLTransactionsByEntry();
	}
	@When("Select Reports-->Favorite Reports-->APInvoiceBatchListing from Payables menu bar.")
	public void select_Reports_Favorite_Reports_APInvoiceBatcgListing_from_Payables_menu_bar() {
		new PayablesApp().APInvoiceBatchListing();
	}
	@When("Select Reports-->Favorite Reports-->APInvoicePostingJournal from Payables menu bar.")
	public void select_Reports_Favorite_Reports_APInvoicePostingJournal_from_Payables_menu_bar() {
		new PayablesApp().APInvoicePostingJournal();
	}
	@When("Select Reports-->Favorite Reports-->APManCheckBatchListing from Payables menu bar.")
	public void select_Reports_Favorite_Reports_APManCheckBatchListing_from_Payables_menu_bar() {
		new PayablesApp().APManCheckBatchListing();
	}
	@When("Select Reports-->Favorite Reports-->APManualCheckPostingJournal from Payables menu bar.")
	public void select_Reports_Favorite_Reports_APManualCheckPostingJournal_from_Payables_menu_bar() {
		new PayablesApp().APManualCheckPostingJournal();
	}
	@When("Select Reports-->Favorite Reports-->APSystemCheckRegister from Payables menu bar.")
	public void select_Reports_Favorite_Reports_APSystemCheckRegister_from_Payables_menu_bar() {
		new PayablesApp().APSystemCheckRegister();
	}
	//****************************************************Reports ep codes TC67 - TC **************************
	@When("Click ep options button to give (.*) for report print.")
	public void click_ep_options_button_to_give_epcodes_for_report_print(String epcodes) throws FindFailed, InterruptedException {
		new PayablesApp().Give_epcodes(epcodes);
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
