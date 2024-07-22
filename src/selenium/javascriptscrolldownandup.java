package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptscrolldownandup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Victus\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
driver.get("https://toolsqa.com/selenium-training?q=headers");
			Thread.sleep(2000);
WebElement country=driver.findElement(By.xpath("//select[@id='country']"));
            Thread.sleep(1000);
country.click();
			JavascriptExecutor js= (JavascriptExecutor)driver;
WebElement country1=driver.findElement(By.xpath("//option[@value='26']"));
Thread.sleep(2000);
js.executeScript("arguments[0].scrollIntoView(True)", country);
			country1.click();
			
			
			

	}

}
