package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Ashritha\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569891%7Cb%7Cfacebook%20signin%7C&placement=&creative=589460569891&keyword=facebook%20signin&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-3821998899%26loc_physical_ms%3D9050529%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjwpqCZBhAbEiwAa7pXeZ3_BlXQQE5YRcd7j5dIYTsE8pycH97wWGYhEr1cZq6ZKRrIXOLH1BoCK2oQAvD_BwE");
		Thread.sleep(1000);
		driver.findElement(By.name("firstname")).sendKeys("John");
		driver.findElement(By.name("lastname")).sendKeys("Disilva");
		driver.findElement(By.name("reg_email__")).sendKeys("abc123@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("abc123@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("@hij567");
		driver.findElement(By.name("birthday_day")).sendKeys("16");
		driver.findElement(By.name("birthday_month")).sendKeys("April");
		driver.findElement(By.name("birthday_year")).sendKeys("2001");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/label")).click();
		driver.findElement(By.name("websubmit")).click();
	}
}
