Feature: Rest Assured

  @restassured
  Scenario: Get a list of users
    Given the users endpoint exists
    When I send a valid get user payload
    Then response status code should be 200
    And get user response should be size 10