Feature: Login test API
  @Tugas
  Scenario: Login user with valid json
    Given User login with valid json "login_user.json"
    When Send request post login user
    Then Status code should be 200
    And Response body token should be "token"
    And Validate json schema "login_user_json_schema.json"

  Scenario: Login user with invalid data
    Given user login with invalid data "login_negative.json"
    When Send request post login user
    Then Status code should be 400
    And Response body error should be "error"
    And Validate json schema "login_negative_json_schema.json"