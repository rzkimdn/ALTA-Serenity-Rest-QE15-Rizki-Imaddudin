Feature: Delete user API
  @Latihan
  Scenario: Delete user with parameter id
    Given Delete user with id 2
    When Send request delete users
    Then Status code should be 204