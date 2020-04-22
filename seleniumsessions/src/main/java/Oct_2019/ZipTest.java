package Oct_2019;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZipTest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\Chrome 76\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://pro.ziperp.net/");
		driver.manage().window().maximize();
		driver.findElement(By.id("EnterpriseId")).sendKeys("maco");
		driver.findElement(By.id("UserId")).sendKeys("Ziperpdemo");
		driver.findElement(By.id("Password")).sendKeys("123");
		driver.findElement(By.xpath("//*[@id=\"lnkLogin\"]")).click();
		driver.findElement(By.id("txtCompanySearch")).sendKeys("demo company");
		driver.findElement(By.xpath("//*[@id=\"TenantTBL\"]/tbody/tr[47]/td/label")).click();
		driver.findElement(By.xpath("//*[@id=\"hidemenu4\"]/section/a")).click();
      //driver.findElement(By.xpath("//*[@id=\"SalesMB\"]/a")).click();
		driver.findElement(By.xpath("//a/span[text()='Sales']")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Invoice")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"gridview-1031-record-ext-record-1\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"ext-gen1018\"]/div[1]/div[1]/section/div/div[1]/div[2]/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Edit")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Save")).click();
		Thread.sleep(5000);
		new WebDriverWait(driver, 10)
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Yes']/parent::button")))
				.click();
		// Alert alert=driver.switchTo().alert();
		// alert.accept();

		// driver.findElement(By.xpath("//*[@id=\"gridview-1031-record-ext-record-1\"]")).click();

	}

}
