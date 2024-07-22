package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll
{ 
	

	
	public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\Victus\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://topsoftwarecourses.com/");
		Thread.sleep(2000);
		WebElement apply = driver.findElement(By.xpath("//button[@class=\"navbar-button btnOpenForm\"]")); 
		apply.click();
		WebElement contact = driver.findElement(By.xpath("//input[@class=\"drop-li\"]"));
		Thread.sleep(3000);
		WebElement fom = driver.findElement(By.xpath(""));
		
	}
}
