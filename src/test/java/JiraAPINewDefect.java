import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.path.json.JsonPath;
import static io.restassured.RestAssured.*;
import org.testng.annotations.*;
public class JiraAPINewDefect {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		RestAssured .baseURI="https://infobasu96-1748921481920.atlassian.net";
		String response=given().header("Authorization","Basic aW5mb2Jhc3U5NkBnbWFpbC5jb206QVRBVFQzeEZmR0YwZWQ3ZDEybmVaWURpMDBQRVIwbmlrdHVhMl9vQW1FYktkRmtLOWN3b3FNSHFla3c3dDRQYzZxZktNMWRQZDY4Y0VVOXdrQUJBaVYwc0lXeUtvMnRlWGpsMjhPWncwZ3M5Z2o2N0tWbEt5ZFU4NDNVai02dU9NWFNjZi1PcEhmSmxleXpWNkNSWXhfcFFMTWZra1RkbnBqd1J1RXU4UUFBSWhIZk5yYWNlUEtVPTEyRTEwRTc5")
		.header("Content-Type","application/json").body("{\r\n"
				+ "\"fields\": {\r\n"
				+ "   \"project\":\r\n"
				+ "   { \r\n"
				+ "      \"key\": \"DAT\"\r\n"
				+ "   },\r\n"
				+ "   \"summary\": \"New JIRA DEFECT Check\",\r\n"
				+ "   \"description\": \"Creating an issue via REST API Check . New data set\",\r\n"
				+ "   \"issuetype\": {\r\n"
				+ "      \"name\": \"Bug\"\r\n"
				+ "   }\r\n"
				+ "  }\r\n"
				+ "}").when().post("rest/api/2/issue").then().assertThat().statusCode(201).extract().response().body().asString();
		
		System.out.println("Response----->"+response);
		JsonPath js= new JsonPath(response);
		String id=js.getString("id");
		String msg=js.getString("key");
		String url=js.getString("self");
		System.out.println("ID----->"+id);
		System.out.println("msg----->"+msg);
		System.out.println("url----->"+url);

	}

}
