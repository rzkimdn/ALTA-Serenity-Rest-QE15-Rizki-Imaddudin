Feature: Login test API
  @Tugas
  Scenario: Login user with valid json
    Given User login with valid json "login_user.json"
    When Send request post login user
    Then Status code should be 200

  Scenario: Login user with invalid data
    Given user login with invalid data "login_negative.json"
    When Send request post login user
    Then Status code should be 400