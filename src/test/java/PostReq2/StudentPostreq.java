package PostReq2;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class StudentPostreq
{
	//For JSON
	
//	{
//	    "firstName": "Nidhi",
//	    "lastName": "Khandelwal",
//	    "programme": "nidhirk@yahoo.com",
//	    "email": "Computer science",
//	    "course": {
//	        "name": "java",
//	        "score": "Nidhi"
//	    }
//	}
	
	
//	----------------------------------------------------------------------------------------------------------------
	
//	@Test
//	public void postreq()
//	{	
//		
//		RestAssured.baseURI = "http://localhost";
//		RestAssured.port = 8888;
//		RestAssured.basePath = "/student";
//		
//		Student stu = new Student("Nidhi","Khandelwal","nidhirk@yahoo.com","Computer science");
//		
//		stu.setCourse(new Courses("java","Nidhi"));		
//		
//		given().contentType(ContentType.JSON).log().all().body(stu).post();
//		
//		
//	}
	
	
	@Test
	public void postreq()
	{	
		
		RestAssured.baseURI = "http://localhost";
		RestAssured.port = 8888;
		RestAssured.basePath = "/student";
		
		Student stu = new Student("Abhinav","Kaushik","CSE","ahdhfffdh@gmail.com");
		
		Courses obj = new Courses("Java","80");
		stu.setCourse(obj);		
		
		Response resp = given().contentType(ContentType.JSON).log().body()
				.body(stu).post();
		
		System.out.println("-----------RESPONSE---------------");
		resp.prettyPrint();		
		
	}
	
		
	}

