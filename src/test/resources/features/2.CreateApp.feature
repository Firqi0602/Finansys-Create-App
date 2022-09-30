
Feature: Allow user to create an application on the platform
 
  Scenario: Invalid application name
    When As a user of the form editor page of the demo website 4
    And I provide an application name that has already been used in the system 4
    Then I see an appropriate error message 4
    
   Scenario: Valid application name
    When As a user of the form editor page of the demo website 5
    And I provide valid application name 5
    Then An application is created for me 5

 