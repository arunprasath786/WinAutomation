Feature: payables feature verification.
Background:
Given launch payables application.

Scenario: TC01 login to payables.
And enter username & password.
When click on open button
And close the application.
@Reports 
Scenario: TC02 Print Invoice Batch List report from menu bar options.
And enter username & password.
When click on open button
And Select Reports-->Batch Listings-->Invoice Batch List from Payables menu bar.
And Click ep icon button for report print.
And Exit Payables application.
@Reports
Scenario: TC03 Print Manual Check Batch List report from menu bar options.
And enter username & password.
When click on open button
And Select Reports-->Batch Listings-->Manual Check Batch List from Payables menu bar.
And Click ep icon button for report print.
And Exit Payables application.
@Reports
Scenario: TC04 Print Letters report from menu bar options.
And enter username & password.
When click on open button
And Select Reports-->Letters from Payables menu bar.
And Click ep icon button for report print & click ok button after print.
And Exit Payables application.
@Reports
Scenario: TC05 Print Open Payables report from menu bar options.
And enter username & password.
When click on open button
And Select Reports-->Transaction and Analysis-->Open Payables from Payables menu bar.
And Click ep icon button for report print.
And Exit Payables application.
@Reports
Scenario: TC06 Print Aged Open Payables report from menu bar options.
And enter username & password.
When click on open button
And Select Reports-->Transaction and Analysis-->Aged Open Payables from Payables menu bar.
And Click ep icon button for report print.
And Exit Payables application.
@Reports
Scenario: TC07 Print Aged Overdue Payables report from menu bar options.
And enter username & password.
When click on open button
And Select Reports-->Transaction and Analysis-->Aged Overdue Payables from Payables menu bar.
And Click ep icon button for report print.
And Exit Payables application.
@Reports
Scenario: TC08 Print Aged Cash Requirements report from menu bar options.
And enter username & password.
When click on open button
And Select Reports-->Transaction and Analysis-->Aged Cash Requirements from Payables menu bar.
And Click ep icon button for report print.
And Exit Payables application.
@Reports
Scenario: TC09 Print Vendor Transactions report from menu bar options.
And enter username & password.
When click on open button
And Select Reports-->Transaction and Analysis-->Vendor Transactions  from Payables menu bar.
And Click ep icon button for report print.
And Exit Payables application.
@Reports
Scenario: TC10 Print Vendor List report from menu bar options.
And enter username & password.
When click on open button
And Select Reports-->Transaction and Analysis-->Vendor List  from Payables menu bar.
And Click ep icon button for report print.
And Exit Payables application.
@Reports
Scenario: TC11 Print Tax tracking report from menu bar options.
And enter username & password.
When click on open button
And Select Reports-->Transaction and Analysis-->Tax tracking  from Payables menu bar.
And Click ep icon button for report print & dont clear records after print.
And Exit Payables application.
@Reports
Scenario: TC12 Print G/L Transaction report from menu bar options.
And enter username & password.
When click on open button
And Select Reports-->Print Consolidate G/L Transaction report  from Payables menu bar.
And Click ep icon button for report print.
And Exit Payables application.
@Reports
Scenario: TC13 Print 1099's report from menu bar options.
And enter username & password.
When click on open button
And Select Reports-->onezeroninenine report  from Payables menu bar.
And Click ep icon button for report print & click yes to ptint.
And Exit Payables application.
@Reports
Scenario: TC14 Print 5018's report from menu bar options.
And enter username & password.
When click on open button
And Select Reports-->fivezerooneeight  from Payables menu bar.
And Click ep icon button for report print & click yes to ptint.
And Exit Payables application.
@Reports
Scenario: TC15 Print Batch Status report from menu bar options.
And enter username & password.
When click on open button
And Select Reports-->General Reports-->Batch status  from Payables menu bar.
And Click ep icon button for report print.
And Exit Payables application.
@Reports
Scenario: TC16 Print System check Status report from menu bar options.
And enter username & password.
When click on open button
And Select Reports-->General Reports-->System check Status  from Payables menu bar.
And Click ep icon button for report print.
And Exit Payables application.
@Reports
Scenario: TC17 Print Company Profile report from menu bar options.
And enter username & password.
When click on open button
And Select Reports-->General Reports-->Company Profile from Payables menu bar.
And Click ep icon button for report print.
And Exit Payables application.
@Reports
Scenario: TC18 Print Banks report from menu bar options.
And enter username & password.
When click on open button
And Select Reports-->General Reports-->Banks from Payables menu bar.
And Click ep icon button for report print.
And Exit Payables application.
@Reports
Scenario: TC19 Print Distributions report from menu bar options.
And enter username & password.
When click on open button
And Select Reports-->General Reports-->Distributions from Payables menu bar.
And Click ep icon button for report print.
And Exit Payables application.
@Reports
Scenario: TC20 Print Distribution Sets report from menu bar options.
And enter username & password.
When click on open button
And Select Reports-->General Reports-->Distribution Sets from Payables menu bar.
And Click ep icon button for report print.
And Exit Payables application.
@Reports
Scenario: TC21 Print Control Accounts report from menu bar options.
And enter username & password.
When click on open button
And Select Reports-->General Reports-->Control Accounts from Payables menu bar.
And Click ep icon button for report print.
And Exit Payables application.
@Reports
Scenario: TC22 Print Terms report from menu bar options.
And enter username & password.
When click on open button
And Select Reports-->General Reports-->Terms from Payables menu bar.
And Click ep icon button for report print.
And Exit Payables application.
@Reports
Scenario: TC23 Print Vendor Notes report from menu bar options.
And enter username & password.
When click on open button
And Select Reports-->General Reports-->Vendor Notes from Payables menu bar.
And Click ep icon button for report print.
And Exit Payables application.
@Reports
Scenario: TC24 Print Form Types report from menu bar options.
And enter username & password.
When click on open button
And Select Reports-->General Reports-->Form Types from Payables menu bar.
And Click ep icon button for report print.
And Exit Payables application.
@Reports
Scenario: TC25 Print Report Groups report from menu bar options.
And enter username & password.
When click on open button
And Select Reports-->General Reports-->Report Groups from Payables menu bar.
And Click ep icon button for report print.
And Exit Payables application.
@Batch
Scenario: TC26 Create an invoice batch for vendor.
And enter username & password.
When click on open button
And Click Invoices icon in menu bar.
And Click new button & enter batch description for new batch.
Then Enter vendor code.
And Click new button & give distribution,amount details.
Then Click ok button & close batch window. 
And Exit Payables application.
@Batch
Scenario: TC27 Edit an invoice batch for vendor.
And enter username & password.
When click on open button
And Click Invoices icon in menu bar.
And Select a batch to edit & enter description field.
Then Click ok button & close batch window. 
And Exit Payables application.
@Batch
Scenario: TC28 post an invoice batch for vendor.
And enter username & password.
When click on open button
And Click Invoices icon in menu bar.
And Select a batch & post.
And Exit Payables application.
@Batch
Scenario: TC29 post an invoice credit note batch for vendor.
And enter username & password.
When click on open button
And Click Invoices icon in menu bar.
And Click new button & enter batch description for credit note batch.
Then Enter document type & vendor code.
And Click new button & give distribution,amount details for credit note.
Then Click ok button & close batch window.
And Post the batch.
And Exit Payables application.
@Batch
Scenario: TC30 post an invoice Debit note batch for vendor.
And enter username & password.
When click on open button
And Click Invoices icon in menu bar.
And Click new button & enter batch description for Debit note batch.
Then Enter document type & vendor code for Debit note..
And Click new button & give distribution,amount details for Debit note.
Then Click ok button & close batch window.
And Post the batch.
And Exit Payables application.
@Batch
Scenario: TC31 post an check payment(SIGNET) batch for vendor.
And enter username & password.
When click on open button
And Click Checks icon in menu bar.
And Click new button & enter new check batch details.
Then Give vendor,check details & apply amount. 
Then Click ok button & close batch window.
And Post the batch.
And Exit Payables application.
@Batch
Scenario: TC32 post an check payment(CRESTAR) batch for vendor.
And enter username & password.
When click on open button
And Click Checks icon in menu bar.
And Click new button & enter new check batch details for CRESTAR .
Then Give vendor,check details & apply amount for CRESTAR. 
Then Click ok button & close batch window.
And Post the batch.
And Exit Payables application.
@Batch
Scenario: TC33 post an check payment(SIGNET EFT) batch for vendor.
And enter username & password.
When click on open button
And Click Checks icon in menu bar.
And Click new button & enter new check batch details for SIGNET EFT .
Then Give vendor,check details & apply amount for SIGNET EFT . 
Then Click ok button & close batch window.
And Post the batch.
And Exit Payables application.
@Batch
Scenario: TC34 post an check payment(RBL) batch for vendor.
And enter username & password.
When click on open button
And Click Checks icon in menu bar.
And Click new button & enter new check batch details for RBL.
Then Give vendor,check details & apply amount for RBL. 
Then Click ok button & close batch window.
And Post the batch.
And Exit Payables application.
@Batch
Scenario: TC35 post an check payment(AMEX) batch for vendor.
And enter username & password.
When click on open button
And Click Checks icon in menu bar.
And Click new button & enter new check batch details for AMEX.
Then Give vendor,check details & apply amount for AMEX. 
Then Click ok button & close batch window.
And Post the batch.
And Exit Payables application.
@Batch
Scenario: TC36 post an cash invoice batch for vendor.
And enter username & password.
When click on open button
And Click Checks icon in menu bar.
And Click new button & enter new check batch details for cash invoice.
Then Give vendor,check details & apply amount for cash invoice. 
Then Click ok button & close batch window.
And Post the batch.
And Exit Payables application.
@Batch
Scenario: TC37 post an prepayment batch for vendor.
And enter username & password.
When click on open button
And Click Checks icon in menu bar.
And Click new button & enter new check batch details for prepayment.
Then Give vendor,check details & apply amount for prepayment. 
Then Click ok button & close batch window.
And Post the batch.
And Exit Payables application.
@Batch
Scenario: TC38 Create a check batch & check copy batch feature.
And enter username & password.
When click on open button
And Click Checks icon in menu bar.
And Click new button & enter new check batch details for copy batch.
Then Give vendor,check details & apply amount for copy batch. 
And Select copy batch options.
Then Click ok button & close batch window.
And Post the batch.
And Exit Payables application.
@Batch @Edit
Scenario: TC39 Edit bank to generate auto check number.
And enter username & password.
When click on open button
And Click Edit-->Banks from menubar options.
And Click Edit button to Edit signet bank details.
Then Navigate to series tab & enable use a separate check series.
And Exit Payables application.
@Batch @Edit
Scenario: TC40 post an check payment(SIGNET) batch for vendor with auto check number.
And enter username & password.
When click on open button
And Click Checks icon in menu bar.
And Click new button & enter new check batch details for auto check number. .
Then Give vendor,check details & apply amount for auto check number. 
Then Click ok button & close batch window.
And Post the batch.
And Exit Payables application.
@Batch
Scenario: TC41 post an Adjustment batch for vendor.
And enter username & password.
When click on open button
And Click Adjust icon in menu bar.
And Select a vendor & give adjustment amount details.
And Post the adjustment batch.
And Exit Payables application.
@File
Scenario: TC42 Data Integrity Check.
And enter username & password.
When click on open button
And Select File-->Data Integrity Check from AP menu bar.
And Click Check button for data integrity check.
And Exit Payables application.
@File
Scenario: TC43 Setup Security Group using file menu option.
And enter username & password.
When click on open button
And Select File-->Security Group Setup from AP menu bar.
And Click New button & Give group name,untick Help option in edit security group window & submit it by clicking ok button.
And Exit Payables application.
@File
Scenario: TC44 Create new useraccount using file menu user setup option.
And enter username & password.
When click on open button
And Select File-->User Setup from AP menu bar.
And Click New button & Give new user details in edit user window & submit it by clicking ok button.
And Exit Payables application.
@File
Scenario: TC45 Login with newly created user account.
And enter username & password.
When click on open button
And Try logging in with newly created user account.
And Exit the newly created user account & login with old user account.
And Exit Payables application.
@File
Scenario: TC46 Login with file open option.
And enter username & password.
When click on open button
And Select File-->Open from AP menu bar & login.
And Exit Payables application.
@File
Scenario: TC47 Backup payables data using file menu option.
And enter username & password.
When click on open button
And Select File-->Backup-->Payables Data from AP menu bar option.
And Click Start button to take Backup.
And Exit Payables application.
@File
Scenario: TC48 Backup Related data using file menu option.
And enter username & password.
When click on open button
And Select File-->Backup-->Related Data from AP menu bar option.
And Click Start button to take Backup.
And Exit Payables application.
@File
Scenario: TC49 Backup Complete data set using file menu option.
And enter username & password.
When click on open button
And Select File-->Backup-->CompleteData set from AP menu bar option.
And Click Start button to take Backup.
And Exit Payables application.
@File
Scenario: TC50 access backup options using file menu option.
And enter username & password.
When click on open button
And Select File-->Backup-->Backup Options from AP menu bar option.
And Exit Payables application.
@File
Scenario: TC51 export vendor using file menu option.
And enter username & password.
When click on open button
And Select File-->Export-->Vendors from AP menu bar option.
And Click Export button for exporting vendor data.
And Exit Payables application.
@Batch
Scenario: TC52 Create an Archive invoice batch for vendor & post through Invoice posting.
And enter username & password.
When click on open button
And Select Edit-->Archived Invoices from AP menu bar option.
And Click new button & enter batch description for Archive batch.
Then Enter vendor code & Click new button to give distribution,amount details.
Then Click ok button & close batch window.
And Copy the batch to current batch. 
And Click Invoices icon in menu bar.
And post the copied archive batch.
And Exit Payables application.
@Batch
Scenario: TC53 Create an Archive Manual Check batch for vendor & post through Invoice posting.
And enter username & password.
When click on open button
And Select Payments-->Archived Manual Checks from AP menu bar option.
And Click new button & enter new check batch details for Archived manual check batch.
Then Give vendor,check details & apply amount for Archived manual check batch. 
Then Click ok button & close batch window.
And Copy the batch to current batch. 
And Click Checks icon in menu bar to post archived batch.
And post the copied Archived archive batch.
And Exit Payables application.
@File1
Scenario: TC54 Add notes to vendor.
And enter username & password.
When click on open button
And Click vendors icon from tool bar options.
And Add notes to vendor & give confirmation.
And Exit Payables application.
@Reports
Scenario: TC55 Print AgedOpenPayablesSummary report from favorites report menu bar options.
And enter username & password.
When click on open button
And Select Reports-->Favorite Reports-->AgedOpenPayablesSummary from Payables menu bar.
And Click ep icon button for report print.
And Exit Payables application.
@Reports
Scenario: TC56 Print AgedOverduePayablesSummary report from favorites report menu bar options.
And enter username & password.
When click on open button
And Select Reports-->Favorite Reports-->AgedOverduePayablesSummary from Payables menu bar.
And Click ep icon button for report print.
And Exit Payables application.
@Reports
Scenario: TC57 Print APAdjustmentBatchListing report from favorites report menu bar options.
And enter username & password.
When click on open button
And Select Reports-->Favorite Reports-->APAdjustmentBatchListing from Payables menu bar.
And Click ep icon button for report print.
And Exit Payables application.
@Reports
Scenario: TC58 Print APAdjustmentPostingJournal report from favorites report menu bar options.
And enter username & password.
When click on open button
And Select Reports-->Favorite Reports-->APAdjustmentPostingJournal from Payables menu bar.
And Click ep icon button for report print.
And Exit Payables application.
@Reports
Scenario: TC59 Print APGLTransactionsByAccount report from favorites report menu bar options.
And enter username & password.
When click on open button
And Select Reports-->Favorite Reports-->APGLTransactionsByAccount from Payables menu bar.
And Click ep icon button for report print.
And Exit Payables application.
@Reports
Scenario: TC60 Print APGLTransactionsByDate report from favorites report menu bar options.
And enter username & password.
When click on open button
And Select Reports-->Favorite Reports-->APGLTransactionsByDate from Payables menu bar.
And Click ep icon button for report print.
And Exit Payables application.
@Reports
Scenario: TC61 Print APGLTransactionsByEntry report from favorites report menu bar options.
And enter username & password.
When click on open button
And Select Reports-->Favorite Reports-->APGLTransactionsByEntry from Payables menu bar.
And Click ep icon button for report print.
And Exit Payables application.
@Reports
Scenario: TC62 Print APInvoiceBatchListing report from favorites report menu bar options.
And enter username & password.
When click on open button
And Select Reports-->Favorite Reports-->APInvoiceBatchListing from Payables menu bar.
And Click ep icon button for report print.
And Exit Payables application.
@Reports
Scenario: TC63 Print APInvoicePostingJournal report from favorites report menu bar options.
And enter username & password.
When click on open button
And Select Reports-->Favorite Reports-->APInvoicePostingJournal from Payables menu bar.
And Click ep icon button for report print.
And Exit Payables application.
@Reports
Scenario: TC64 Print APManCheckBatchListing report from favorites report menu bar options.
And enter username & password.
When click on open button
And Select Reports-->Favorite Reports-->APManCheckBatchListing from Payables menu bar.
And Click ep icon button for report print.
And Exit Payables application.
@Reports
Scenario: TC65 Print APManualCheckPostingJournal report from favorites report menu bar options.
And enter username & password.
When click on open button
And Select Reports-->Favorite Reports-->APManualCheckPostingJournal from Payables menu bar.
And Click ep icon button for report print.
And Exit Payables application.
@Reports
Scenario: TC66 Print APSystemCheckRegister report from favorites report menu bar options.
And enter username & password.
When click on open button
And Select Reports-->Favorite Reports-->APSystemCheckRegister from Payables menu bar.
And Click ep icon button for report print.
And Exit Payables application.
@epcodes
Scenario Outline: TC67 Print Invoice Batch List report with ep codes from menu bar options.
And enter username & password.
When click on open button
And Select Reports-->Batch Listings-->Invoice Batch List from Payables menu bar.
And Click ep options button to give <epcodes> for report print.
And Exit Payables application.
Examples:
|epcodes|
|%BTTInvoiceBatchListing%usr.pdf|
|%BTTInvoiceBatchListing%sdt.pdf|
|%BTTInvoiceBatchListing%dat.pdf|
|%BTTInvoiceBatchListing%tim.pdf|
|%BTTInvoiceBatchListing%cmp.pdf|
|%BTTInvoiceBatchListing%cno.pdf|
|%BTTInvoiceBatchListing%ext.pdf|
|%BTTInvoiceBatchListing%BAT.pdf|
@epcodes1
Scenario Outline: TC68 Print Manual Check Batch List report with ep codes from menu bar options.
And enter username & password.
When click on open button
And Select Reports-->Batch Listings-->Manual Check Batch List from Payables menu bar.
And Click ep options button to give <epcodes> for report print.
And Exit Payables application.
Examples:
|epcodes|
|%BTTMCheckBatchListing%usr.pdf|
|%BTTMCheckBatchListing%sdt.pdf|
|%BTTMCheckBatchListing%dat.pdf|
|%BTTMCheckBatchListing%tim.pdf|
|%BTTMCheckBatchListing%cmp.pdf|
|%BTTMCheckBatchListing%cno.pdf|
|%BTTMCheckBatchListing%ext.pdf|
|%BTTMCheckBatchListing%BAT.pdf|