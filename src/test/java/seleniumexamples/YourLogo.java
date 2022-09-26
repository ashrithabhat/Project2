package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YourLogo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Ashritha\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//To search
		driver.findElement(By.id("search_query_top")).sendKeys("Dress");
		driver.findElement(By.name("submit_search")).click();
		Thread.sleep(1000);
		
		//To sign-in
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(1000);
		
		//To create new account
		driver.findElement(By.id("email_create")).sendKeys("ashritha123@gmail.com");
		driver.findElement(By.name("SubmitCreate")).click();
		Thread.sleep(1000);
		
		//Already has an account
		//driver.findElement(By.id("email")).sendKeys("ashritha@gmail.com");
		//driver.findElement(By.id("passwd")).sendKeys("Admin@123");
		//driver.findElement(By.id("SubmitLogin")).click();
		
		//To check cart
		driver.findElement(By.xpath("//a[@title=\"View my shopping cart\"]")).click();
	}
}
