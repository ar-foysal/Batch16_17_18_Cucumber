Feature: Product feature test

  Background:
    Given user logged in with "standard_user" "secret_sauce"
#    Given user is on the login page
#    When user input valid "standard_user" and "secret_sauce"
#    And user click on the login button

  Scenario: Test product page title
    Then user should see product page url
