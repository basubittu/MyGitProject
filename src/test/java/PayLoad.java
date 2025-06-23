
public class PayLoad 
{
  public static String getPayLoad()
  {
	  return "{\r\n"
	  		+ "\"name\":\"Learn Appium Automation with Java\",\r\n"
	  		+ "\"isbn\":\"bcd\",\r\n"
	  		+ "\"aisle\":\"227826391\",\r\n"
	  		+ "\"author\":\"John foe\"\r\n"
	  		+ "}";
  }
  
  
  public static String getResPonse()
  {
	  String responsedata="{\r\n"
	  		+ "\r\n"
	  		+ "\"dashboard\": {\r\n"
	  		+ "\r\n"
	  		+ "\"purchaseAmount\": 910,\r\n"
	  		+ "\r\n"
	  		+ "\"website\": \"rahulshettyacademy.com\"\r\n"
	  		+ "\r\n"
	  		+ "},\r\n"
	  		+ "\r\n"
	  		+ "\"courses\": [\r\n"
	  		+ "\r\n"
	  		+ "{\r\n"
	  		+ "\r\n"
	  		+ "\"title\": \"Selenium Python\",\r\n"
	  		+ "\r\n"
	  		+ "\"price\": 50,\r\n"
	  		+ "\r\n"
	  		+ "\"copies\": 6\r\n"
	  		+ "\r\n"
	  		+ "},\r\n"
	  		+ "\r\n"
	  		+ "{\r\n"
	  		+ "\r\n"
	  		+ "\"title\": \"Cypress\",\r\n"
	  		+ "\r\n"
	  		+ "\"price\": 40,\r\n"
	  		+ "\r\n"
	  		+ "\"copies\": 4\r\n"
	  		+ "\r\n"
	  		+ "},\r\n"
	  		+ "\r\n"
	  		+ "{\r\n"
	  		+ "\r\n"
	  		+ "\"title\": \"RPA\",\r\n"
	  		+ "\r\n"
	  		+ "\"price\": 45,\r\n"
	  		+ "\r\n"
	  		+ "\"copies\": 10\r\n"
	  		+ "\r\n"
	  		+ "}\r\n"
	  		+ "\r\n"
	  		+ "]\r\n"
	  		+ "\r\n"
	  		+ "}\r\n"
	  		+ "\r\n"
	  		+ "";
	  
	  return responsedata;
  }
  
  public static String returnData()
  {
	  String responseCheck="{\r\n"
	  		+ "    \"meta\": {\r\n"
	  		+ "         \"error_type\": \"OAuthException\",\r\n"
	  		+ "         \"code\": 400,\r\n"
	  		+ "         \"error_message\": \"...\"\r\n"
	  		+ "    }\r\n"
	  		+ "    \r\n"
	  		+ "   ,\r\n"
	  		+ "    \"pagination\": {\r\n"
	  		+ "         \"next_url\": \"...\",\r\n"
	  		+ "         \"next_max_id\": \"13872296\"\r\n"
	  		+ "    }\r\n"
	  		+ "}";
	  
	  return responseCheck;
	  
	  
  }
  
  public static String addPayLoad(String isbn,String aisle,String poetName)
  {
	 String responseData="{\r\n"
	 		+ "\"name\":\"Learn Appium Automation with Java\",\r\n"
	 		+ "\"isbn\":\""+isbn+"\",\r\n"
	 		+ "\"aisle\":\""+aisle+"\",\r\n"
	 		+ "\"author\":\""+poetName+"\"\r\n"
	 		+ "}" ;
	 
	 System.out.println("responseData---->"+responseData);
	  return responseData;
  }
}
