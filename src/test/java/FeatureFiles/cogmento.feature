
Feature: Test Cogmento CRM Application

  Scenario: validate login functionality
    Given user open url in  browser
    When user enter valid username and password
    Then user click on login button

  Scenario: validate HomePage Functionality
    When validate HomePage URL
    Then click on ContactLink

  Scenario: Validate Create new Contact Functionality
    When User should click on create contact
    And User should enter fname as "Abhi" and lname as "Jadhav" and email as "abj@gmail.com" and status as "New"
    Then User click on save Button

    Scenario: validate deals page functioanlity
    Given user should click on deals page
    When user should enter title as "Moringa" and description as "Pongal" and probability as "22" and amount as "45"
    Then user should click on save button