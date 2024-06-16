Feature: Get list users API
  @Latihan
  Scenario Outline: Get list users with valid parameter page
    Given Get list users with parameter page <page>
    When Send request get list users
    Then Status code should be 200
    And Response body page should be <page>
    And Validate json schema "list_user_json_schema.json"
    Examples:
    |page|
    |1   |
    |2   |

#error karena seharusnya page @ itu invalid atau tidak ada
  @Tugas
  Scenario: Get list user with special character page
    Given Get list users with special character page "$"
    When Send request get list users
    Then Status code should be 404
