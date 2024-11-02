Feature: Login feature
  Background:
    Given User is on the login page


  Scenario Outline: User try to login with invalid credentials
    When User input email <email>
    And User input password <password>
    And User click on the login button
    And User should see the error message <error_msg>
    Examples:
    | email           | password   | error_msg                        |
    |"orin@gmail.com" | "12345678" | "Login Failed! Please try again" |
    |"abc"            | "123456789"| "Login Failed! Please try again" |
    |"abc"            | "123"      | "Login Failed! Please try again" |
    |" "              | "123"      | "Login Failed! Please try again" |


  Scenario: User try to login with valid credentials
    When User input email "orin@gmail.com"
    And User input password "123456789"
    And User click on the login button
    Then User successfully logged in
    And User should see the my account page






