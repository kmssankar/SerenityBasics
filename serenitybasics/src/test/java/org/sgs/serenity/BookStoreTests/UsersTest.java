package org.sgs.serenity.BookStoreTests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import net.serenitybdd.core.steps.UIInteractions;

import static net.serenitybdd.rest.SerenityRest.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.List;

import org.hamcrest.Matchers;
import org.sgs.serenity.common.pojos.Book;
import org.sgs.serenity.common.pojos.PMMSResponse;
import org.sgs.serenity.common.pojos.Root;


public class UsersTest  extends UIInteractions{
	
	Response response;
	
	@Given("As a Authorized user with Valid access ")
	public void createRequest(String token) {
		given().baseUri("https://bookstore.toolsqa.com/")
		.headers("Authorization", "Bearer "+ token)
        .basePath("Account/v1/User");
	}
	
	@When("when requests for Account info Account/v1/User/")
    public void whenRequestedForUserInformation(String uuid) {
        response = when().get("/" + uuid);
    }
	
	
	@Then("get non empty user info as result")
    public void thenISeeUserUuidAsResult(String uuid) {
        then().body("userId", Matchers.equalTo(uuid));
    }
	
	
	public void validateAttributeValueInArray(String attribute , int value) {	
		List<Integer> jsonArrayResponseValue = response.jsonPath().getList(attribute);
		System.out.print(jsonArrayResponseValue);
	    assertTrue(jsonArrayResponseValue.stream().allMatch(n-> n== value));
		
	}

	class ListResponse{
		List<PMMSResponse> pMMSResponseList;
	}
	//""
	public <T> void validateAttributeAvailableInListResponse(String attributeList) {
		ListResponse resp= response.as(ListResponse.class);
        String[] attributes = attributeList.split(",");
		for( String eachAttribute : attributes) {
			resp.pMMSResponseList.forEach(n-> assertTrue( checkField(n, eachAttribute, false, true,null ,null )));	
		}	
	}
	
	public static boolean checkField(PMMSResponse pMMSResponse,String fieldName,boolean hasValue, boolean checkValue , String stringValue , Integer intValue) {
		
		if(fieldName.equals("drugListId")) {
			
			if(hasValue) {
			 return (pMMSResponse.drugListId == intValue);
			}else if(checkValue) {
				return pMMSResponse.drugListId!=null;
			}
		}

		return false;
	}
	
	public static Object getFieldValue(Object object, String attribute) {
		Object value =null;
	try {
			Field field = object.getClass().getDeclaredField(attribute);
			value = field.get(object);
			
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return value;
	}
}





