package StepDefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class DeleteFoodMenu {
	 Response res;
	 ValidatableResponse  validate;
	
	@When("user want to delete user by using URI {string}")
	public void user_want_to_delete_user_by_using_uri(String URI) {
		 res=RestAssured.delete(URI);
	}

	@Then("verify status code is {int}")
	public void verify_status_code_is(Integer code) {
		 validate = res.then();
		  validate.assertThat().statusCode(code).log().all();
	}

}
