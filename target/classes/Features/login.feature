Feature: Free CRM Login Feature

Scenario: Verify Invalid user scenario

Given user is on the start up page
When user clicks on Login option
When user enters username and Password
Then user clicks on login button
Then invalid user message is displayed