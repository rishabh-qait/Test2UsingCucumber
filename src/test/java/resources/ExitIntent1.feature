Feature: Testing that Exit Intent page is displayed

Scenario: Navigation to exit intent will get me to exit intent page 
Given I launch Browser
And navigate to the Available Examples Website  
When I navigate to the exit intent page 
Then Exit intent page will be displayed  

Scenario: if mouse moved over the page and then out of the browser window then overlay modal pops up
Given I am on the exit intent page  
When I move mouse over the page and then out of the window  
Then overlay model pops up
  
Scenario: if Click on the page anywhere outside of the modal overlay popup it defocuses the modal overlay popup
Given I am on the exit intent page  
And overlay model been popped up
When I click on the page anywhere outside of the modal overlay popup  
Then it defocusses the model overlay popup
  