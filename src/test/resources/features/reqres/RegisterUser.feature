@Tugas
Feature: Register user API
  Scenario: User Register with valid json
    Given User register with valid json "register_user.json"
    When Send request post register users
    Then Status code should be 200
    And Response body token should be "QpwL5tke4Pnpja7X4"
    And Validate json schema "register_user_json_schema.json"

  Scenario: User Register with invalid data
    Given User register with invalid json "register_negative.json"
    When Send request post register users
    Then Status code should be 400
    And  Response body error should be "Missing password"
    And Validate json schema "register_negative_json_schema.json"
    
  Scenario: User register with empty email
    Given User register with empty email "register_empty_email.json"
    When Send request post register users
    Then Status code should be 400
    And Response body error should be "Missing email or username"
    And Validate json schema "register_empty_email_json_schema.json"
    
  Scenario: User register with empty password
    Given User register with empty password "register_empty_password.json"
    When Send request post register users
    Then Status code should be 400
    And Response body error should be "Missing password"
    And Validate json schema "register_empty_password_json_schema.json"
    
  Scenario: User register with empty email & password
    Given user register with empty email & password json "register_empty.json"
    When Send request post register users
    Then Status code should be 400
    And Response body error should be "Missing email or username"
    And Validate json schema "register_empty_json_schema.json"
    
  Scenario: User register with special character
    Given User register with special character json "register_special_character.json"
    When Send request post register users
    Then Status code should be 400
    And Response body error should be "Note: Only defined users succeed registration"
    And Validate json schema "register_special_character_json_schema.json"