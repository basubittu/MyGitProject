import org.testng.annotations.*;
import org.testng.annotations.DataProvider;

public class TestNgDataProvider {
	@Test(dataProvider = "DataSet")
	void checkData(int age) {
		if (age >= 18) {
			System.out.println(age + "Adult");
		}

		else {
			System.out.println(age + "Not an Adult");
		}
	}

	@DataProvider(name = "DataSet")

	public Object[][] returnData() {

		return new Object[][] { { 18 }, { 24 }, { 15 } };

	}

}
