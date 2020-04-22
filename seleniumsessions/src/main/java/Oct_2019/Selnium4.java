package Oct_2019;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selnium4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\Chrome 76\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.com");
		// 1.Get Total Links Count
		List<WebElement> list=driver.findElements(By.tagName("a"));
		int count=list.size();
		System.out.println(count);
		
		//2. Get Text of Each Links
		for(int i=0;i<count;i++) {
		String listnames=list.get(i).getText();
		System.out.println(i+"---->"+listnames);
		}
		
	}

}
