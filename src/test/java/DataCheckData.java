import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class DataCheckData {
	@Test
	void set() {
		String responsedta = PayLoad.getResPonse();
		System.out.println("responsedta----->" + responsedta);
		JsonPath js = new JsonPath(responsedta);
		int size = js.getInt("courses.size()");
		System.out.println("Size----->" + size);
		for (int i = 0; i < size; i++) {
			if (js.getString("courses[" + i + "].title").equalsIgnoreCase("RPA")) {
				System.out.println("Price Is------->" + js.getInt("courses[" + i + "].price"));
				break;
			}
		}

	}

}
