package Aug_2019;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.silentOutput", "true");
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\Chrome 80.3987.106\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");

		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		// Select select = new Select(day);
		// select.selectByVisibleText("24");

//		selectValueFromDropDown(day, "2");
//		selectValueFromDropDown(month, "Mar");
//		selectValueFromDropDown(year, "1995");	
		getAllOptions(month);
	
		
//		Select select = new Select(day);
//		int daycount=dayOptions.getOptions().size();
//		System.out.println(daycount);
		
//		List<WebElement> daysOptions=select.getOptions();
//		int daycount =daysOptions.size();
//		for(int i=0;i<daycount;i++) {
//		String op=	daysOptions.get(i).getText();
//		System.out.println(op);
//		}
//		
		
		driver.close();
	}

	public static void selectValueFromDropDown(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}
	public static void getAllOptions(WebElement element) {
		
		
	Select select = new Select(element);
	List<WebElement> daysOptions = select.getOptions();
	int daysCount=daysOptions.size();
	for(int i=0;i<daysCount;i++) {
		String g=daysOptions.get(i).getText();
		System.out.println(g);
	}
	
	
	
	
	
	
	}

}
