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

  ##negative test case tapi semua invalid test tetap pass 200 OK di postman juga
#  @Tugas
#  Scenario: Get list user with invalid parameter page
#    Given Get list users with invalid parameter page "$"
#    When Send request get list users
#    Then Status code should be 200
#
