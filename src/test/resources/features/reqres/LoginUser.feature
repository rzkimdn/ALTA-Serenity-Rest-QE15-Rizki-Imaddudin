@Tugas
Feature: Login test API
  Scenario: Login user with valid json
    Given User login with valid json "login_user.json"
    When Send request post login user
    Then Status code should be 200
    And Response body token should be "QpwL5tke4Pnpja7X4"
    And Validate json schema "login_user_json_schema.json"

  Scenario: Login user with invalid data
    Given user login with invalid data "login_negative.json"
    When Send request post login user
    Then Status code should be 400
    And Response body error should be "Missing password"
    And Validate json schema "login_negative_json_schema.json"

  Scenario: Login user with empty email
   Given User login with empty email json "login_empty_email.json"
   When Send request post login user
   Then Status code should be 400
   And Response body error should be "Missing email or username"
   And Validate json schema "login_empty_email_json_schema.json"

  Scenario: Login user with empty password
    Given User login with empty password json "login_empty_password.json"
    When Send request post login user
    Then Status code should be 400
    And Response body error should be "Missing password"
    And Validate json schema "login_empty_password_json_schema.json"
    
  Scenario: Login user with empty email & password
    Given User login with empty email & password json "login_empty.json"
    When Send request post login user
    Then Status code should be 400
    And Response body error should be "Missing email or username"
    And Validate json schema "login_empty_json_schema.json"
    
  Scenario: Login user with special character
    Given User login with special character json "login_special_character.json"
    When Send request post login user
    Then Status code should be 400
    And Response body error should be "user not found"
    And Validate json schema "login_special_character_json_schema.json"
      