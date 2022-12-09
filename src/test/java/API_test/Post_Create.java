package API_test;

import static io.restassured.RestAssured.given;

import java.security.PublicKey;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class Post_Create {
@Test
//mothode-.1
	public void create_api() {
		RestAssured.baseURI = "https://reqres.in";

		Response response =
				given()
				.contentType(ContentType.JSON)
				.body("{\r\n"
						+ "    \"name\": \"morpheus\",\r\n"
						+ "    \"job\": \"leader\"\r\n"
						+ "}")
			 	.when()
			.post("api/users")
				.then()
				.extract()
				.response();
		System.out.println(response.getStatusCode());
		
		System.out.println(response.asPrettyString());
	}
}
	
	/*
@Test
//method->2
public void createapi() {
	
	public String userPayload() {
		return"{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}";
	
	
	RestAssured.baseURI = "https://reqres.in";


	Response response =
			given()
			.contentType(ContentType.JSON)
			.body(userPayload)
		 	.when()
			.post("api/users")
			.then()
			.extract()
			.response();
	System.out.println(response.getStatusCode());
	
	System.out.println(response.asPrettyString());
}
}*/

//method 3
//@Test
//
//public void createapi() {
//	
//	public String userPayload(String email, String pass) {
//		return"{\r\n"
//				+ "    \"name\": \""+email+",\r\n"
//				+ "    \"job\": \"" +pass+"\r\n"
//				+ "}";
//	
//	
//	RestAssured.baseURI = "https://reqres.in";
//
//
//	Response response =
//			given()
//			.contentType(ContentType.JSON)
//			.body(userPayload)
//		 	.when()
//			.post("api/users")
//			.then()
//			.extract()
//			.response();
//	System.out.println(response.getStatusCode());
//	
//	System.out.println(response.asPrettyString());
//}
//}*/