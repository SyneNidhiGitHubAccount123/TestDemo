package CrudOperation;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;

import org.testng.ITestContext;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class OneReqToAnother 
{
	int id;
	
	@Test
	public void testReq()
	{
		RestAssured.baseURI="http://localhost";
		RestAssured.port=8888;
		RestAssured.basePath="/student";
		
		Response res =given().contentType(ContentType.JSON).log().all().get("/list");
		
		JsonPath extractor =  res.jsonPath() ;
		
		id = extractor.get("[9].id");
		 
		System.out.println("id  " + id);
		
		
	}
	
	
	
	@Test
	public void testReq1()
	{
		RestAssured.baseURI="http://localhost";
		RestAssured.port=8888;
		RestAssured.basePath="/student";
		
		Response res =given().contentType(ContentType.JSON).log().all().get("/"+id+"");
		
		res.prettyPrint();
		
		
	}

}
