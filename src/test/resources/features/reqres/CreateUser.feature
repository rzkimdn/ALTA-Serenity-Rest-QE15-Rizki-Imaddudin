Feature: Create user API
  @Latihan
  Scenario: Create new user with valid json
    Given Create new user with file json "create_user.json"
    When Send post create new users
    Then Status code should be 201
    And Response body name should be "Rizki Imaddudin" and job should be "QA Engineer"
    And Validate json schema "create_user_json_schema.json"
@Tugas
  Scenario: Create new user with empty field
    Given Create new user with file json "create_user_empty.json"
    When Send post create new users
    Then Status code should be 201
    And Response body name should be "" and job should be ""
    And Validate json schema "create_user_empty_json_schema.json"

  #seharusnya invalid request 400 karena raw body nya tidak boleh kosong kalau secara logika makannya saya buat response code nya 400
  @Tugas
  Scenario: Create new user with empty json
    Given Create new user with file json "empty.json"
    When Send post create new users
    Then Status code should be 400

  #Seharusnya invalid request 400 karena integer logikanya tidak bisa digunakan di field nama dan job
  @Tugas
  Scenario: Create new user with int value
    Given Create new user with file json "create_user_integer.json"
    When Send post create new users
    Then Status code should be 400
