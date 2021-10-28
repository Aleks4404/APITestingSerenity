Feature: I want to create a new order
  To check if it is created

  @Case1
  Scenario: The order was successfully created
    Given  Sending information to the service"https://petstore.swagger.io/v2/store/order"
      | id | petId | quantity | shipDate                 | status    | complete |
      | 1  | 1001  | 7        | 2021-10-28T12:00:00.000Z | Entregado | true     |
    Then Should check the status of the code 200 for the request