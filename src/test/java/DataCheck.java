import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class DataCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		String responsebody = given().header("Content-Type", "application/json").body(PayLoad.getPayLoad()).when()
				.post("Library/Addbook.php").then().assertThat().statusCode(200)
				.body("Msg", equalTo("Book Already Exists")).extract().response().asString();
		JsonPath js = new JsonPath(responsebody);
		System.out.println("Id Is----->" + js.getString("ID"));
		
		
		

	}

}
