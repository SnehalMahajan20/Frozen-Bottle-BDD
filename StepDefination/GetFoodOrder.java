package StepDefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class GetFoodOrder {
	 
	 Response res;
	 ValidatableResponse  validate;
	
	@When("User want to fetch the data of foodorder from database by using id {string}")
	public void user_want_to_fetch_the_data_of_foodorder_from_database_by_using_id(String URI) {
	   res = RestAssured.get(URI);
	}

	@Then("User want to verify the status code {int}")
	public void user_want_to_verify_the_status_code(Integer code) {
		 validate = res.then()
		 .assertThat().statusCode(code).log().all();
	}

}
