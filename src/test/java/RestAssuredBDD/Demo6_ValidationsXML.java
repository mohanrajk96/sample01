package RestAssuredBDD;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import static org.hamcrest.Matchers.containsString;
/*1) Verifying Single content in XML Response
2) Verifying Multiple contents in XML Response
3) Verifying all the content in XML response in one go
4) XPath with text() function
5) Find values using XML Path in XML response  */

/*Assume the XML structure is like:
 xml
Copy code
<response>
    <city>San Jose</city>
    <state>California</state>
</response> */

public class Demo6_ValidationsXML {

	@Test(priority=1)
	
	
	public void testsinglecontent()	{
		given()
		
		.when()   
		     .get("https://mocktarget.apigee.net/xml")
		
		.then()
			.statusCode(200)
			.body("root.city", equalTo("San Jose"));  //xml path root.city
	}
	@Test(priority=3)
	
	public void testmultiplecontent()	{
		given()
		
		.when()   
	     .get("https://mocktarget.apigee.net/xml")
	
	.then()
		.statusCode(200)
		.body("root.city", equalTo("San Jose"))  //xml path root.city
		.body("root.firstName", equalTo("John"))
		.body("root.lastName", equalTo("Doe"))
		.body("root.state", equalTo("CA"))
		.log().all();
		
	}
	
@Test(priority=2)
	
	public void testmultiplecontentOnetoGo()	{
		given()
		
		.when()   
	     .get("https://mocktarget.apigee.net/xml")
	
	.then()
		.statusCode(200)
		.body("root.text()", equalTo("San JoseJohnDoeCA")) //xml path root.text() OnetoGo
		
		.log().all();
	}

//Find values using XML Path in XML response
/*@Test(priority=4)

public void testXpath1() {
    given()
    .when()
        .get("https://mocktarget.apigee.net/xml")
    .then()
        .body(hasXpath("/root/firstName", containsString("John"))); // XPath and Hamcrest matcher for "John"
}
@Test(priority=5)

public void testXpath2() {
    given()
    .when()
        .get("https://jsonplaceholder.typicode.com/posts")
    .then()
    body(hasXpath("/rootlist/userId[text()='5']"))
}*/

}
