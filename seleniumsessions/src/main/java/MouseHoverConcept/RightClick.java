package MouseHoverConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RightClick {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\Chrome 74\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://mrbool.com/");
	}

}
