
@Everything
Feature: Verifying the Gmail compose function
  
  
  Scenario: verifying Gmail Sign in function and composing email
    Given User is on Gmail signin page
    When User enter valid "<emailid>" in the email field
    And User click the next button
    And User enter valid "<password>" in the password field
    And  User enter again next button
    And User click a compose function
    And User enter subject of the email
    And User enter text in message body
    Then User add recipient detail
    Then User send message sucessfully
    

  
  Scenario Outline: verifying gmail composing with valid credential
    

    Examples: 
      | emailid | password | 
      | steffyprakash1990@gmail.com |Jishajane2914| 
     