package loginTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginCheck {
	
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\xampp\\htdocs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login/login/");
		driver.findElement(By.id("username")).click();
	    driver.findElement(By.id("username")).clear();
	    driver.findElement(By.id("username")).sendKeys("ammar");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("bota1");
	    driver.findElement(By.xpath("//input[@value='Log on']")).click();
	    try {
	        WebDriverWait wait = new WebDriverWait(driver, 2);
	        wait.until(ExpectedConditions.alertIsPresent());
	        Alert alert = driver.switchTo().alert();
	        alert.accept();
	    } catch (Exception e) {
	        //exception handling
	    }
	    driver.findElement(By.xpath("//a[@href='#']")).click();

	}
}
