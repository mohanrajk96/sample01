package RestAssuredBDD;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

public class Demo5_Validation_json {
	
	/*
	1) Test Status Code
	2) Logging Response  ************.log().all();**************
	3) Verifying Single content in Response body
	4) Verifying Multiple contents in Response body
	5) Setting Parameters & Headers */
		
	//1. Test Status Code
	
	@Test(priority=1)
	public void teststatuscode() {
		
		given()
		
		.when()   
		     .get("https://jsonplaceholder.typicode.com/posts/2")
		
		.then()
			.statusCode(200);                           // Assert status code is 200
	        
	}
	@Test(priority=2)
	//2. log respose
	public void testlogging() {
		
		given()
		
		.when()   
		     .get("https://jsonplaceholder.typicode.com/posts/1")
		
		.then()
			.statusCode(200)
			.log().all();
	}
	@Test(priority=3)
	//3) Verifying Single content in Response body  https://demoqa.com/utilities/weather/city/salem
	
	public void testsinglecontent()	{
		given()
		
		.when()   
		     .get("https://demoqa.com/utilities/weather/city/salem")
		
		.then()
			.statusCode(200)
			.body("City", equalTo("salem"));
	}
	@Test(priority=4)
	//4) Verifying Multiple contents in Response body
	public void testmultiplecontent()	{
	given()
	
	.when()   
	     .get("https://jsonplaceholder.typicode.com/posts")
	
	.then()
		.statusCode(200)
		.body("id", hasItems(1, 3, 4));  // all this 3 items check there are not
		
	}
	
	@Test(priority=5)
	 //5) Setting Parameters & Headers
	public void settinfparameters() {
		
		given()
			.param("Myname", "mohan")
			.header("Myheader", "Salem")
		
		.when()   
		     .get("https://demoqa.com/utilities/weather/city/salem")
		
		.then()
			.statusCode(200)
			.log().all();


	} 
}