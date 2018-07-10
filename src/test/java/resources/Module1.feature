Feature: Form Authentication

Scenario: Login Functionality Exists

Given I have open the browser
And I open Available examples website	
When I click on Form Authentication
Then Login page should display


Scenario Outline: Login Functionality works
Given I have open the LoginPage
When I enter username <username1> and password <password1>
Then I am able to access the secure area

Examples:
|username1	| 	password1|
|tomsmith	|	SuperSecretPassword!|