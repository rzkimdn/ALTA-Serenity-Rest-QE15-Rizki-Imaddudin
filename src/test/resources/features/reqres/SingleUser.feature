@Tugas
  Feature: Get single user API
  Scenario: Get single user with valid parameter id
    Given Get single user with valid parameter id 2
    When Send request get single users
    Then Status code should be 200
    And Response body single user should be id 2
    And Validate json schema "single_user_json_schema.json"
