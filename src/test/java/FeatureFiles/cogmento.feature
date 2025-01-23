Feature: Test Cogmento CRM Application

  Scenario: validate login functionality
    Given user open url in  browser
    When user enter valid username and password
    Then user click on login button

  Scenario: validate Company page functionality
    When enter the first name
    And enter email
    And click on save

  Scenario: validate HomePage Functionality
    When validate HomePage URL
    Then click on ContactLink
