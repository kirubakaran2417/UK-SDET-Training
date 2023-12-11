Feature: Login Functionality test

  Background: Login functionality
    Given open the browser
    And redirect to the login page
  @smoke
  Scenario: Testing with valid credentials

    When Enter username and password
    Then click login
    And redirect to accounts page

  @regression
  Scenario Outline: Testing with invalid credentials

    When Enter "<username>" and "<password>"
    Then click login
    And redirect to login page

    Examples:
    | username | password |
    | admin    | admin    |
    | user     | user     |
    | guest    | guest    |

  @sanity
  Scenario:  Login with valid credentials

    When user enters valid credentials
      | username | password |
      | admin    | admin123 |
      | guest | guest123 |
    And click login
    And redirect to accounts page

