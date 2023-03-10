Feature: Feature for Login into application

  Scenario Outline: Validate Dashboard Page
    Given Hit <URL>
    When user enters <User1> username and <password>
    And Clicks on login button
    And user is navigated to Dashboard page then logout
    Then Login again with <User2> username and <password> and logout from the same

    Examples: -
      | URL                     | User1     | User2     | password |
      | https://www.google.com/ | Username1 | Username2 |      123 |
