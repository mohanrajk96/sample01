package RestAssuredBDD;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;
import static org.hamcrest.Matchers.*;

import org.openqa.selenium.remote.Response;

public class Demo4_delete {
	
	@Test
	public void deleterecords() {
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		RestAssured.basePath = "/posts/2";
		
		//Response response =
		given()
		
		.when()   //
			.delete()
		
		.then()
			.statusCode(200)                           // Assert status code is 200
	        .statusLine("HTTP/1.1 200 OK")
			.log().all()
			.extract().response();        //extract the response and store in variable
		
		
	}

}
