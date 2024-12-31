package RestAssuredBDD;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Demo1_get {

	//https://demoqa.com/utilities/weather/city/salem
	@Test
	public void getweatherdetails()
	{
	  given()
	  .when()
	    .get("https://demoqa.com/utilities/weather/city/salem")
	  .then()
	   .statusCode(200)                           // Assert status code is 200
       .statusLine("HTTP/1.1 200 OK")             // Assert status line is correct
       .assertThat().body("City", equalTo("salem")) 
       // Assert "City" in body is "Salem"
       .header("Content-Type", "application/json; charset=utf-8")
	  .log().all();
	  
	    	
	}	
}
