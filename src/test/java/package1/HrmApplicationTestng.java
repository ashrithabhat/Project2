package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HrmApplicationTestng {
	private static WebDriver driver = null;
	@Test
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Ashritha\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}
	@Test
	public void logout(){

		driver.findElement(By.xpath("//span[@class=\"oxd-userdropdown-tab\"]")).click();
		driver.findElement(By.xpath("//li[4]/a[@class=\"oxd-userdropdown-link\"]")).click();
		driver.quit();
	}
}
