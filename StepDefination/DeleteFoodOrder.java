package StepDefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class DeleteFoodOrder {
	Response res;
	 ValidatableResponse  validate;
	
	@When("user Want to delete user by using URI {string}")
	public void user_want_to_delete_user_by_using_uri(String URI) {
		res= RestAssured.delete(URI);
	}

	@Then("verify status code {int}")
	public void verify_status_code(Integer int1) {
	 validate=  res.then();
	   validate.assertThat().log().all();
	   
	}


}
