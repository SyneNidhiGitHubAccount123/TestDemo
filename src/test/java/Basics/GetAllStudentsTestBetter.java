package Basics;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetAllStudentsTestBetter 
{

  @Test	
  public void GetAllStudents()
  
  {
		RestAssured.baseURI="http://localhost:8080";
		RestAssured.port=8080;
		RestAssured.basePath="/student/list";
		
		Response res = given().contentType(ContentType.JSON).header("X","Y").log().all().get();
		
		res.prettyPrint();		
		
		System.out.println(res.getContentType());
		System.out.println(res.getHeaders());
		System.out.println(res.getTime());
		System.out.println(res.getStatusCode());
		
  }
	
	
}
