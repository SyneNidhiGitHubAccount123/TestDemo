package PostReqSimple;
import static io.restassured.RestAssured.given;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostReqEx 
{

	//for json
	
//	{
//	    "firstName": "Abhinav",
//	    "lastName": "kaushik",
//	    "email": "abhinav.kaushik@gmail.com",
//	    "programme": "computer science",
//	    "courses": [
//	        "java",
//	        "c++",
//	        "c"
//	    ]
//	}
	
	@Test
	public void testPostreq()
	{
		
		RestAssured.baseURI = "http://localhost";
		RestAssured.port = 8888;
		RestAssured.basePath = "/student";
		
		List<String> courses = new ArrayList();
		
		courses.add("java");
		courses.add("c++");
		courses.add("c");
		
		Student stu = new Student("Abhinav","kaushik","abhinav.kaushik@gmail.com","computer science",courses);
		
		given().contentType(ContentType.JSON).log().all().body(stu).post();
		
	}
	
}
