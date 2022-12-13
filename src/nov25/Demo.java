package nov25;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo {

	public static void main(String[] args)throws Throwable {
		FileInputStream fi = new FileInputStream("D:/Book.xlsx");
		XSSFWorkbook wb = new  XSSFWorkbook(fi);
		XSSFSheet ws= wb.getSheet("EmpData");
		int rc = ws.getLastRowNum();
		System.out.println(rc);
		for(int i=1;i<=rc;i++)
		{
			String fname = ws.getRow(i).getCell(0).getStringCellValue();
			String mname = ws.getRow(i).getCell(1).getStringCellValue();
			String lname = ws.getRow(i).getCell(2).getStringCellValue();
			if(wb.getSheet("EmpData").getRow(i).getCell(3).getCellType()==Cell.CELL_TYPE_NUMERIC)
			{
				int celldata =(int) wb.getSheet("EmpData").getRow(i).getCell(3).getNumericCellValue();
				String empid =String.valueOf(celldata);
				System.out.println(fname+"   "+mname+"    "+lname+"    "+empid);
			}
		}
	}


	}


