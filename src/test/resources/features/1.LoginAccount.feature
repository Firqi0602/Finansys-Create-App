	Feature: Login Account

  Scenario: Account failed login one  
   	When Go to Web finansysapps 1
    And User enter email valid password invalid 1
    And User press button signin 1
    Then Popup invalid password 1
    
  Scenario: Account failed login two 
   	When Go to Web finansysapps 2
    And User enter email invalid password valid 2
    And User press button signin 2
    Then Popup Username not found 2
    
  Scenario: Account succes login 
   	When Go to Web finansysapps 3
    And User enter email address password valid 3
    And User press button signin 3
    Then User can see task text 3
    
    
 