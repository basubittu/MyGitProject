import org.openqa.selenium.*;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
public class RestassuredData {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		RestAssured.baseURI="https://rahulshettyacademy.com";
		given().header("Content-Type","application/json"). body(""
				+ "{\r\n"
				+ "\"name\":\"Learn Appium Automation with Java\",\r\n"
				+ "\"isbn\":\"bcd\",\r\n"
				+ "\"aisle\":\"227826382\",\r\n"
				+ "\"author\":\"John foe\"\r\n"
				+ "}").when().post("Library/Addbook.php").then().log().all().assertThat().statusCode(200);

	}

}
