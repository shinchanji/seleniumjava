package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Victus\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
		WebElement un=driver.findElement(By.xpath("//input[@placeholder=\"Username\"]"));
		un.sendKeys("Admin");
		WebElement pw=driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
		pw.sendKeys("admin123");
		
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src1=ts.getScreenshotAs(OutputType.FILE);
		File dest1=new File("D:\\software testing course\\ss1.png");
		FileUtils.copyFile(src1, dest1);
		
		
		WebElement log=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		log.click();			
		Thread.sleep(2000);
		TakesScreenshot ts1=(TakesScreenshot)driver;
		File src2=ts1.getScreenshotAs(OutputType.FILE);
		File dest2=new File("D:\\software testing course\\ss2.png");
		FileUtils.copyFile(src2, dest2);
	}

}
