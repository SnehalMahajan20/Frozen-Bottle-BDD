 Feature: Post food menu
 
 @Execute
 Scenario: User Wants to post the data
 Given  user is Able to post the data in database
 When  user post the Data by using an URI is "http://localhost:8080/foodMenus"
 Then user validates the Post status code is 201