package seleniumexamples;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ReadDataFromExcel {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String filePath="C:\\Users\\EI13049\\Downloads";
		String fileName="HRM.xlsx";
		String sheetName="Sheet1";
		File file = new File(filePath+"\\"+fileName);
		FileInputStream inputStream = new FileInputStream(file);
		Workbook workBook = null;
		String fileExtensionName = fileName.substring(fileName.indexOf("."));
		if(fileExtensionName.equals(".xlsx"))
		{
			workBook = new XSSFWorkbook(inputStream);
		}
		else if(fileExtensionName.equals(".xls"))
		{
	    	workBook = new XSSFWorkbook(inputStream);
	    }
		org.apache.poi.ss.usermodel.Sheet sheet = workBook.getSheet(sheetName);
		int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
	    System.out.println("Row count " +rowCount);
	    for (int i = 0; i < rowCount+1; i++) 
	    {
	        Row row = sheet.getRow(i);
	        for (int j = 0; j < row.getLastCellNum(); j++)
	        {
	        	System.out.println(row.getCell(j).getStringCellValue());
	        }
	    }
	}
}
