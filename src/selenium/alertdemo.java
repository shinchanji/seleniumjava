package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class alertdemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Victus\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://demo.automationtesting.in/Alerts.html");
			//Thread.sleep(2000);
WebElement atok=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
atok.click();
Thread.sleep(2000);
Alert a = driver.switchTo().alert();
a.accept();
			Thread.sleep(2000);
		
		WebElement okcancel=driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']"));
		okcancel.click();
			WebElement okcan=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	okcan.click();
	 driver.switchTo().alert();
			a.dismiss();
			
			WebElement textbox=driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']"));
			textbox.click();
			Thread.sleep(2000);
			WebElement text=driver.findElement(By.xpath("//button[@class='btn btn-info']"));
			text.click();
			 driver.switchTo().alert();
			a.sendKeys("Jack");
//			Thread.sleep(2000);
			
			a.accept();

	
	}  

}
