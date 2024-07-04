package base_url;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static utilities.Authentication.generateToken;

public class BaseUrl {
//    Purpose: Configures a base URL, sets the content type to JSON, and adds an authorization header using a generated token.
//    Usage: Once setUp is called with valid username and password, spec can be used throughout the application to make authenticated requests to the specified base URI (https://managementonschools.com/app)
    public static RequestSpecification spec;

    public static void setUp(String username, String password){
        spec = new RequestSpecBuilder()
                .setBaseUri("https://managementonschools.com/app")
                .setContentType(ContentType.JSON)
                .addHeader("Authorization", generateToken(username, password))
                .build();
    }
}