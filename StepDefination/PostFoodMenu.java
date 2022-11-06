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

public class PostFoodMenu {
	 RequestSpecification req;
	 Response res;
	 ValidatableResponse  validate;
	 
	 
	@Given("user is Able to post the data in database")
	public void user_is_able_to_post_the_data_in_database() {
		JSONObject object = new JSONObject();
		//Admin object
		
		JSONObject admn1 = new JSONObject();
		
		admn1.put("email", "prajakta123@gmail.com");
		  admn1.put("id", "4");
		  admn1.put("name", "prajakta");
		  admn1.put("password", "Prajakta@364");
		  
		  //insert the admin values
		  object.put("admin", admn1);
		  
		  //product vale
		 JSONObject pd2 = new JSONObject();
		 pd2.put( "cost", 250);
		 pd2.put( "description", "testing");
	     
	     pd2.put( "name", "chine");
	      pd2.put( "type", "veg");
	      
	     	      
	      JSONArray ar = new JSONArray();
	      ar.add(pd2);
	      
	      //insert the product key
	      object.put( "product", ar);

	      
		  req = RestAssured.given()
		  
		  .contentType(ContentType.JSON)
		  .body(object);
	}
	@When("user post the Data by using an URI is {string}")
	public void user_post_the_data_by_using_an_uri_is(String URI) {
	    res = req.post(URI);
	}
	@Then("user validates the Post status code is {int}")
	public void user_validates_the_post_status_code_is(Integer code) {
	  validate = res.then();
	  validate.assertThat().statusCode(code).log().all();
	  
	}

}
