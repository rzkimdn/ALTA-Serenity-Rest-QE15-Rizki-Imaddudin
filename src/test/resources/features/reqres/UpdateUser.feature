Feature: Put Update user API
  @Latihan
  Scenario Outline: Update user with parameter id and valid json
    Given Update user with parameter id <id> and valid json "<fileJson>"
    When Send request put update user
    Then Status code should be 200
    Examples:
    |id|fileJson|
    |2 |update_user.json|
    |3 |update_user1.json|
    |4 |update_user2.json|