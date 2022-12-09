package API_test;
import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Get_Api_normal { 
	//it is work on test-dummy para->GET->{{basepath}}/api/users?page=2
	 @Test
	 public void getListUser() {
	 RestAssured.baseURI="https://reqres.in";
	 
	 Response response= given()
			 .when()
			 .get("/api/users?page=2")	
			 .then()
			 .extract()
			 .response();
	 
//	  
// 	  int statuscode= response.getStatusCode();//200
// 	 AssertJUnit.assertEquals(statuscode, 200);
// 	 System.out.println( response.getHeader("Report-To"));//{"endpoints":[{"url":"https:\/\/a.nel.clou
// 	 
// 	 
//		Headers headers= response.getHeaders();
//		for(Header s:headers) {
//			System.out.println(s.getName()+"| "+s.getValue()); //31-36
//		}
		/* Content-Type| application/json; charset=utf-8
Transfer-Encoding| chunked
Connection| keep-alive
X-Powered-By| Express
Access-Control-Allow-Origin| *
Etag| W/"406-ut0vzoCuidvyMf8arZpMpJ6ZRDw"*/
		
		// your can also validate using assert
		//AssertJUnit.assertTrue(response.getHeader("Content-Type")).contains("application/json");
		
	System.out.println(response.asPrettyString());
	
	
	JsonPath jsonpath=  response.jsonPath();
	String email= jsonpath.get("data[1].email");
	System.out.println(email);
	AssertJUnit.assertEquals(email, "\"lindsay.ferguson@reqres.in\"");
	}

	 
}	
