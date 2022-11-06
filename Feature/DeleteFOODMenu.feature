Feature: Delete foodmenu

Scenario: User wants to delete user by Id
When  user want to delete user by using URI "http://localhost:8080/foodMenus/3"
Then verify status code is 200
