package MouseHoverConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\Chrome 74\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://mrbool.com/");
		WebElement MyMenu = driver.findElement(By.className("menulink"));
		Actions action = new Actions(driver);
		action.moveToElement(MyMenu).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.linkText("COURSES")).click();

	}

}
