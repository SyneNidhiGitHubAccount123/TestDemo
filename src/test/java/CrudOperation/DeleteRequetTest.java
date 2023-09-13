package CrudOperation;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

import java.io.File;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class DeleteRequetTest
{
	
	@Test
	public void deleteRequest()
	
	{
		RestAssured.baseURI="http://localhost";
		RestAssured.port=8080;
		RestAssured.basePath="/student";		
		
		Response res=given().contentType(ContentType.JSON).log().all().delete("/101");
		
		
	}

}
