package LocalhostAPI;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.opentelemetry.sdk.logs.data.Body;
import io.restassured.RestAssured;
import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LocalhostAPI {

	 @Test (priority = 1) 
	 void getReqquest() {
	 
	 given()
	 
	 .when()
	 .get("http://localhost:3000/employees")
	 
	 .then()
	 .statusCode(200)
	 .body("id[1]", equalTo("102") )
	 .log().all(); }
	
	 
	 
	 @Test (priority = 2)
	 
	 void CreateRequest() {
	
	 HashMap data= new HashMap();
	
	data.put("id", "111");
	data.put("name", "Anora");
	data.put("email","Anora@gmail.com");
	data.put("skills", "Communications");
	data.put("active","False");
	 
	 
	  given() .body(data)
	  
	  
	 .when() .post("http://localhost:3000/employees")
	 
	 .then() 
	 
	 .statusCode(201) 
	 .body("id", equalTo("111"))
	 .body("name",equalTo("Anora"))
	 .body("email", equalTo("Anora@gmail.com"))
	 .body("active",equalTo("False")) 
	 .log().all();
	
	 }
	 
	 
	@Test (priority = 3)
	void PatchRequest() {

		HashMap project1 = new HashMap();

		project1.put("projectId", "P110");
		project1.put("projectName", "Automation");
		project1.put("durationMonths", "60");
		project1.put("technologies", "API");

		List<Map<String, Object>> projects = new ArrayList<>();
		projects.add(project1);

		HashMap data = new HashMap();
		data.put("name", "Vedu Borhade");

		List<String> skills = Arrays.asList("LAW", "Finance", "Auditing", "Mobile");

		data.put("skills", skills);
		data.put("projects", projects);

		given()
		
		.body(data)
			
		.when()
			.patch("http://localhost:3000/employees/110")

		.then()
				.statusCode(200)
				.log().all()
				.body("id", equalTo("110"))
				.body("email", equalTo("vedu@technova.com"))
				.body("name", equalTo("Vedu Borhade"));
	}
	
	
	@Test (priority = 4)
	void deleteReqquest() {
		 
		 given()
		 
		 .when()
		 .delete("http://localhost:3000/employees/111")
		 
		 .then()
		 .statusCode(200)
		 .body("id", equalTo("111"))
		 .log().all();
		 
	}
}
