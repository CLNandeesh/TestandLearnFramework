@smoke
Feature: Feature to validate basic functionalities are working fine
  I want to use this template to validate basic functionality

  @login
  Scenario: Validate Login functionality
    Given I am on login page url "testurl" of JAM tool
    When I enter username "testuser" and password "testpassword"
    And click on Sigin button
    Then I moved to dashboard
    And clicked on Logout button
    Then I moved to login page
