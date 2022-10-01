package seleniumexamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmApplication {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Ashritha\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("My Info")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("firstName")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE),"Ashritha");
		Thread.sleep(1000);
		driver.findElement(By.name("middleName")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE),"Y");
		Thread.sleep(1000);
		driver.findElement(By.name("lastName")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE),"Bhat");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//form/div/div[2]/div/div/div[2]/input")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE),"Ashri");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//form/div[2]/div/div/div/div/input")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE),"1000");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//form/div[2]/div/div[2]/div/div/input")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE),"Id");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//form/div[2]/div[2]/div/div/div[2]/input")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE),"12345");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//form/div[2]/div[2]/div[2]/div/div[2]/div/div/input")).sendKeys("2025-04-16");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//form/div[2]/div[3]/div/div/div[2]/input")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE),"SSN123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//form/div[2]/div[3]/div[2]/div/div[2]/input")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE),"SIN123");
		driver.findElement(By.xpath("//i[@class=\"oxd-icon bi-caret-down-fill oxd-select-text--arrow\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(text(),\"Indian\")]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//form/div[3]/div/div[2]/div/div/div/div/div/i[@class=\"oxd-icon bi-caret-down-fill oxd-select-text--arrow\"]")).click();
		driver.findElement(By.xpath("//*[contains(text(),\"Single\")]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//form/div[3]/div[2]/div/div/div[2]/div/div/input")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE),"2001-04-16");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/label[1]/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}
}
