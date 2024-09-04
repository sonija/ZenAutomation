#Background: List of steps run before each of the scenarios
    #Given the user is on the login page
    #When the user enters valid credentials
    #Then the user should be redirected to the homepage
@UI
Feature: As a user I want to validate Login functionality

@smokeer
  Scenario: Validate login functionality with Inbox Filters
    Given the user is on the login page
    When the user enters valid credentials
    Then the user should be redirected to the homepage