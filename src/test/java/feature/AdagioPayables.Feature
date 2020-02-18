Feature: payables feature verification.
Background:
Given launch payables application.


Scenario: TC01 login to payables.
And enter username & password.
When click on open button
Then Click ok button.
And close the application.


Scenario: TC02 Data Integrity Check.
And enter username & password.
When click on open button
Then Click ok button.
And Close Invoice window.
And Select File-->Data Integrity Check from menu bar.
And Click Check.
And close the application.

Scenario: TC03 Calculate Vendor Aging.
And enter username & password.
When click on open button
Then Click ok button.
And Close Invoice window.
And Select Maintenance-->Calculate Vendor Aging.
And Click Calculate Button.
And close the application.

Scenario: TC04 View Vendor Details
And enter username & password.
When click on open button
Then Click ok button.
And Close Invoice window.
And Select Inquiries-->Vendors from menubar.
And Click View Button.
And close the application.

Scenario: TC05 Payables Invoice Post.
And enter username & password.
When click on open button
Then Click ok button.
And Create new invoice by clicking New button.
Then Give vendor code.
And Give distribution code by clicking New button.
And Take screenshot for New Invoice detail window.
And verify Acc/Dept value.
And Post the invoice.
And close the application.
@sanity
Scenario: TC06 Payables Invoice Post with text verification.
And enter username & password.
When click on open button
Then Click ok button.
And Create new invoice by clicking New button.
Then Give vendor code.
And Give distribution code by clicking New button.
And Take screenshot for New Invoice detail window.
And GetText for verification.
And Post the invoice.
And close the application.
