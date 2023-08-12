Feature: Login feature

  Background:
    Given user is on the login page

  @sanity @login
  Scenario: User login with valid credentials
    When user input valid "standard_user" and "secret_sauce"
    And user click on the login button
    Then user successfully logged in

  @login @sanity
  Scenario: User login with invalid credentials
    When user input valid "abcd" and "secret_sauce"
    And user click on the login button
    Then user should not be login successfully
    And user should see an "Epic sadface: Username and password do not match any user in this service"

  @regression
  Scenario Outline: User try to login with set of invalid credentials
    When user input valid <username> and <password>
    And user click on the login button
    Then user should not be login successfully
    And user should see an <error_message>
    Examples:
      | username        | password      | error_message                                                               |
      | "standard_user" | "secret_sau"  | "Epic sadface: Username and password do not match any user in this service" |
      | "standard_us11" | "secret_sauce"| "Epic sadface: Username and password do not match any user in this service" |
      | "standard_us"   | "secret_sau"  | "Epic sadface: Username and password do not match any user in this service" |
      | ""              | "secret_sauce"| "Epic sadface: Username is required"                                        |