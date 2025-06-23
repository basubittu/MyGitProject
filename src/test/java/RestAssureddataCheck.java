import org.openqa.selenium.*;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class RestAssureddataCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RestAssured.baseURI = "https://rahulshettyacademy.com";
		given().log().all().header("Content-Type", "application/json").body(PayLoad.getPayLoad()).log().all().when()
				.post("Library/Addbook.php").then().assertThat().log().all().statusCode(200)
				.body("Msg", equalTo("Book Already Exists")).header("Server", "Apache/2.4.52 (Ubuntu)");

	}

}
