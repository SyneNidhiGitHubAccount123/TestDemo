package Extraction;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ExtractionJsonPathExtractor
{

	@Test
	public void testExtractionJsonPathExtractor()
	{
	
		RestAssured.baseURI = "http://localhost";
		RestAssured.port = 8888;
		RestAssured.basePath= "/student";
		
		Response res =given().contentType(ContentType.JSON).get("/12");
		
		JsonPath extractor = res.jsonPath();
					
		System.out.println("id  "+ extractor.get("id"));
		System.out.println("id  "+ extractor.get("firstName"));
		System.out.println("id  "+ extractor.get("lastName"));
		System.out.println("id  "+ extractor.get("email"));		
		
	}
	
}
