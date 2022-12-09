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

public class Get_Api_Para { 
	//it is work on test-dummy para->GET->{{basepath}}/api/users?page=2
	 @Test
	 public void getListUserwith_para() {
	 RestAssured.baseURI="https://reqres.in";
	 
	 Response response= given()
			 .when() 
			 .queryParam("page", 2)//yaha page change kiya to bhi chalta hai
			 .get("/api/users")	
			 .then()
			 .extract()
			 .response();
	 
	 System.out.println(response.asPrettyString());
	 
	 
	 }
	  
}	
