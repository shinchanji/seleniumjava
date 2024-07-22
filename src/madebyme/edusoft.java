package madebyme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class edusoft {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Victus\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://topsoftwarecourses.com/");
			Thread.sleep(2000);
			WebElement rc=driver.findElement(By.xpath("//a[normalize-space()='Our courses']"));
			Actions a=new Actions(driver);
			Thread.sleep(2000);
			a.moveToElement(rc).perform();
//WebElement ds=driver.findElement(By.xpath("//a[@href='/Data-science.html']"));
//ds.click();
WebElement da=driver.findElement(By.xpath("//a[normalize-space()='Data analyst']"));
da.click();

	}

}
