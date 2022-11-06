Feature: Delete Request

Scenario: User want to delete user by Id
When user Want to delete user by using URI "http://localhost:8080/foodorders/2"
Then verify status code 415


