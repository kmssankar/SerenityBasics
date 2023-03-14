package org.sgs.serenity.common;

import org.sgs.serenity.common.dtos.Credentials;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Authentication {
	
	public static String getAccessToken(Credentials credentials, String loginUrl){
	    RequestSpecification requestSpec = RestAssured.with();
	    requestSpec.given().contentType("application/json").body(credentials);
	    Response response = requestSpec.post(loginUrl);
	    String responseMsg = response.asString();
	    System.out.println(">> Get Access token RESPONSE: " + responseMsg);

	    String token = JsonPath.from(responseMsg).get("token");
	    return token; 
	}
	
}
