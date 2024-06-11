Feature: Create user API
  @Latihan
  Scenario: Create new user with valid json
    Given Create new user with file json "create_user.json"
    When Send post create new users
    Then Status code should be 201