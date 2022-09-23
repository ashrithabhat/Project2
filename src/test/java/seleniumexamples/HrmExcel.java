package seleniumexamples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HrmExcel {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		String filePath="C:\\Users\\EI13049\\Downloads\\HRM.xlsx";
		//String fileName="HRM.xlsx";
		String sheetName="Sheet1";
		
		//File file = new File(filePath+"\\"+fileName);
		FileInputStream inputStream = new FileInputStream(filePath);
		//@SuppressWarnings("resource")
		Workbook workBook = new XSSFWorkbook(inputStream);
		Sheet sheet = workBook.getSheet(sheetName);
		int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
	    System.out.println("Row count " +rowCount);
	    String userName,passWord;
	    Row row = sheet.getRow(1);
	    userName = row.getCell(0).getStringCellValue();
	    passWord = row.getCell(1).getStringCellValue();
	    System.out.println(userName);
	    System.setProperty("webdriver.chrome.driver", "C:\\Ashritha\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(passWord);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}

}
