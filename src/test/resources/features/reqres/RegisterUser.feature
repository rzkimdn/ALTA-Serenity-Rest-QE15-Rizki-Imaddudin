Feature: Register user API
  @Tugas
  Scenario: User Register with valid json
    Given User register with valid json "register_user.json"
    When Send request post register users
    Then Status code should be 200
    And Response body token should be "token"
    And Validate json schema "login_user_json_schema.json"

  Scenario: User Register with invalid data
    Given User register with invalid json "register_negative.json"
    When Send request post register users
    Then Status code should be 400
    And  Response body error should be "error"
    And Validate json schema "login_negative_json_schema.json"