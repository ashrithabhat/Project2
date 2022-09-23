package seleniumexamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class HRMForgotPwd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Ashritha\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//div[@class='orangehrm-login-forgot']/p")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button")).click(); //presses "cancel"
		//driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		String expectedResult = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		String actalResult = driver.getCurrentUrl();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actalResult,expectedResult);
		System.out.println(actalResult);
		System.out.println(expectedResult);

	}

}
