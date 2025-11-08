package HTTPSRequest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;


public class HTTPSRequest {
	int id ;
	
	  @BeforeClass
	    void setup() {
	        RestAssured.baseURI = "https://reqres.in/api";
	    }
	@Test (priority=1)
	void getuser() {
	
		given()
		
		.when()
			.get("/users?page=2")
		.then()
			.statusCode(200)
			.body("page", equalTo(2))
			.log().all();	
		
	}
	
	
	
	@Test(priority=2)
	void createUser() {
		
		HashMap data = new HashMap();
		data.put("name", "Prashant");
		data.put("Job", "Trainer");

		id= given()
		.contentType("application/json")
		.header("x-api-key", "reqres-free-v1")
		.body(data)

		.when()
		.post("/users")
		.jsonPath().getInt("id");
	
	}
	
	
	@Test(priority=3)
	void UpdateUser() {
		
		HashMap data = new HashMap();
		data.put("name", "Pragati");
		data.put("Job", "Teacher");

		given()
		.contentType("application/json")
		.header("x-api-key", "reqres-free-v1")
		.body(data)

		.when()
		.put("/users/" +id)
		
		.then()
		.statusCode(200)
        .log().all();
	}	
	
	
	@Test (priority=4)
	void deletuser() {
		
		given()
		.contentType("application/json")
		.header("x-api-key", "reqres-free-v1")
		
		.when()
		.delete("/users/" +id)
		
		.then()
		.statusCode(204)
		.log().all();
	}
	
	
	
	
	

}
