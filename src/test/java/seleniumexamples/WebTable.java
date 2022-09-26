package seleniumexamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Ashritha\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);	
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/EI13049/Downloads/Project1.html");
		Thread.sleep(500);
		//driver.findElement(By.xpath("//table/tbody/tr[5]/td[1]/input")).click();
		//System.out.println(driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]")).getText());
		
		driver.findElement(By.cssSelector("css=input[name=\"field1\"]")).sendKeys("As");
		
	}
}
