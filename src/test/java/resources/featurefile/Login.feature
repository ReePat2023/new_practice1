@bvt
Feature: Login Feature
  In Order to perform successful login
  As a User
  I have to enter correct username and password

  @smoke
  Scenario: User should navigate to login page successfully
    Given I am on homepage
    When I click on login link
    Then I should navigate to login page successfully

  @smoke @sanity
  Scenario: User should login successfully with valid credentials
    Given I am on homepage
    When I click on login link
    And I enter email "primeeight@gmail.com"
    And I enter password "abc123"
    And I click on login button
    Then I should login successfully