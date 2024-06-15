Feature: Put Update user API
  @Latihan
  Scenario Outline: Update user with parameter id and valid json
    Given Update user with parameter id <id> and valid json "<fileJson>"
    When Send request put update user
    Then Status code should be 200
    And Response body name should be "<name>" and job should be "<job>"
    And Validate json schema "update_user_json_schema.json"
    Examples:
    |id|fileJson| name| job|
    |2 |update_user.json| Rizki Imaddudin Edit| QA Engineer Edit|
    |3 |update_user1.json| Rizki Imaddudin Edit 1| QA Engineer Edit 1|
    |4 |update_user2.json| Rizki Imaddudin Edit 2| QA Engineer Edit 2|

  @Tugas
  Scenario Outline: Update user with parameter id and valid json using patch
    Given Update user with parameter id <id> and valid json "<fileJson>"
    When Send request patch update user
    Then Status code should be 200
    And Response body name should be "<name>" and job should be "<job>"
    And Validate json schema "update_user_json_schema.json"
    Examples:
      |id|fileJson| name| job|
      |2 |update_user.json| Rizki Imaddudin Edit| QA Engineer Edit|
      |3 |update_user1.json| Rizki Imaddudin Edit 1| QA Engineer Edit 1|
      |4 |update_user2.json| Rizki Imaddudin Edit 2| QA Engineer Edit 2|

  Scenario: Update user