package utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Authentication {

//    Purpose :
//    It provides a method (generateToken) to authenticate users by sending their username and password to a specified URL, and retrieves a security token in response.
//
//    Usage :
//    It helps securely authenticate users in Java applications by generating a token that can be used for accessing protected resources or performing authorized actions within the application.

//    public static void main(String[] args) {
//        System.out.println(generateToken("AdminAhmet","AhmetBayram1+"));
//    }

    public static String generateToken(String username, String password) {
//        String body = "{\n" +
//                "  \"password\": \""+password+"\",\n" +
//                "  \"username\": \""+username+"\"\n" +
//                "}";
//        String body = "{ \"password\": \"" + password + "\", \"username\": \"" + username + "\" }";
//        OR
        String body = "{ \"username\": \"" + username + "\", \"password\": \"" + password + "\" }";

        Response response = given().when().body(body).contentType(ContentType.JSON).post("https://managementonschools.com/app/auth/login");

        if (response.getStatusCode() != 200) {
            System.out.println("Invalid Credentials!!! Username : " + username + " | Password : " + password);
        } else {
            System.out.println("Valid Credentials!!! Username : " + username + " | Password : " + password);
        }

        return response.jsonPath().getString("token");
    }

}
