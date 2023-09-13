package CrudOperation;

import static io.restassured.RestAssured.given;
import java.io.File;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostReqTest 
{
	
	
	@Test
	public void postReq()
	{
		
		RestAssured.baseURI = "http://localhost";
		RestAssured.port = 8888;
		RestAssured.basePath= "/student";	
		
		File json = new File("C://Users//Nidhi.Khandelwal//Workspace1//LearningRestAssured//Student.json");
		
		Response resp = given().contentType(ContentType.JSON).log().all().body(json).post();
		
		resp.prettyPrint();			
		
	}
	
	
	
//	@Test
//	public void postReq()
//	{
//		RestAssured.baseURI = "http://localhost";
//		RestAssured.port = 8888;
//		RestAssured.basePath= "/student";		
//		
//		File json = new File("C://Users//Nidhi.Khandelwal//Workspace1//LearningRestAssured//Student.json");
//		
//		Response resp = given().contentType(ContentType.JSON).log().all().body(JsonArrayAndJsonObject.obj).post();		
//		resp.prettyPrint();			
//		
//	}


}
