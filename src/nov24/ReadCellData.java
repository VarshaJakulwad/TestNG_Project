package nov24;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadCellData {

	public static void main(String[] args)throws Throwable {
		//read path of excel file
				FileInputStream fi = new FileInputStream("D://Book.xlsx");
				//get wb from file
				XSSFWorkbook wb = new XSSFWorkbook(fi);
				//get sheet from wb
				XSSFSheet ws = wb.getSheetAt(0);
				//get second row
				XSSFRow row =ws.getRow(5);
				//get first cell from row
				XSSFCell c1 =row.getCell(0);
				XSSFCell c2 =row.getCell(1);
				XSSFCell c3 =row.getCell(2);
				String fname = c1.getStringCellValue();
				String mname = c2.getStringCellValue();
				String lname =c3.getStringCellValue();
				System.out.println(fname+"      "+mname+"     "+lname);
				fi.close();
				wb.close();

	}

}
