package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Ashritha\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		/*driver.findElement(By.name("firstname")).sendKeys("John");
		driver.findElement(By.name("lastname")).sendKeys("Disilva");
		driver.findElement(By.name("reg_email__")).sendKeys("abc123@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("abc123@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("@hij567");
		driver.findElement(By.name("birthday_day")).sendKeys("16");
		driver.findElement(By.name("birthday_month")).sendKeys("April");
		driver.findElement(By.name("birthday_year")).sendKeys("2001");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/label")).click();
		driver.findElement(By.name("websubmit")).click();*/
		
		driver.findElement(By.cssSelector("input#email")).sendKeys("Ash@gmail.com");
		driver.findElement(By.cssSelector("input#pass")).sendKeys("ash@123");
		driver.findElement(By.cssSelector("button[name=\"login\"]")).click();
	}
}
