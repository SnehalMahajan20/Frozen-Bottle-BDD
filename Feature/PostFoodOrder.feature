 Feature: Post foodorder
 
 
 Scenario: User want to post the data into database
 Given  user want to pass the data into database
 When  user want to pass the data by using an URI is "http://localhost:8080/foodorders"
 Then user want to validate status line "HTTP/1.1 200"
 And user want to validate status code 201