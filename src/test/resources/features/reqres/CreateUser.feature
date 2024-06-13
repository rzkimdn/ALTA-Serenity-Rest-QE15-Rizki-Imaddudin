Feature: Create user API
  @Latihan
  Scenario: Create new user with valid json
    Given Create new user with file json "create_user.json"
    When Send post create new users
    Then Status code should be 201
    And Response body name should be "Rizki Imaddudin" and job should be "QA Engineer"
    And Validate json schema "create_user_json_schema.json"