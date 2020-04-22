package MouseHoverConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\Chrome 74\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		WebElement Source = driver.findElement(By.id("draggable"));
		WebElement destination = driver.findElement(By.id("droppable"));
		
		performDragAndDrop(Source,destination,driver);
		
		// Actions action = new Actions(driver);
		// action.clickAndHold(Source)
		// .moveToElement(destination)
		// .release()
		// .build()
		// .perform();

		// action.dragAndDrop(Source, destination).build().perform();

	}

	public static void performDragAndDrop(WebElement source, WebElement target, WebDriver driver) {

		Actions action = new Actions(driver);
		action.clickAndHold(source).moveToElement(target).release().build().perform();

	}

}
