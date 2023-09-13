package Basics;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetAllStudentsTest
{
	
	@Test
	public void getAllStudents()
	{
		RestAssured.baseURI="http://localhost:8080";
		RestAssured.port=8888;
		RestAssured.basePath="/student/list";
		
		RequestSpecification req = given();
		
		//add contentType
		//immutable class
		req=req.contentType(ContentType.JSON);
		//setting headers
		
		req = req.headers("X","Y");
		req.log().all();
		Response res =req.get();
		
		//res.prettyPrint();
		
//		res.print();
		
		
		//content type
		//headers in the response 
		//check response time
		//status code
		
//		System.out.println(res.getContentType());
//		System.out.println(res.getHeaders());
//		System.out.println(res.getTime());
//		System.out.println(res.getStatusCode());
		
		
		System.out.println(res.getCookies());
				
		
	}

}
