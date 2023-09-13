package PostReq2Simple;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class postreq
{
	@Test
     public void testpostreq() 
    {
		
    		RestAssured.baseURI = "http://localhost";
    		RestAssured.port = 8888;
    		RestAssured.basePath = "/student";
    		
    		Student stu = new Student("Abhinav","Kaushik","ahdhfffdh@gmail.com","CSE");
    		stu.setCourse(new Courses("Java", "80"));
    		
    		given().contentType(ContentType.JSON).log().all().body(stu).post();
    		
    	 
	}
}
