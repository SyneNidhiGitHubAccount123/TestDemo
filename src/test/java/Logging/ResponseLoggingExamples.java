package Logging;
import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ResponseLoggingExamples
{

	@Test
	public void name()
	{
		RestAssured.baseURI="http://localhost";
		RestAssured.port=8888;
		RestAssured.basePath="/student";
		

		File json = new File("C://Users//Nidhi.Khandelwal//Workspace1//LearningRestAssured//Student.json");
	//	given().contentType(ContentType.JSON).get("/18").then().log().headers();		
	//	given().contentType(ContentType.JSON).get("list").then().log().body();	
		
		//need to see this in video again 
		given().contentType(ContentType.JSON).get("list").then().log().ifError();
		
	}
	
}
