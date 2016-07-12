package javaquick.programs;

import com.jayway.restassured.RestAssured;

public class RestAssuredUtil {
	
	public static final void setup(){
		
		RestAssured.basePath = "http://localhost";
		RestAssured.port = 8030;
		MockServer mockServer = new MockServer();
		mockServer.startWiremock(8030);
	}

}
