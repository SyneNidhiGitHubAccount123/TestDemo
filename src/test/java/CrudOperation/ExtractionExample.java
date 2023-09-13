package CrudOperation;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ExtractionExample 
{

	
	@Test
	public void testExtractionExample() 
	{
		
		RestAssured.baseURI = "http://localhost";
		RestAssured.port = 8888;
		RestAssured.basePath = "/student";				
		Response resp = given().contentType(ContentType.JSON).log().all()
				.get("/list");
		
		 List<Integer> ids= resp.then().extract().path("id");
		 List<String> firstName= resp.then().extract().path("firstName");
		 List<String> lastName= resp.then().extract().path("lastName");
		 List<String> email= resp.then().extract().path("email");
		 List<String> programme= resp.then().extract().path("programme");
		 List<String> courses= resp.then().extract().path("courses");
		 
//		 System.out.println(ids);
//		 System.out.println(firstName);
//		 System.out.println(lastName);
//		 System.out.println(email);
//		 System.out.println(programme);
		 
		 System.out.println(courses);
		 
		 
		 for(int i=0;i<ids.size();i++)
		 {
			 System.out.println(ids.get(i));
			 System.out.println(firstName.get(i));
			 System.out.println(lastName.get(i));
			 System.out.println(email.get(i));
			 System.out.println(programme.get(i));
			 
			 
			 System.out.println("-------------------------------------------------------------------------------------");
			 
		 }
		 
//		 for(int i=0;i<ids.size();i++)
//		 {
//			 System.out.println(ids);
//		 }
	}
}
