package StepDefination;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PostFoodOrder {
	RequestSpecification req ;
	 Response res;
	 ValidatableResponse validate;
	@Given("user want to pass the data into database")
	public void user_want_to_pass_the_data_into_database() {
	   
		
	
		JSONObject main=new JSONObject();
		main.putIfAbsent("dateTime","2022-11-04T11:41:24.815Z");
		main.put("id", 5);
		
		
		JSONArray aItems=new JSONArray();
		
		JSONObject items=new JSONObject();
		items.put("category", "Lunch");
		items.put("Lunch", 250);
		items.put("id", 9);
		items.put("name","pushki");
		items.put("quantity", 4);
		
		
		aItems.add(items);
		
		main.put("items", aItems);
		main.put("status", "dispatched");
		main.put( "totalCost",1000);
		
		
 
		
	        req = RestAssured.given()
		 .contentType(ContentType.JSON)
		 .body(main);
	}

	@When("user want to pass the data by using an URI is {string}")
	public void user_want_to_pass_the_data_by_using_an_uri_is(String uri) {
	     res = req.post(uri);
	}       

	@Then("user want to validate status line {string}")
	public void user_want_to_validate_status_line(String string) {
	      validate = res.then();
	}

	@Then("user want to validate status code {int}")
	public void user_want_to_validate_status_code(Integer int1) {
	   validate.assertThat().statusCode(int1).log().all();
	}

}
