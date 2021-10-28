

Feature: Create a user

  Scenario: Create user successful
    Given  Should send the information to the service "https://petstore.swagger.io/v2/user"
      |id|username|firstName|lastName|email          |password|phone     |userStatus|
      |1 |Ivan007 |Ivan     |Ivanov  |ivan123@mail.ru|0000    |9271234567|1234567   |
    Then Should check the status of the code 200