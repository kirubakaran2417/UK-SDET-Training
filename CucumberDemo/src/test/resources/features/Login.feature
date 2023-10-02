Feature: Validation of login funtionality for practicetestautomation

  Background: background
    Given Open the browser and redirect to practicetestautomation

  @smoketest
  Scenario Outline: valid testing of login
    When Enter valid details for the "<username>"and "<password>"
    Then validate the success message
    Examples:
    |username|password|
    |student |Password123|
    |student123 |Password123|
    |student |Password|
  @regression
  Scenario: invalid login
    When Enter invalid username and valid password
    Then validate the error message
  @regression
  Scenario: invalid password
    When Enter valid username and invalid password
    Then validate the error message
