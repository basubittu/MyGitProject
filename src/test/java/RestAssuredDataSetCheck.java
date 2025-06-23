import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;
import org.testng.asserts.*;
public class RestAssuredDataSetCheck {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		RestAssured.baseURI="https://rahulshettyacademy.com";
	String responseData=given().header("Content-Type","application/json").body(PayLoad.addPayLoad("acd","227826397","RabindraNath")).when()
	.post("/Library/Addbook.php").then().assertThat().statusCode(200).extract().response().asString();
	System.out.println("responseData--->"+responseData);
	JsonPath js= new JsonPath(responseData);
	
	String msg= js.getString("Msg");
	String  id= js.getString("ID");
	System.out.println("msg----->"+msg);
	System.out.println("id----->"+id);
	
	
				
				

	}

}
