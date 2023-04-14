package org.sgs.serenity.BookStoreTests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.sgs.serenity.common.Authentication;
import org.sgs.serenity.common.dtos.Credentials;
import org.sgs.serenity.utils.ConfigurationReader;


import net.serenitybdd.junit5.SerenityJUnit5Extension;

@ExtendWith(SerenityJUnit5Extension.class)
public class BookStoreTests {
	
	private static String token;
	private static ConfigurationReader configurationReader;
	private static String uuid="8e9dc6a6-3493-42eb-ab9f-143b21c9b53d";
	UsersTest userTest = new UsersTest();
	
	@BeforeAll
	public static void loadConfigAndAuth() {
		configurationReader = new ConfigurationReader();
		Credentials credentials = new Credentials(configurationReader.getProperty("loginUsername"),
				configurationReader.getProperty("loginPassword"));
		token = Authentication.getAccessToken(credentials,configurationReader.getProperty("baseUrl")+configurationReader.getProperty("loginUrl"));
	}
	
	@Test
	 public void fetchAuthorizedUserInfo() {
		userTest.createRequest(token);
		userTest.whenRequestedForUserInformation(uuid);
		userTest.thenISeeUserUuidAsResult(uuid);
    }

	@Test
	 public void fetchBookListInfo() {
		userTest.createGetBooksRequest(token);
		userTest.whenRequestedForBookList();
		userTest.validateAttributeAvailableInListResponse();
   }
}
