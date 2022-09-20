package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Ashritha\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/EI13049/Desktop/Training/Project1.html");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[1]")).sendKeys("Hello");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[2]")).sendKeys("World");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[3]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[1]")).click();
	}

}
