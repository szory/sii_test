Feature: Is it Friday yet?
  Everybody wants to know when it's Friday

  @is_or_is_not_Friday
  Scenario Outline: Today is or is not Friday
    Given today is "<day>"
    When I ask whether it's Friday yet
    Then I should be told "<answer>"

  Examples:
    | day            | answer |
    | Friday         | TGIF   |
    | Sunday         | Nope   |
    | anything else! | Nope1   |
    | Monady         | Nope   |
    | Tuesday        | Nope   |
    | Wednesday      | Nope   |