Feature: Register user API
  @Tugas
  Scenario: User Register with valid json
    Given User register with valid json "register_user.json"
    When Send request post register users
    Then Status code should be 200

  Scenario: User Register with invalid data
    Given User register with invalid json "register_negative.json"
    When Send request post register users
    Then Status code should be 400