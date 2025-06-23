import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFiles 
{

	public static void main(String[] args) throws IOException {
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		String filePath = System.getProperty("user.dir") + "\\src" + "\\test" + "\\resources" + "\\JsonPayLoad.json";
		String bodyData = new String(Files.readAllBytes(Paths.get(filePath)));
		String response = given().header("Content-Type", "application/json").body(bodyData).when()
				.post("/Library/Addbook.php").then().assertThat().statusCode(200).extract().response().asString();
        JsonPath json = new JsonPath(response);

		String message = json.getString("Msg");
		String Id = json.getString("ID");

		System.out.println("message----->" + message);
		System.out.println("Id----->" + Id);

	}

}
