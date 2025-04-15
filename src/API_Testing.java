import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class API_Testing {
    public static void main(String[] args) {

        RestAssured.baseURI="http://www.crosschecknet.com";
        Response response=given().log().all().when().get("/?s=SyedYakhub");
        System.out.println(response.getStatusCode());
        System.out.println(response.asString());

    }
}
