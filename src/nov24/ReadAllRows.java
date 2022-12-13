package nov24;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAllRows {

	public static void main(String[] args)throws Throwable {
		FileInputStream fi = new FileInputStream("D:/Book.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws =wb.getSheet("EmpData");
		int rc = ws.getLastRowNum();
		for(int i=1;i<=rc; i++)
		{
			String fname =ws.getRow(i).getCell(0).getStringCellValue();
			String mname =ws.getRow(i).getCell(1).getStringCellValue();
			String lname = ws.getRow(i).getCell(2).getStringCellValue();
			//write some text in results cell
			ws.getRow(i).createCell(3).setCellValue("I will not practise");
			System.out.println(fname+"    "+mname+"    "+lname);
		}
		fi.close();
		FileOutputStream fo = new FileOutputStream("D:/EvengResults.xlsx");
		wb.write(fo);
		fo.close();
		wb.close();


	}

}
