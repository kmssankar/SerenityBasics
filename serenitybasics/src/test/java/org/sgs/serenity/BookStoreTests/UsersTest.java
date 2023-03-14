package org.sgs.serenity.BookStoreTests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.steps.UIInteractions;

import static net.serenitybdd.rest.SerenityRest.*;

import org.hamcrest.Matchers;

public class UsersTest  extends UIInteractions{
	
	@Given("As a Authorized user with Valid access ")
	public void createRequest(String token) {
		given().baseUri("https://bookstore.toolsqa.com/")
		.headers("Authorization", "Bearer "+ token)
        .basePath("Account/v1/User");
	}
	
	@When("when requests for Account info Account/v1/User/")
    public void whenRequestedForUserInformation(String uuid) {
        when().get("/" + uuid);
    }
	
	
	@Then("get non empty user info as result")
    public void thenISeeUserUuidAsResult(String uuid) {
        then().body("userId", Matchers.equalTo(uuid));
    }

}
