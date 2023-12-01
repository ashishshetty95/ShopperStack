package SeleniumGrid;

import org.testng.annotations.Test;

public class CrossBrowser extends BaseClass {
	@Test
	public void crossBrowserTest() {
		driver.get("https://www.amazon.in");
	}
}
