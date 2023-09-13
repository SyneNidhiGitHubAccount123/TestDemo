package CrudOperation;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CrudGetReq
{
	
	CrudGetReq()
	{
		RestAssured.baseURI="http://localhost:8888";
		RestAssured.port=8888;
		RestAssured.basePath="/student";
	}

	
	@Test
	public void TestGetReq()
	{
				
		Response res =given().contentType(ContentType.JSON).log().all().get("/list");		
		res.prettyPrint();		
		
	}
	
	
	
	@Test
	public void TestGetReq1()
	{
		Response res =given().contentType(ContentType.JSON).log().all().get("/10");		
		res.prettyPrint();		
		
	}
	

	@Test
	public void TestGetReq2()
	{
				
		Response res =given().contentType(ContentType.JSON).log().all().get("/list?programme=Financial Analysis");		
		res.prettyPrint();		
		
	}
	
	
	@Test
	public void TestGetReq3()
	{
		
		Response res =given().contentType(ContentType.JSON).log().all().get("/list?programme=Financial Analysis&limit=4");		
		res.prettyPrint();		
		
	}
	

   


}
