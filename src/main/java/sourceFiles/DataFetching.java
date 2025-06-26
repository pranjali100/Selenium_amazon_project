package sourceFiles;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataFetching {
	public static String un1;
	public static String pw1;
	public static String un2;
	public static String pw2;

	public void dataFetch() throws EncryptedDocumentException, IOException {
		FileInputStream f1 = new FileInputStream(	"D:\\GitProjectsLava\\AmazonAutomation\\ExcelSheet\\exceldata.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		Sheet sheet = w1.getSheet("data");
        DataFormatter formatter = new DataFormatter();
        
        un1 = formatter.formatCellValue(sheet.getRow(0).getCell(0));
		pw1 = w1.getSheet("data").getRow(0).getCell(1).getStringCellValue();

		/*
		 * un2 = formatter.formatCellValue(sheet.getRow(1).getCell(0)); pw2 =
		 * w1.getSheet("data").getRow(1).getCell(1).getStringCellValue();
		 */
		// String un3= w1.getSheet("data").getRow(2).getCell(0).getStringCellValue();
		// String pw3= w1.getSheet("data").getRow(2).getCell(1).getStringCellValue();
		 w1.close();
	       f1.close();
	}
}