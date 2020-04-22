package Oct_2019;
/**
 * Selenium 5 is for Navigation of
 * Back and Forward Buttons Simulation Using Selenium
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleinum_5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\Chrome 76\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		String aa = driver.getTitle();
		System.out.println(aa);
		driver.navigate().to("https://fb.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
 //When we Use Refresh all the elements in the page refreshed so we should create webelements once again
	}
	

}
