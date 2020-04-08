Feature: BankRec feature verification.
Background:
Given launch BankRec application.
@Demo @login
Scenario: TC01 login to BankRec.
And enter username & password for BankRec.
When click open button after entering password
And close BankRec application.
@File @Demo
Scenario: TC02 Data Integrity Check.
And enter username & password for BankRec.
When click open button after entering password
And Select File-->Data Integrity Check from BankRec menu bar.
And Click Check button.
And Exit BankRec application.
@Reports @Demo
Scenario: TC03 Print Company Profile report from menu bar options.
And enter username & password for BankRec.
When click open button after entering password
And Select Reports-->Maintenance Reports-->Company Profile from BankRec menu bar.
Then Select report type from favorites & print report.
And Exit BankRec application.
@Reports @Demo
Scenario: TC04 Print Banks report from menu bar options.
And enter username & password for BankRec.
When click open button after entering password
And Select Reports-->Maintenance Reports-->Banks from BankRec menu bar.
And Click ep icon button for report print.
And Exit BankRec application.
@Reports @Demo
Scenario: TC05 Print Distributions report from menu bar options.
And enter username & password for BankRec.
When click open button after entering password
And Select Reports-->Maintenance Reports-->Distributions from BankRec menu bar.
And Click ep icon button for report print.
And Exit BankRec application.
@Reports @Demo
Scenario: TC06 Print Distribution sets report from menu bar options.
And enter username & password for BankRec.
When click open button after entering password
And Select Reports-->Maintenance Reports-->Distribution sets from BankRec menu bar.
And Click ep icon button for report print.
And Exit BankRec application.
@Reports @Demo
Scenario: TC07 Print Bank Notes report from menu bar options.
And enter username & password for BankRec.
When click open button after entering password
And Select Reports-->Maintenance Reports-->Bank Notes from BankRec menu bar.
And Click ep icon button for report print.
And Exit BankRec application.
@Reports @Demo
Scenario: TC08 Print Batch Status report from menu bar options.
And enter username & password for BankRec.
When click open button after entering password
And Select Reports-->Batch Reports-->Batch Status from BankRec menu bar.
And Click ep icon button for report print & dont clear batches after printing.
And Exit BankRec application.
@Reports @Demo
Scenario: TC09 Print Batches report from menu bar options.
And enter username & password for BankRec.
When click open button after entering password
And Select Reports-->Batch Reports-->Batches from BankRec menu bar.
And Click ep icon button for report print.
And Exit BankRec application.
@Reports  @Demo
Scenario: TC10 Print G/L Transaction report from menu bar options.
And enter username & password for BankRec.
When click open button after entering password
And Select Reports-->Print/Consolidate G/L Transactions from BankRec menu bar.
And Click ep icon button for report print & Close the print report window.
And Exit BankRec application.
@Reports @Demo
Scenario: TC11 Print Bank Transaction report from menu bar options.
And enter username & password for BankRec.
When click open button after entering password
And Select Reports-->Bank Transactions from BankRec menu bar.
And Click ep icon button for report print.
And Exit BankRec application.
@Reports @Demo
Scenario: TC12 Print Bank Historical Transaction report from menu bar options.
And enter username & password for BankRec.
When click open button after entering password
And Select Reports-->Bank Historical Transactions from BankRec menu bar.
And Click ep icon button for report print.
And Exit BankRec application.
@Reports @Demo
Scenario: TC13 Print Bank Reconciliation report from menu bar options.
And enter username & password for BankRec.
When click open button after entering password
And Select Reports-->Bank Reconciliation from BankRec menu bar.
And Click ep icon button for report print.
And Exit BankRec application.
@Reports @Demo
Scenario: TC14 Print Deposit Slip report from menu bar options.
And enter username & password for BankRec.
When click open button after entering password
And Select Reports-->Deposit Slip from BankRec menu bar.
And Enter bank reference to print doposit slip.
And Click ep icon button for report print.
And Exit BankRec application.
@Reports @Demo
Scenario: TC15 Print Cash Flow report from menu bar options.
And enter username & password for BankRec.
When click open button after entering password
And Select Reports-->Cash Flow from BankRec menu bar.
And Click ep icon button for report print.
And Exit BankRec application.
@Reports @Demo
Scenario: TC16 Print Reconciliation Worksheet report from menu bar options.
And enter username & password for BankRec.
When click open button after entering password
And Select Reports-->Reconciliation Worksheet from BankRec menu bar.
And Click ep icon button for report print.
And Exit BankRec application.
@Reports @Demo
Scenario: TC17 Print Receipt Audit List report from menu bar options.
And enter username & password for BankRec.
When click open button after entering password
And Select Reports-->Receipt Audit List from BankRec menu bar.
And Click ep icon button for report print & dont clear the list by clicking no in confirm window..
And Exit BankRec application.
 @File @Demo1
Scenario: TC18 Create new useraccount using file menu user setup option.
And enter username & password for BankRec.
When click open button after entering password
And Select File-->User Setup from BankRec menu bar.
Then Click New button to add user.
And Give new user details in edit user window & submit it by clicking ok button.
And Try logging in with new user account.
And Exit the new user account & login with old user account.
And Exit BankRec application.
@File 
Scenario: TC19 Setup Security Group using file menu option.
And enter username & password for BankRec.
When click open button after entering password
And Select File-->Security Group Setup from BankRec menu bar.
Then Click New button to add user.
And Give group name,untick Help option in edit security group window & submit it by clicking ok button.
And Exit BankRec application.
@File1
Scenario: TC20 Add new currency codes using file menu option.
And enter username & password for BankRec.
When click open button after entering password
#And Select File-->Currency Codes from BankRec menu bar.
#Then Click New button to add user.
#And Give currency details & click ok in Edit currency code window.
And Exit BankRec application.
@Batch @Demo
Scenario: TC21 Create batch entry for receipt
And enter username & password for BankRec.
When click open button after entering password
And Click Batch Entry icon from tool bar.
Then Click new button to add new batch entry.
And Select bank code,give description & then click ok button.
And Enter  Customer code,receipt amount.
And Apply invoice amount & click ok button.
Then close the batch window.
And Exit BankRec application.
@Batch @Demo
Scenario: TC22 Edit the batch entry for receipt before post.
And enter username & password for BankRec.
When click open button after entering password
And Click Batch Entry icon from tool bar.
Then Select a batch & click Edit button.
And confirm the changes.
And Exit BankRec application.
@Batch @Demo
Scenario: TC23 Rename the batch entry for receipt before post.
And enter username & password for BankRec.
When click open button after entering password
And Click Batch Entry icon from tool bar.
Then Select a batch & click Rename button.
And post the batch.
And Exit BankRec application.
@Batch @Demo
Scenario: TC24 Create batch receipt entry for miscellanious customer. 
And enter username & password for BankRec.
When click open button after entering password
And Click Batch Entry icon from tool bar.
Then Click new button to add new batch entry.
And Select bank code,bank reference,give description & then click ok button.
And Enter receipt amount & click New button to add distribution code.
And click ok button to submit the batch.
Then close the batch window.
And post the batch for miscellanious receipt.
And Exit BankRec application.
@Batch @Demo
Scenario: TC25 Create payment batch entry for vendor 
And enter username & password for BankRec.
When click open button after entering password
And Click Batch Entry icon from tool bar.
Then Click new button to add new batch entry.
And Enter bank details & click ok button.
And Click payments radio button & give vendor details.
And click ok button to submit the batch.
Then close the batch window.
And post the batch.
And Exit BankRec application.
@Batch @Demo
Scenario: TC26 Transfer amount from one bank to another
And enter username & password for BankRec.
When click open button after entering password
And Click Batch Entry icon from tool bar.
Then Click new button to add new batch entry.
And Enter bank details for transfer batch & click ok button.
And Click Transfers radio button & give transfer amount,bank details.
And click ok button to submit the batch.
Then close the batch window.
And post the batch.
And Exit BankRec application.
@Demo @Demo
Scenario: TC27 View customer details in BankRec.
And enter username & password for BankRec.
When click open button after entering password
And Click Customers icon from tool bar.
And Click View button to see customer details.
Then Click Next button to see the next customer details.
And Exit BankRec application.
@Demo
Scenario: TC28 Find a customer by highlight,view,edit actions from customer list in BankRec.
And enter username & password for BankRec.
When click open button after entering password
And Click Customers icon from tool bar.
And Click find button & enter customer code/name with action radio button to find a customer.
And Exit BankRec application.
@efcodes1 @Demo
Scenario Outline: TC029 Print Company Profile report using epcodes from menu bar options.
And enter username & password for BankRec.
When click open button after entering password
And Select Reports-->Maintenance Reports-->Company Profile from BankRec menu bar.
And Click ep options button to give <epcodes> for company profile report print.
And Exit BankRec application.
Examples:
|epcodes|
|BRCompanyProfile%usr.pdf|
|BRCompanyProfile%sdt.pdf|
|BRCompanyProfile%dat.pdf|
|BRCompanyProfile%tim.pdf|
|BRCompanyProfile%cmp.pdf|
|BRCompanyProfile%cno.pdf|
|BRCompanyProfile%ext.pdf|

@efcodes @Demo
Scenario Outline: TC30 Print Banks report using epcodes from menu bar options.
And enter username & password for BankRec.
When click open button after entering password
And Select Reports-->Maintenance Reports-->Banks from BankRec menu bar.
And Click ep options button to give <epcodes> for Banks report print.
And Exit BankRec application.
Examples:
|epcodes|
|BRBanks%bat.pdf|
|BRBanks%btt.pdf|
|BRBanks%pjn.pdf|
|BRBanks%frm.pdf|
|BRBanks%cdt.pdf|
|BRBanks%sym.pdf|
|BRBanks%dym.pdf|
@efcodes
Scenario Outline: TC31 Print Distribution report using epcodes from menu bar options.
And enter username & password for BankRec.
When click open button after entering password
And Select Reports-->Maintenance Reports-->Distributions from BankRec menu bar.
And Click ep options button to give <epcodes> for Distributions report print.
And Exit BankRec application.
Examples:
|epcodes|
|BRDistributions%bat.pdf|
|BRDistributions%btt.pdf|
|BRDistributions%pjn.pdf|
|BRDistributions%frm.pdf|
|BRDistributions%cdt.pdf|
|BRDistributions%sym.pdf|
|BRDistributions%dym.pdf|
@efcodes
Scenario Outline: TC32 Print Distribution sets report using epcodes from menu bar options.
And enter username & password for BankRec.
When click open button after entering password
And Select Reports-->Maintenance Reports-->Distribution sets from BankRec menu bar.
And Click ep options button to give <epcodes> for Distribution sets report print.
And Exit BankRec application.
Examples:
|epcodes|
|BRDistributionsets%usr.pdf|
|BRDistributionsets%sdt.pdf|
|BRDistributionsets%dat.pdf|
|BRDistributionsets%tim.pdf|
|BRDistributionsets%cmp.pdf|
|BRDistributionsets%cno.pdf|
|BRDistributionsets%ext.pdf|
@efcodes
Scenario Outline: TC33 Print Bank Notes report using epcodes from menu bar options.
And enter username & password for BankRec.
When click open button after entering password
And Select Reports-->Maintenance Reports-->Bank Notes from BankRec menu bar.
And Click ep options button to give <epcodes> for Bank Notes report print.
And Exit BankRec application.
Examples:
|epcodes|
|BRBankNotes%usr.pdf|
|BRBankNotes%sdt.pdf|
|BRBankNotes%dat.pdf|
|BRBankNotes%tim.pdf|
|BRBankNotes%cmp.pdf|
|BRBankNotes%cno.pdf|
|BRBankNotes%ext.pdf|
@efcodes 
Scenario Outline: TC34 Print Batch Status report using epcodes from menu bar options.
And enter username & password for BankRec.
When click open button after entering password
And Select Reports-->Batch Reports-->Batch Status from BankRec menu bar.
And Click ep options button to give <epcodes> for Batch Status report print.
And Exit BankRec application.
Examples:
|epcodes|
|BRBatchStatus%usr.pdf|
|BRBatchStatus%sdt.pdf|
|BRBatchStatus%dat.pdf|
|BRBatchStatus%tim.pdf|
|BRBatchStatus%cmp.pdf|
|BRBatchStatus%cno.pdf|
|BRBatchStatus%ext.pdf|
@efcodes 
Scenario Outline: TC35 Print Batches report using epcodes from menu bar options.
And enter username & password for BankRec.
When click open button after entering password
And Select Reports-->Batch Reports-->Batches from BankRec menu bar.
And Click ep options button to give <epcodes> for Batches report print.
And Exit BankRec application.
Examples:
|epcodes|
|BRBatchListing%bat.pdf|
|BRBatchListing%btt.pdf|
|BRBatchListing%pjn.pdf|
|BRBatchListing%frm.pdf|
|BRBatchListing%cdt.pdf|
|BRBatchListing%sym.pdf|
|BRBatchListing%dym.pdf|
@efcodes 
Scenario Outline: TC36 Print G/L Transaction report using epcodes from menu bar options.
And enter username & password for BankRec.
When click open button after entering password
And Select Reports-->Print/Consolidate G/L Transactions from BankRec menu bar.
And Click ep options button to give <epcodes> for GLTransaction report print.
And Exit BankRec application.
Examples:
|epcodes|
|BRGLTransactions%bat.pdf|
|BRGLTransactions%btt.pdf|
|BRGLTransactions%pjn.pdf|
|BRGLTransactions%frm.pdf|
|BRGLTransactions%cdt.pdf|
|BRGLTransactions%sym.pdf|
|BRGLTransactions%dym.pdf|
@efcodes 
Scenario Outline: TC37 Print Bank Transaction report using epcodes from menu bar options.
And enter username & password for BankRec.
When click open button after entering password
And Select Reports-->Bank Transactions from BankRec menu bar.
And Click ep options button to give <epcodes> for Bank Transaction report print.
And Exit BankRec application.
Examples:
|epcodes|
|BRBankTransactions%usr.pdf|
|BRBankTransactions%sdt.pdf|
|BRBankTransactions%dat.pdf|
|BRBankTransactions%tim.pdf|
|BRBankTransactions%cmp.pdf|
|BRBankTransactions%cno.pdf|
|BRBankTransactions%ext.pdf|
@efcodes 
Scenario Outline: TC38 Print Bank Historical Transaction report using epcodes from menu bar options.
And enter username & password for BankRec.
When click open button after entering password
And Select Reports-->Bank Historical Transactions from BankRec menu bar.
And Click ep options button to give <epcodes> for Bank Historical Transaction report print.
And Exit BankRec application.
Examples:
|BRBankHistoricalTransactions%bat.pdf|
|BRBankHistoricalTransactions%btt.pdf|
|BRBankHistoricalTransactions%pjn.pdf|
|BRBankHistoricalTransactions%frm.pdf|
|BRBankHistoricalTransactions%cdt.pdf|
|BRBankHistoricalTransactions%sym.pdf|
|BRBankHistoricalTransactions%dym.pdf|
@efcodes 
Scenario Outline: TC39 Print Bank Reconciliation report using epcodes from menu bar options.
And enter username & password for BankRec.
When click open button after entering password
And Select Reports-->Bank Reconciliation from BankRec menu bar.
And Click ep options button to give <epcodes> for Bank Reconciliation report print.
And Exit BankRec application.
Examples:
|epcodes|
|BRBankReconciliation%usr.pdf| 
|BRBankReconciliation%sdt.pdf|
|BRBankReconciliation%dat.pdf|
|BRBankReconciliation%tim.pdf|
|BRBankReconciliation%cmp.pdf|
|BRBankReconciliation%cno.pdf|
|BRBankReconciliation%ext.pdf|
@efcodes 
Scenario Outline: TC40 Print Deposit Slip report using epcodes from menu bar options.
And enter username & password for BankRec.
When click open button after entering password
And Select Reports-->Deposit Slip from BankRec menu bar.
And Enter bank reference to print doposit slip.
And Click ep options button to give <epcodes> for Deposit Slip report print.
And Exit BankRec application.
Examples:
|epcodes|
|BRDepositSlip%bat.pdf|
|BRDepositSlip%btt.pdf|
|BRDepositSlip%pjn.pdf|
|BRDepositSlip%frm.pdf|
|BRDepositSlip%cdt.pdf|
|BRDepositSlip%sym.pdf|
|BRDepositSlip%dym.pdf|
@efcodes 
Scenario Outline: TC41 Print Cash Flow report using epcodes from menu bar options.
And enter username & password for BankRec.
When click open button after entering password
And Select Reports-->Cash Flow from BankRec menu bar.
And Click ep options button to give <epcodes> for Cash Flow report print.
And Exit BankRec application.
Examples:
|epcodes|
|BRCashFlow%usr.pdf| 
|BRCashFlow%sdt.pdf|
|BRCashFlow%dat.pdf|
|BRCashFlow%tim.pdf|
|BRCashFlow%cmp.pdf|
|BRCashFlow%cno.pdf|
|BRCashFlow%ext.pdf|
@efcodes 
Scenario Outline: TC42 Print Reconciliation Worksheet report using epcodes from menu bar options.
And enter username & password for BankRec.
When click open button after entering password
And Select Reports-->Reconciliation Worksheet from BankRec menu bar.
And Click ep options button to give <epcodes> for Reconciliation Worksheet report print.
And Exit BankRec application.
Examples:
|BRReconciliationWorksheet%bat.pdf|
|BRReconciliationWorksheet%btt.pdf|
|BRReconciliationWorksheet%pjn.pdf|
|BRReconciliationWorksheet%frm.pdf|
|BRReconciliationWorksheet%cdt.pdf|
|BRReconciliationWorksheet%sym.pdf|
|BRReconciliationWorksheet%dym.pdf|
@efcodes 
Scenario Outline: TC43 Print Receipt Audit List report using epcodes from menu bar options.
And enter username & password for BankRec.
When click open button after entering password
And Select Reports-->Receipt Audit List from BankRec menu bar.
And Click ep options button to give <epcodes> for Receipt Audit List report print.
And Exit BankRec application.
Examples:
|epcodes|
|BRReceiptAuditList%usr.pdf| 
|BRReceiptAuditList%sdt.pdf|
|BRReceiptAuditList%dat.pdf|
|BRReceiptAuditList%tim.pdf|
|BRReceiptAuditList%cmp.pdf|
|BRReceiptAuditList%cno.pdf|
|BRReceiptAuditList%ext.pdf|
@Batch @Demo
Scenario: TC44 Create batch entry for receipt & check copy batch feature.
And enter username & password for BankRec.
When click open button after entering password
And Click Batch Entry icon from tool bar.
Then Click new button to add new batch entry.
And Select bank code,give description & then click ok button.
And Enter  Customer code,receipt amount.
And Apply invoice amount & click ok button.
Then Click copy button to copy batch.
And Select the copy batch details.
Then close the batch window.
Then Click copy button to copy batch.
And copy to new batch & post both batches.
And Exit BankRec application.




