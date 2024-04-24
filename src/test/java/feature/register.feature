
Feature: Ragistration 
 
  Scenario: I want to registater as a user
    Given I am on the registration page
    When I enter email "anishthapa" and comfrim email "anishthapa556"
    And  I enter password "Anish" and comfirm password "Anish"
    Then I click on the sign up button
    Then I should see the welcome message
