Feature: Test ability to pick date
  In this scenario we wanna pick a date

  @datepicker
  Scenario: pick a date
    Given is picked a 12 of date
    When  question what date is today
    Then it should be selected "12"