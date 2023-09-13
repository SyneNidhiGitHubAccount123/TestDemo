package Extraction;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

import java.util.List;

import org.testng.annotations.Test;

public class ExtractionBetterway
{
	
	@Test
	public void testExtractionBetterway()
	{
	   
		RestAssured.baseURI = "http://localhost";
		RestAssured.port = 8888;
		RestAssured.basePath = "/student";
		
		Response res =given().accept(ContentType.JSON).get("/list");
		
		List<Integer> ids = res.then().extract().path("id");
	    List<String> firstName = res.then().extract().path("firstName");
	    List<String> lastName = res.then().extract().path("lastName");
	    List<String> email = res.then().extract().path("email");
	    List<String> programme = res.then().extract().path("programme");
	    
	    
	    for(int i=0;i<ids.size();i++)
	    {
	    	System.out.println(ids.get(i));
	    	System.out.println(firstName.get(i));
	    	System.out.println(lastName.get(i));
	    	System.out.println(email.get(i));
	    	System.out.println(programme.get(i));
	    }
		
	
			   
		
	   
		
	}

}
