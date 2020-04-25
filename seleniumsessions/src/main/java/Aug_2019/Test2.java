//package Aug_2019;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import junit.framework.Assert;
//
//public class Test2 {
//	WebDriver driver;
//	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.silentOutput", "true");
//		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\Chrome 80.3987.106\\chromedriver.exe");	
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://facebook.com");
//	   String a=driver.getCurrentUrl();
//	   Assert.assertEquals(a, "www.facebook.com");
//	   System.out.println(a);
//
//
//		// Closing driver
//		//driver.quit();
//
//	}
//}