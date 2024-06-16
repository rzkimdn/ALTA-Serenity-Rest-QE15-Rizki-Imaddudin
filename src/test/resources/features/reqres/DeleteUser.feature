Feature: Delete user API
  @Latihan
  Scenario: Delete user with parameter id
    Given Delete user with id 2
    When Send request delete users
    Then Status code should be 204

  @Tugas
    #error karena seharusnya id 99 itu tidak ada tapi status code tetap 204
  Scenario: Delete user with invalid parameter id
    Given Delete user with id 99
    When Send request delete users
    Then Status code should be 404