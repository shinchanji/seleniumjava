package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class movetoelement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Victus\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://uncodemy.com/");
		Thread.sleep(2000);
		WebElement ct= driver.findElement(By.xpath("//span[@id=\"categoriesBtn\"]"));
		Actions a = new Actions(driver);
		a.moveToElement(ct).perform();
		Thread.sleep(2000);
		
				
		
	}

}
