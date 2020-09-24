Feature: Rest Assured 1

  @restassured1
  Scenario: get user by name
    Given the users endpoint address exists
    When I send user firstName "Johnny" and lastName "Cage"
    Then response status will be 200
    And response should contains firstName "Johnny"