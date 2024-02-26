@homePageTests
Feature: Home Page tests

  @smoke
  Scenario: Verify Home Page title
    Given I open home page
    Then I verify title is TLA Automation


  Scenario: Verify Home Page title
    Given I open home page
    Then I verify title is TLA Automation

  @smoke
  Scenario: Verify Home Page title
    Given I open home page
    Then I verify title is TLA Automation

  @parameterType
  Scenario: Parameter type example
    Given I open "http://automation.techleadacademy.io/#/home"
    Then Verifies main text contains words such as WebDriver, Selenium, CSS, Text