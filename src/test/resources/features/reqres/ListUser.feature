Feature: Get list users API
  @Latihan
  Scenario Outline: Get list users with valid parameter page
    Given Get list users with parameter page <page>
    When Send request get list users
    Then Status code should be 200
    Examples:
    |page|
    |1   |
    |2   |