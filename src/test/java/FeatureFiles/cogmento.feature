Feature: Test Cogmento CRM Application

  
  Scenario: validate login functionality
    Given user open url in  browser
    When user enter valid username and password
    Then user click on login button
