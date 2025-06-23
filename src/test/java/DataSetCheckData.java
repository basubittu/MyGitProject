import org.testng.annotations.*;
import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import org.testng.annotations.DataProvider;

public class DataSetCheckData {
	String name;
	String aisle;
	String poetName;

	@Test(dataProvider = "DataSet1")
	public void setApi(String name, String aisle, String poetName) {
		this.name = name;
		this.aisle = aisle;
		this.poetName = poetName;

		RestAssured.baseURI = "https://rahulshettyacademy.com";
		String response = given().header("Content-Type", "application/json")
				.body(PayLoad.addPayLoad(name, aisle, poetName)).when().post("/Library/Addbook.php").then().assertThat()
				.statusCode(200).extract().response().asString();
		JsonPath js = new JsonPath(response);
		
		System.out.println("MSG----->"+ js.getString("Msg"));
		System.out.println("ID----->"+ js.getString("ID"));

	}
	
	@DataProvider(name="DataSet1")
	
	public  Object getDataProvider()
	{
		return new Object[][] {{"bcd","234567898","Rabindranath Tagore"} ,{"abc","789098767","Nazrul Islam"}};
	}
	

}
