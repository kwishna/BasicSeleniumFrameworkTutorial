Feature: Test Enum

  Scenario Outline: enum test
    Given I navigate to home page
    When I fill the form "<username>", "<password>"
    Then I get error "<Error>"

    Examples:
      | username | password | Error                                  |
      |          | pass1    | UserMissingError                       |
      | user2    |          | PasswordMissingError                   |
      |          |          | UserMissingError, PasswordMissingError |