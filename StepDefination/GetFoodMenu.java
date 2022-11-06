package StepDefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetFoodMenu {

	 Response res;
	 ValidatableResponse  validate;
	
	
	@When("user want to fetch data of foodmenu from database by using id {string}")
	public void user_want_to_fetch_data_of_foodmenu_from_database_by_using_id(String URI) {
	   res=RestAssured.get(URI);
	}

	@Then("user want to verify status code {int}")
	public void user_want_to_verify_status_code(Integer code) {
		 validate = res.then();
		  validate.assertThat().statusCode(code).log().all();
	}
}
