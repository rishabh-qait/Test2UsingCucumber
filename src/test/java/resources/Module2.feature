Feature: Testing navigation to form authentication render the Login page  And Logout renders back to login page 


		
Scenario:Navigation to the form authentication will get me to the login page 
		Given I have open the browser
		And I navigate to Available examples website	
		When I navigate to Form Authentication
		Then Login page will display

Scenario: Render back to the login page on Logout
		Given I have successfully logged in 
		And Logout button is displayed 	
		When I Logout
		Then I will navigate back to Login page