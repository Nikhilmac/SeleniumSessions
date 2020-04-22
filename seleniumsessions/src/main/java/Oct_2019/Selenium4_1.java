/**
 * 1.DropDown Handling Without Select Class (Ans:using xpath)
 * 2.Select particular element in dropdown and break the loop
 */
package Oct_2019;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium4_1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\Chrome 76\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:/fb.com");
		driver.manage().window().maximize();
		List<WebElement> dayOptions=driver.findElements(By.xpath("//select[@id=\"day\"]/option"));
		int dayCount=dayOptions.size();
		System.out.println(dayCount);
		for(int i=0;i<dayCount;i++) {
			String dayval = dayOptions.get(i).getText();
			System.out.println(dayval);
			if(dayval.equals("19")) {
				dayOptions.get(i).click();
				break;
			}
			
		}
		
		
	}

}
