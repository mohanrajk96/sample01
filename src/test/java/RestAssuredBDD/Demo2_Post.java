package RestAssuredBDD;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured;

public class Demo2_Post {
	public static HashMap map = new HashMap();
	@BeforeClass
	public void postdata() {
		map.put("FirstName", DemoUtils.getfname());
		map.put("LastName", DemoUtils.getlname());
		map.put("UserName", DemoUtils.getusername());
		map.put("password", DemoUtils.getpassword());
		
		RestAssured.baseURI = "https://demoqa.com/customer";
		RestAssured.basePath = "/register";
	}
	@Test
	public void testpost()
	{
   given()
   .header("Content-Type", "application/json; charset=utf-8")
	  .body(map)
	
	.when()
	   .post()
	   
	.then()
	   .statusCode(404)
	   .and();
	 /*  .statusCode(201)
	   .body("SuccessCode", equalTo("OPERATION_SUCCESS"))
	   .and()
	   .body("Message", equalTo("operation copmleted successfully")); */
	}

}
