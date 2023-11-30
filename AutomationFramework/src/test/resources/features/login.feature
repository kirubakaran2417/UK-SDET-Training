Feature: Login Functionality test

  Scenario: Testing with valid credentials
    Given open the browser
    And redirect to the login page
    When Enter username and password
    Then click login
    And redirect to accounts page