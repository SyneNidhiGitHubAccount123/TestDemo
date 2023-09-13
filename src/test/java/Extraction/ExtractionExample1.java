package Extraction;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ExtractionExample1 
{
	
	@Test
    public void testExtraction1()
    {
		RestAssured.baseURI = "http://localhost";
		RestAssured.port = 8888;
		RestAssured.basePath = "/student";
		
		ArrayList<Integer> ids =given().contentType(ContentType.JSON).log().all().get("/list").then().extract().path("id");
		ArrayList<String> firstName =given().contentType(ContentType.JSON).log().all().get("/list").then().extract().path("firstName");
		ArrayList<String> lastName =given().contentType(ContentType.JSON).log().all().get("/list").then().extract().path("lastName");
		ArrayList<String> email =given().contentType(ContentType.JSON).log().all().get("/list").then().extract().path("email");
		
		
			System.out.println(ids);
			System.out.println(firstName);
			System.out.println(lastName);
			System.out.println(email);
		
		
	}
	
	
	@Test
    public void testExtraction_SpecificId()
    {
		RestAssured.baseURI = "http://localhost";
		RestAssured.port = 8888;
		RestAssured.basePath = "/student";
		
		 int ids =given().contentType(ContentType.JSON).log().all().get("/10").then().extract().path("id");
		 String firstName =given().contentType(ContentType.JSON).log().all().get("/10").then().extract().path("firstName");
		 String lastName =given().contentType(ContentType.JSON).log().all().get("/10").then().extract().path("lastName");
		 String email =given().contentType(ContentType.JSON).log().all().get("/10").then().extract().path("email");
		
		
			System.out.println("id    " + ids);
			System.out.println("firstName    " +firstName);
			System.out.println("lastName    "+ lastName);
			System.out.println("email   "+ email);
		
		
	}
	
	

}
