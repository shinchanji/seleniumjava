package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\Victus\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	driver.get("https://www.instagram.com/accounts/login/");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	driver.manage().window().fullscreen();
	Thread.sleep(2000);
	driver.manage().window().minimize();
	//driver.quit();
	}

}

