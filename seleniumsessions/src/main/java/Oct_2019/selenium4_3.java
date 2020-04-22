/**
 * Verify the Element is Present or Not
 */
package Oct_2019;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class selenium4_3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\Chrome 76\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:/fb.com");
		//1.We use here findelements because by elements only we find size 
		List<WebElement> list = driver.findElements(By.xpath("//*[@name=\'websubmit\']"));
		int count =	list.size();
		System.out.println(list);
		System.out.println(count);
		if(count>0) {
			System.out.println("Pass");
		}else
		{
			System.out.println("Fail");
		}	
		boolean flag= driver.findElement(By.xpath("//*[@name=\'websubmit\']")).isDisplayed();
		if(flag)
		{
			System.out.println("Pass");
			}
		else
		{
			System.out.println("Fail");
		}
		}
	
}
