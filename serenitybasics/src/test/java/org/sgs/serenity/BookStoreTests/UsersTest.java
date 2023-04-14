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
	Response bookListResponse;
	
	@Given("As a Authorized user with Valid access ")
	public void createRequest(String token) {
		given().baseUri("https://bookstore.toolsqa.com/")
		.headers("Authorization", "Bearer "+ token)
        .basePath("Account/v1/User");
	}
	
	@Given("As a Authorized user with Valid access ")
	public void createGetBooksRequest(String token) {
		given().baseUri("https://bookstore.toolsqa.com/")
		.headers("Authorization", "Bearer "+ token)
        .basePath("BookStore/v1/Books");
	}
	
	@When("when requests for Account info Account/v1/User/")
    public void whenRequestedForUserInformation(String uuid) {
        response = when().get("/" + uuid);
    }
	
	
	@When("when requests for Account info Account/v1/User/")
    public void whenRequestedForBookList() {
		bookListResponse = when().get();
		System.out.println("Resp -> ");
        System.out.println("Resp -> "+ bookListResponse.getBody().asPrettyString());
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
	public void validateAttributeAvailableInListResponse() {
		Root resp= bookListResponse.getBody().as(Root.class);
        String[] attributes = "author,pages,isAvailable".split(",");
		for( String eachAttribute : attributes) {
			resp.books.forEach(n-> assertTrue( checkField(n, eachAttribute, false, true,null ,null )));	
		}	
	}
	
	public static boolean checkField(Book bookResponse,String fieldName,boolean hasValue, boolean checkValue , String stringValue , Integer intValue) {
		System.out.println("checkField" + bookResponse);
		if(fieldName.equals("pages")) {
			
			if(hasValue) {
			 return (bookResponse.pages == intValue);
			}else if(checkValue) {
				return bookResponse.pages!=null;
			}
		}

		if(fieldName.equals("author")) {
			
			if(hasValue) {
			 return (bookResponse.author == stringValue);
			}else if(checkValue) {
				return bookResponse.author!=null;
			}
		}
		if(fieldName.equals("isAvailable")) {
			
			if(hasValue) {
			 return (bookResponse.isAvailable == checkValue);
			}else if(checkValue) {
				return bookResponse.isAvailable==null;
			}
		}
		
		return false;
	}
	
}





