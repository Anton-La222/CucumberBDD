@classTasks
Feature: Class tasks
#  @classTasks
#  Scenario: Verify YouTube home page title
#    Given I open Youtube page
#    Then I verify title is YouTube
#
#  @classTasks
#  Scenario: Verify amazon home page title
#    Given I open amazon home page
#    Then I verify title is Amazon.com
#
#  @classTasks
#   Scenario: Verify Chase bank title
#    Given I open Chase bank home page
#    And i verify title is Credit Card, Mortgage, Banking, Auto | Chase Online | Chase.com
  @youtube
  Scenario: Testing youtube
    Given I open "youtube"
    Then I verify title is "YouTube"
    When  I click "Trending" button
  @amazon
  Scenario: Testing amazon
    Given I open "amazon"
    Then I verify title is "Amazon.com. Spend less. Smile more."
    When I click "Best sellers" button
  @chase
  Scenario: Testing chase bank
    Given I open "chase bank"
    Then I verify title is "Credit Card, Mortgage, Banking, Auto | Chase Online | Chase.com"
    When I click "Business" button