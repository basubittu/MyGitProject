import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import static io.restassured.RestAssured.*;
import org.testng.Assert;

public class ComplexDataStructure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String responseDta = PayLoad.getResPonse();
		// System.out.println("ResponseData------>"+responseDta);
		JsonPath js = new JsonPath(responseDta);
		System.out.println("Website---->" + js.getString("dashboard.website"));
		System.out.println("PurchaseAmount---->" + js.getString("dashboard.purchaseAmount"));
		int purchaseAmount = Integer.parseInt(js.getString("dashboard.purchaseAmount"));
		System.out.println("coursesSize---->" + js.getInt("courses.size()"));
		System.out.println("The first title is----->" + js.getString("courses[0].title"));
		int FirstAmount = js.getInt("courses[0].price");
		int Firstcopies = js.getInt("courses[0].copies");
		System.out.println("FirstAmount---->" + FirstAmount);
		System.out.println("Firstcopies---->" + Firstcopies);
		int firstTotalAmount = (FirstAmount * Firstcopies);
		int secondAmound = js.getInt("courses[1].price");
		int secondcopies = js.getInt("courses[1].copies");
		System.out.println("SecondAmount---->" + secondAmound);
		System.out.println("secondcopies---->" + secondcopies);
		int secondTotalAmount = (secondAmound * secondcopies);
		int thirdAmount = js.getInt("courses[2].price");
		int thirdCopies = js.getInt("courses[2].copies");
		System.out.println("thirdAmount---->" + thirdAmount);
		System.out.println("thirdCopies----->" + thirdCopies);
		int thirdTotalAmount = (thirdAmount * thirdCopies);
		int totalAmount = (firstTotalAmount + secondTotalAmount + thirdTotalAmount);
		System.out.println("totalAmount----->" + totalAmount);
		Assert.assertEquals(totalAmount, purchaseAmount);
		String responseDaaCheck = PayLoad.returnData();
		System.out.println("responseDaaCheck---->" + responseDaaCheck);
		JsonPath json = new JsonPath(responseDaaCheck);
		System.out.println("1stData is ---->" + json.getString("meta.error_type"));
		System.out.println("2ndData is ---->" + json.getString("meta.code"));
		System.out.println("2ndData is ---->" + json.getString("pagination.next_max_id"));
		System.out.println("");
		
		
		

	}

}
