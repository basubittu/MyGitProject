import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class RestAssuredDataSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		String responseData = given().header("Content-Type", "application/json")
				.body("{\r\n" + "\"name\":\"Learn Appium Automation with Java\",\r\n" + "\"isbn\":\"bcd\",\r\n"
						+ "\"aisle\":\"227826397\",\r\n" + "\"author\":\"John foe\"\r\n" + "}")
				.when().post("Library/Addbook.php").then().assertThat().statusCode(200).extract().response().getBody()
				.asString();

		System.out.println("responseData----->" + responseData);
		JsonPath js = new JsonPath(responseData);
		System.out.println("Message is---->" + js.getString("Msg"));
		System.out.println("ID is---->" + js.getString("ID"));

	}

}
