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

