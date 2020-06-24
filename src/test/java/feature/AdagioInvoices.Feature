Feature: Invoices feature verification.
Background:
Given launch Invoices application.

Scenario: TC01 login to Invoices.
And enter username & password.
When click on open button
And close the application.

Scenario Outline: TC02 Post an invoice batch with different invoice item.
And enter username & password.
When click on open button
And Click invoice icon from Toolbar.
And Click New button & give batch desccription.
And Give customer code details for invoice batch.
Then Navigate to items section & click New buttton.
And Give invoice item code <itemcode> & click  ok button.
And close the batch windows.
Then post the batch & print the report.
And close the application.
Examples:
|itemcode|
|CLAMNL|

Scenario Outline: TC03 Post an invoice credit note batch with different invoice item.
And enter username & password.
When click on open button
And Click invoice icon from Toolbar.
And Click New button & give batch desccription.
And Give customer code details for invoice credit note batch.
Then Navigate to items section & click New buttton.
And Give invoice item code <itemcode> & click  ok button.
And close the batch windows.
Then post the batch & print the report.
And close the application.
Examples:
|itemcode|
|CLAMNL|

Scenario Outline: TC04 Post an invoice batch with different inventory item.
And enter username & password.
When click on open button
And Click invoice icon from Toolbar.
And Click New button & give batch desccription.
And Give customer code details for invoice batch.
Then Navigate to items section & click New buttton.
And Give inventory item code <inventorycode> & click  ok button.
And close the batch windows.
Then post the batch & print the report.
And close the application.
Examples:
|inventorycode|
|BKHUNI003|

Scenario Outline: TC05 Post an invoice credit note batch with different inventory item.
And enter username & password.
When click on open button
And Click invoice icon from Toolbar.
And Click New button & give batch desccription.
And Give customer code details for invoice credit note batch.
Then Navigate to items section & click New buttton.
And Give inventory item code <inventorycode> & click  ok button.
And close the batch windows.
Then post the batch & print the report.
And close the application.
Examples:
|inventorycode|
|BKHUNI003|

Scenario: TC06 Print Invoice Listing report from menu bar options.
And enter username & password.
When click on open button
And Select Reports-->Invoice Listing  from Invoice menu bar.
And Click ep icon button for report print.
And close the application.

Scenario: TC07 Print Tax Summary report from menu bar options.
And enter username & password.
When click on open button
And Select Reports-->Tax Summary  from Invoice menu bar.
And Click ep icon button for report print & dont clear the summary.
And close the application.

Scenario: TC08 Print Tax Tracking report from menu bar options.
And enter username & password.
When click on open button
And Select Reports-->Tax Tracking  from Invoice menu bar.
And Click ep icon button for report print & dont clear records.
And close the application.

Scenario: TC09 Print History Listing report from menu bar options.
And enter username & password.
When click on open button
And Select Reports-->History Listing  from Invoice menu bar.
And Click ep icon button for report print & wait till it completes.
And close the application.

Scenario: TC10 Print Deleted Invoices Audit List report from menu bar options.
And enter username & password.
When click on open button
And Select Reports-->Deleted Invoices Audit List  from Invoice menu bar.
And Click ep icon button for report print & dont clear the audit list.
And close the application.

Scenario: TC11 Print Batch Status report from menu bar options.
And enter username & password.
When click on open button
And Select Reports-->General Reports-->Batch Status  from Invoice menu bar.
And Click ep icon button for report print & dont purge the batch information.
And close the application.

Scenario: TC12 Print Company Profile report from menu bar options.
And enter username & password.
When click on open button
And Select Reports-->General Reports-->Company Profile  from Invoice menu bar.
And Click ep icon button for report print.
And close the application.

Scenario: TC13 Print Tax Tables report from menu bar options.
And enter username & password.
When click on open button
And Select Reports-->General Reports-->Tax Tables  from Invoice menu bar.
And Click ep icon button for report print.
And close the application.

Scenario: TC14 Print Item Listing report from menu bar options.
And enter username & password.
When click on open button
And Select Reports-->General Reports-->Item Listing  from Invoice menu bar.
And Click ep icon button for report print.
And close the application.
@test
Scenario: TC15 Print Text Listing report from menu bar options.
And enter username & password.
When click on open button
And Select Reports-->General Reports-->Text Listing  from Invoice menu bar.
And Click ep icon button for report print.
And close the application.
