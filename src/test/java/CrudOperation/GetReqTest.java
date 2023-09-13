package CrudOperation;

import static io.restassured.RestAssured.given;

import org.testng.ITestContext;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class GetReqTest
{
	
	 int id;
	 
	 GetReqTest()
	 {
		RestAssured.baseURI="http://localhost:8888";
		RestAssured.basePath="/student";
	 }
	
	@Test
	public void getStudent(ITestContext context)
	{
//		RestAssured.baseURI="http://localhost:8080";
//		RestAssured.port=8080;
//		RestAssured.basePath="/student/list";		
//		RestAssured.basePath="/student/1";
//		RestAssured.basePath="/student";		
		
		Response res =given().contentType(ContentType.JSON).header("X","Y").log().all().get("/list?programme=Financial Analysis&limit=4");
		
//		Response res =given().contentType(ContentType.JSON).header("X","Y").log().all().get("/101");
//		res.prettyPrint();
		
		
//		Response res =given().contentType(ContentType.JSON).log().all().get("/list");		
//		res.prettyPrint();
//		
//		String body =res.body().toString();
//	
//		System.out.println(body);
		
		
//		extractor.get("id")
		
		
		
		JsonPath extractor = res.jsonPath();
//     
//		int  id= extractor.get("[84].id");
//      
//		context.setAttribute("id", id);
      
//    String firstname= extractor.get("firstName");
//    String lastName= extractor.get("lastName");
//    String email= extractor.get("email");
//    String programme= extractor.get("programme");
//    
//    System.out.println(id);
//    System.out.println(firstname);
//    System.out.println(lastName);
//    System.out.println(email);
//    System.out.println(programme);
//    
//    List<String> courses= extractor.get("courses");
//    
//    System.out.println("Size "+courses.size());
//    
//    for(int i=0;i<courses.size();i++)
//    {
//    	String course =courses.get(i);
//    	System.out.println(course);
//    }
      		
	}
	
	
//	@Test
//	public void getidfrompreviousreq(ITestContext context) 
//	{
//		int id = (Integer) context.getAttribute("id");
//		Response res = given().contentType(ContentType.JSON).log().all().get("/"+id+"");
//		
//		res.prettyPrint();
//	
//	}
	
}
