package UsingCollection;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import org.testng.annotations.Test;

public class JsonUsingCollections {
	
//josn using collection 
//	{
//	    "firstName": "Abhinav",
//	    "lastName": "kaushik",
//	    "courses": [
//	        "java",
//	        "c",
//	        "c++"
//	    ],
//	    "programme": "Computer science",
//	    "email": "adbbggdddddhh@gmail.com"

	@Test
	public void test001() {

		RestAssured.baseURI = "http://localhost";
		RestAssured.port = 8888;
		RestAssured.basePath = "/student";

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("firstName", "Abhinav");
		map.put("lastName", "kaushik");
		map.put("email", "adbbggdddddhh@gmail.com");
		map.put("programme", "Computer science");

		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("c");
		list.add("c++");

		map.put("courses", list);
		
		
		Response resp = given().contentType(ContentType.JSON).log().body()
				.body(map).post();
		System.out.println("-----------RESPONSE---------------");
		resp.prettyPrint();

	}

}
