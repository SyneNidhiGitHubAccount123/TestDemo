package PostReq3;

import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import org.testng.annotations.Test;



public class StudentPostReq 
{
	//For Json Type
	
//	{
//	    "firstName": "Abhinav",
//	    "lastName": "Kaushik",
//	    "programme": "CSE",
//	    "email": "ahdhfffdh@gmail.com",
//	    "courses": [
//	        {
//	            "name": "Jave",
//	            "score": "70"
//	        },
//	        {
//	            "name": "C++",
//	            "score": "70"
//	        }
//	    ]
//	}
	

	@Test
	public void postreq()
	{
				
		RestAssured.baseURI = "http://localhost";
		RestAssured.port = 8888;
		RestAssured.basePath = "/student";
		
		
		Student st = new Student("Abhinav","Kaushik","CSE","ahdhfffdh@gmail.com");
		st.addCourse("Jave","70");
		st.addCourse("C++","70");
		
		
		Response resp = given().contentType(ContentType.JSON).log().body()
				.body(st).post();
		
		System.out.println("-----------RESPONSE---------------");
		resp.prettyPrint();
		
		
	}

}
