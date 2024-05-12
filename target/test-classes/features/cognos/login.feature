Feature: User Login
  As a user
  I want to log in to the website
  So that I can access my account

  Scenario: Logging in with valid credentials
    Given the user opens the URL
    When the user enters their USER ID and password
    And clicks on the submit button
    Then the user should be logged in successfully
