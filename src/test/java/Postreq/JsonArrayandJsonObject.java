package Postreq;


import static io.restassured.RestAssured.given;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class JsonArrayandJsonObject {
	
	
	@Test
	public void test001() throws JSONException
	{		
		RestAssured.baseURI = "http://localhost";
		RestAssured.port = 8888;
		RestAssured.basePath= "/student";
			
		JSONObject obj = new JSONObject();
		obj.put("firstName","Abhinav");
		obj.put("latsName", "Kasushik");
		obj.put("email", "abdhd@gmail.com");
		obj.put("programme", "CS");
		JSONArray arr = new JSONArray();
		arr.put("Java");
		arr.put("c");
		arr.put("c++");
		obj.put("courses", arr);		
		
		Response resp = given().contentType(ContentType.JSON).log().body().body(obj.toString()).post();
		
		resp.prettyPrint();
		
	}

}

