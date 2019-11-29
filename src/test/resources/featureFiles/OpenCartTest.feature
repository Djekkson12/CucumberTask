Feature:Login to OpenCart

  @multiple
  Scenario Outline: Successful Login to the page
    Given User opens Chrome browser on Login page
    And User provides username as "<Login>" and password as "<Password>"
    And User clicks on login button


    Examples:
      | Login           |  | Password |
      | Brent@test1.com |  | 123456   |
      | Brent@1test.com |  | 654321   |