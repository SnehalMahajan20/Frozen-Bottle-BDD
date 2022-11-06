Feature: get foodorder Request

Scenario: User want to read data of foodorder from database by using id
When User want to fetch the data of foodorder from database by using id "http://localhost:8080/foodorders?id=4"
Then User want to verify the status code 415
