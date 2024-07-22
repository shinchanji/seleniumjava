package madebyme;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class uncodemy {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Victus\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://uncodemy.com/");
Thread.sleep(2000);
			driver.manage().window().maximize();
			
			WebElement ct=driver.findElement(By.xpath("//span[@id=\"categoriesBtn\"]"));
			//Thread.sleep(2000);
			Actions a= new Actions(driver);
Thread.sleep(2000);
			a.moveToElement(ct).perform();
 Thread.sleep(1000);
			
			WebElement st=driver.findElement(By.xpath("//body/nav[@id='main-nav']/div[@class='nav-container']/div[@class='categories']/nav[@class='navr']/menu[@id='categories-menu']/menuitem[@label='drop']/menu[@class='hii']/menuitem[3]/a[1]"));
a.moveToElement(st).perform();
		   
			WebElement st2=driver.findElement(By.xpath("//a[@class='has'][normalize-space()='Software Testing']"));
st2.click();
			WebElement mt=driver.findElement(By.xpath("//a[normalize-space()='Manual Testing']"));
mt.click();
			WebElement at=driver.findElement(By.xpath("//a[normalize-space()='Automation Testing']"));
at.click();
			WebElement ISTQB=driver.findElement(By.xpath("//a[normalize-space()='ISTQB Training']"));
ISTQB.click();
			WebElement mts=driver.findElement(By.xpath("//a[normalize-space()='Manual + Selenium']"));
mts.click();
			WebElement fee=driver.findElement(By.xpath("//a[@class='pam cls']"));
fee.click();
			WebElement course=driver.findElement(By.xpath("//select[@id='course-select']"));
course.click();
            WebElement mail=driver.findElement(By.xpath("//a[@class='mail']"));
mail.click();            
			
			

	}

}
