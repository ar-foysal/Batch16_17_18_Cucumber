Feature: Login feature

  Scenario: User login with valid credentials
    Given user is on the login page
    When user input valid username and password
    And user click on the login button
    Then user successfully logged in
