package seleniumexamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookApplicatioExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Ashritha\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("a[rel=\"async\"]")).click();
		driver.findElement(By.cssSelector("input[name=\"firstname\"]")).sendKeys("Ashritha");
		driver.findElement(By.cssSelector("input[name=\"lastname\"]")).sendKeys("Bhat");
		driver.findElement(By.cssSelector("input[name=\"reg_email__\"]")).sendKeys("ashritha@gmail.com");
		driver.findElement(By.cssSelector("input[name=\"reg_email_confirmation__\"]")).sendKeys("ashritha@gmail.com");
		driver.findElement(By.cssSelector("input#password_step_input")).sendKeys("Ashritha123");
		driver.findElement(By.cssSelector("select#day")).sendKeys("10");
		driver.findElement(By.cssSelector("select#month")).sendKeys("October");
		driver.findElement(By.cssSelector("select#year")).sendKeys("2000");
		driver.findElement(By.cssSelector("input[name=\"sex\"]")).click();
		driver.findElement(By.cssSelector("button._6j")).click();	
	}
}
