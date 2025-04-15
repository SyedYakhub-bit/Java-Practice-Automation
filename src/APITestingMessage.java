import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class APITestingMessage {
    public static void main(String[] args) {
        Response response=given().log().all().formParams("firstname" ,"Syed","firstexecution", "1",
        "formSubmit","Submit").when().post("http://testingchallenges.thetestingmap.org/index.php");
        System.out.println("Status Code is: "+response.getStatusCode());

    }
}
