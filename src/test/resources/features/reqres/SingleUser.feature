@Tugas
  Feature: Get single user API
  Scenario Outline: Get single user with valid parameter id
    Given Get single user with valid parameter id <id>
    When Send request get single users
    Then Status code should be 200
    And Response body single user should be id <id>
    And Validate json schema "single_user_json_schema.json"
    Examples:
    |id|
    |1 |
    |2 |

  Scenario Outline: Get single user with invalid parameter id
    Given Get single user with invalid parameter id <id>
    When Send request get single users
    Then Status code should be 404
    And Response body single user should be "{}"
    And Validate json schema "single_user_invalid_json_schema.json"
    Examples:
    |id|
    |99|
    |1000|

  Scenario Outline: Get single user with special character id
    Given Get single user with special character "<char>"
    When Send request get single users
    Then Status code should be 404
    And Response body single user should be "{}"
    And Validate json schema "single_user_special_char_json_schema.json"
    Examples:
    |char|
    |@   |
    |%   |
