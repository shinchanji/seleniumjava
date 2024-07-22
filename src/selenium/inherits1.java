package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class inherits1 {
	WebDriver driver = new ChromeDriver();
	String driverPath = "C:\\Users\\Victus\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
	void navigate() 
	{
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}
	void login(String uname, String pass) throws InterruptedException {
		Thread.sleep(1000);
		WebElement un=driver.findElement(By.xpath("//input[@name=\"username\"]"));
		un.sendKeys(uname);
		WebElement ps=driver.findElement(By.xpath("//input[@placeholder='Password']"));
        ps.sendKeys(pass);

	}
	
	void login(){
	//	WebElement log=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
	//	log.click();
		// it is an type of method
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}

}
