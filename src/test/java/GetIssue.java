import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import static io.restassured.RestAssured.*;

public class GetIssue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI = "https://infobasu96-1748921481920.atlassian.net/";
		String response = given().header("Content-Type", "application/json").header("Authorization",
				"Basic aW5mb2Jhc3U5NkBnbWFpbC5jb206QVRBVFQzeEZmR0YwbTQyOUNoRVJPT0U3NjFtSm1OTm1JWl9zYlhNZEZTRmU2aVFnb3J2eHpzQlJyVWE3cEQ1cFBaVVZKU2pHZmlrcW9GRUJuZldVb3FXcUhNbHM3UUJSanQ3dFVleGhVb201cEMySWF0MmVUOF9vNjlzLXhxQmRZdGVHbHR4MXpiYUtyUEFrVXpTNUVSMzJWdWJ4VmZndFRKME1IanRCVE9aVktyaE5CdDFSZlJnPTM0RDIwNDgw")
				.body("{\r\n" + "\"fields\": {\r\n" + "   \"project\":\r\n" + "   { \r\n" + "      \"key\": \"AP\"\r\n"
						+ "   },\r\n" + "   \"summary\": \"REST EXAMPLE\",\r\n"
						+ "   \"description\": \"Creating an issue via REST API\",\r\n" + "   \"issuetype\": {\r\n"
						+ "      \"name\": \"Bug\"\r\n" + "   }\r\n" + "  }\r\n" + "}")
				.when().post("/rest/api/2/issue").then().assertThat().statusCode(201).extract().response().asString();

		System.out.println("response------>" + response);
		JsonPath js = new JsonPath(response);

		int id = js.getInt("id");

		// get issue details
		String responseDetails = given().header("Content-Type", "application/json").header("Authorization",
				"Basic aW5mb2Jhc3U5NkBnbWFpbC5jb206QVRBVFQzeEZmR0YwbTQyOUNoRVJPT0U3NjFtSm1OTm1JWl9zYlhNZEZTRmU2aVFnb3J2eHpzQlJyVWE3cEQ1cFBaVVZKU2pHZmlrcW9GRUJuZldVb3FXcUhNbHM3UUJSanQ3dFVleGhVb201cEMySWF0MmVUOF9vNjlzLXhxQmRZdGVHbHR4MXpiYUtyUEFrVXpTNUVSMzJWdWJ4VmZndFRKME1IanRCVE9aVktyaE5CdDFSZlJnPTM0RDIwNDgw")
				.when().get("/rest/api/2/issue/" + id).then().extract().asString();

		System.out.println("responsedetails---->" + responseDetails);

	}

}
