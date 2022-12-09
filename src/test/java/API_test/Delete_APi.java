package API_test;
import static io.restassured.RestAssured.given;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Delete_APi {
@Test
	public void userdefine() {
		RestAssured.baseURI="https://reqres.in";
		
	Response response=given()
			.when()
			.delete("api/users/2")
			.then()
			.extract()
			.response();
			
			System.out.println(response.asPrettyString());
			System.out.println(response.getStatusCode());// conformation
			String line= response.getStatusLine();
			System.out.println(line);
			String r =line.split(" ")[1] ;
			System.out.println(r);
		    int rr=	Integer.parseInt(r);
			AssertJUnit.assertEquals(204, rr);//conform
	}
} 
