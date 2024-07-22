package madebyme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fblogin {

	public static void main(String[] args) throws InterruptedException {

		    System.setProperty("webdriver.chrome.driver","C:\\Users\\Victus\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			Thread.sleep(2000);
			
			WebElement log = driver.findElement(By.xpath("//input[@id=\"email\"]"));
			log.sendKeys("8755838077");
			WebElement pw = driver.findElement(By.xpath("//input[@type=\"password\"]"));
			pw.sendKeys("iamdevil");
			WebElement login = driver.findElement(By.xpath("//Button[@type=\"submit\"]"));
			login.click();
			
			
			
			

	}

}
