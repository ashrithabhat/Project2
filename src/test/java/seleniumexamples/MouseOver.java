package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String baseUrl;
		System.setProperty("webdriver.chrome.driver", "C:\\Ashritha\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.aptransport.org/");
		Actions mouse=new Actions(driver);
		driver.manage().window().maximize();
		mouse.moveToElement(driver.findElement(By.linkText("REGISTRATION"))).build().perform();
		Thread.sleep(1000);
	}

}
