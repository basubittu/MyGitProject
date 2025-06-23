import org.testng.annotations.*;
public class DataProviderTahat 
{
@Test
  void  setData()
  {
	  String currentDirectory=System.getProperty("user.dir");
	  System.out.println("Path"+currentDirectory+"\\src"+"\\test"+"\\java");
  }
}
