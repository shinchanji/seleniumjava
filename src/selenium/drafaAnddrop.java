package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drafaAnddrop {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Victus\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#google_vignette");
		driver.manage().window().fullscreen();
		Thread.sleep(5000);
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frame);
		WebElement img1=driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		Thread.sleep(2000);
	WebElement img2= driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
	    WebElement img3= driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		WebElement img4= driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
        WebElement trace=driver.findElement(By.xpath("//div[@id='trash']"));

		Actions a=new Actions(driver);
		        a.dragAndDrop(img1, trace);
		        

	}

}
