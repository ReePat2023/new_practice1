@datatable
Feature: Login Feature
  In Order to perform successful login
  As a User
  I have to enter correct username and password

  @smoke @sanity
  Scenario: Login to the Facebook website
    Given User navigates to the facebook website
    When user validates the homepage title
    Then user enters "valid" username
    And user enters "valid" password
    And user validates captcha image
    And user enters firstname and lastname
      | Smith | Thomas |
      | Cory  | Paul   |
    And user clocks on the sign in button