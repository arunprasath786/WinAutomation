Feature: BankRec feature verification.
Background:
Given launch BankRec application.

Scenario: TC01 login to BankRec.
And enter username & password for BankRec.
When click open button after entering password
And close BankRec application.

Scenario: TC02 Data Integrity Check.
And enter username & password for BankRec.
When click open button after entering password
And Select File-->Data Integrity Check from BankRec menu bar.
And Click Check button.
And Exit BankRec application.
@Reports 
Scenario: TC03 Print Company Profile report from menu bar options.
And enter username & password for BankRec.
When click open button after entering password
And Select Reports-->Maintenance Reports-->Company Profile from BankRec menu bar.
And Click ep icon button for report print.
And Exit BankRec application.
@Reports
Scenario: TC04 Print Banks report from menu bar options.
And enter username & password for BankRec.
When click open button after entering password
And Select Reports-->Maintenance Reports-->Banks from BankRec menu bar.
And Click ep icon button for report print.
And Exit BankRec application.
@Reports
Scenario: TC05 Print Distributions report from menu bar options.
And enter username & password for BankRec.
When click open button after entering password
And Select Reports-->Maintenance Reports-->Distributions from BankRec menu bar.
And Click ep icon button for report print.
And Exit BankRec application.
@Reports
Scenario: TC06 Print Distribution sets report from menu bar options.
And enter username & password for BankRec.
When click open button after entering password
And Select Reports-->Maintenance Reports-->Distribution sets from BankRec menu bar.
And Click ep icon button for report print.
And Exit BankRec application.
@Reports
Scenario: TC07 Print Bank Notes report from menu bar options.
And enter username & password for BankRec.
When click open button after entering password
And Select Reports-->Maintenance Reports-->Bank Notes from BankRec menu bar.
And Click ep icon button for report print.
And Exit BankRec application.
@Reports
Scenario: TC08 Print Batch Status report from menu bar options.
And enter username & password for BankRec.
When click open button after entering password
And Select Reports-->Batch Reports-->Batch Status from BankRec menu bar.
And Click ep icon button for report print & dont clear batches after printing.
And Exit BankRec application.
@Reports
Scenario: TC09 Print Batches report from menu bar options.
And enter username & password for BankRec.
When click open button after entering password
And Select Reports-->Batch Reports-->Batches from BankRec menu bar.
And Click ep icon button for report print.
And Exit BankRec application.
@Reports
Scenario: TC10 Print G/L Transaction report from menu bar options.
And enter username & password for BankRec.
When click open button after entering password
And Select Reports-->Print/Consolidate G/L Transactions from BankRec menu bar.
And Click ep icon button for report print & Close the print report window.
And Exit BankRec application.
@Reports
Scenario: TC11 Print Bank Transaction report from menu bar options.
And enter username & password for BankRec.
When click open button after entering password
And Select Reports-->Bank Transactions from BankRec menu bar.
And Click ep icon button for report print.
And Exit BankRec application.
@Reports
Scenario: TC12 Print Bank Historical Transaction report from menu bar options.
And enter username & password for BankRec.
When click open button after entering password
And Select Reports-->Bank Historical Transactions from BankRec menu bar.
And Click ep icon button for report print.
And Exit BankRec application.
@Reports
Scenario: TC13 Print Bank Reconciliation report from menu bar options.
And enter username & password for BankRec.
When click open button after entering password
And Select Reports-->Bank Reconciliation from BankRec menu bar.
And Click ep icon button for report print.
And Exit BankRec application.
@Reports
Scenario: TC14 Print Deposit Slip report from menu bar options.
And enter username & password for BankRec.
When click open button after entering password
And Select Reports-->Deposit Slip from BankRec menu bar.
And Enter bank reference to print doposit slip.
And Click ep icon button for report print.
And Exit BankRec application.
@Reports
Scenario: TC15 Print Cash Flow report from menu bar options.
And enter username & password for BankRec.
When click open button after entering password
And Select Reports-->Cash Flow from BankRec menu bar.
And Click ep icon button for report print.
And Exit BankRec application.
@Reports
Scenario: TC16 Print Reconciliation Worksheet report from menu bar options.
And enter username & password for BankRec.
When click open button after entering password
And Select Reports-->Reconciliation Worksheet from BankRec menu bar.
And Click ep icon button for report print.
And Exit BankRec application.
@Reports
Scenario: TC17 Print Receipt Audit List report from menu bar options.
And enter username & password for BankRec.
When click open button after entering password
And Select Reports-->Receipt Audit List from BankRec menu bar.
And Click ep icon button for report print & dont clear the list by clicking no in confirm window..
And Exit BankRec application.
 
Scenario: TC18 Create new useraccount using file menu user setup option.
And enter username & password for BankRec.
When click open button after entering password
And Select File-->User Setup from BankRec menu bar.
Then Click New button to add user.
And Give new user details in edit user window & submit it by clicking ok button.
And Try logging in with new user account.
And Exit the new user account & login with old user account.
And Exit BankRec application.

Scenario: TC19 Setup Security Group using file menu option.
And enter username & password for BankRec.
When click open button after entering password
And Select File-->Security Group Setup from BankRec menu bar.
Then Click New button to add user.
And Give group name,untick Help option in edit security group window & submit it by clicking ok button.
And Exit BankRec application.

Scenario: TC20 Add new currency codes using file menu option.
And enter username & password for BankRec.
When click open button after entering password
And Select File-->Currency Codes from BankRec menu bar.
Then Click New button to add user.
And Give currency details & click ok in Edit currency code window.
And Exit BankRec application.
@sanity
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
@sanity
Scenario: TC22 Edit the batch entry for receipt before post.
And enter username & password for BankRec.
When click open button after entering password
And Click Batch Entry icon from tool bar.
Then Select a batch & click Edit button.
And confirm the changes.
And Exit BankRec application.
@sanity
Scenario: TC23 Rename the batch entry for receipt before post.
And enter username & password for BankRec.
When click open button after entering password
And Click Batch Entry icon from tool bar.
Then Select a batch & click Rename button.
And post the batch.
And Exit BankRec application.





























