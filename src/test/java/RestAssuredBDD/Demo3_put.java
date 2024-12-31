package RestAssuredBDD;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Demo3_put {

	public static HashMap map1 = new HashMap();
	
		String empname = DemoUtils.empname();
		String empsal = DemoUtils.empsal();
		String empage = DemoUtils.empage();
		
		int emp_id = 3;
		
		@BeforeClass
		public void putdata() {
		map1.put("name", empname);
		map1.put("salary", empsal);
		map1.put("age", empage);
		
		RestAssured.baseURI = "https://reqres.in/";
		RestAssured.basePath = "/api/users/2";
	}
		
		@Test
		public void testpost()
		{
			given()
			   .header("Content-Type", "application/json; charset=utf-8")
				  .body(map1)
				
				.when()
				   .put()
				   
				.then()
				   .statusCode(200)
					.log().all();
		}
}
