package Logging;
import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class RequestLoggingExamples
{
	
	
//Logging for request Headers
	@Test
	public void test() 
	{
		
		RestAssured.baseURI="http://localhost";
		RestAssured.port=8888;
		RestAssured.basePath="/student";
		
		Response res=given().header("X","Y").log().headers().get("/12");		
		res.prettyPrint();
		
		
	}
	

//Logging for request Parameters
	@Test
	public void test002()
	{
		RestAssured.baseURI = "http://localhost";
		RestAssured.port = 8888;
		RestAssured.basePath= "/student";
		
		//Logging the Parameters 
		
		Response resp = given().param("pgrogramme", "computer science").log().params().get("/list");		
		
		resp.prettyPrint();

	}
	
	
//Logging for body	
	@Test
	public void test003()
	{
	
		RestAssured.baseURI = "http://localhost";
		RestAssured.port = 8888;
		RestAssured.basePath= "/student";
		
		//Logging the Parameters 
		
		 File json = new File("C://Users//Nidhi.Khandelwal//Workspace1//LearningRestAssured//Student.json");
		
        given().contentType(ContentType.JSON).log().body().body(json).post();
	}
	
	
	
//	@Test
//	public void test004()
//	{
//		
//		RestAssured.baseURI = "http://localhost";
//		RestAssured.port = 8888;
//		RestAssured.basePath= "/student";		
//		//Logging the Parameters 
//		
//		File json = new File("C://Users//Nidhi.Khandelwal//Workspace1//LearningRestAssured//Student.json");
//		
//        given().contentType(ContentType.JSON).log().ifValidationFails().body(json).post().then().statusCode(500);
//        
//	}
//	
	

}
