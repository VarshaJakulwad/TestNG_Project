package nov25;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FormatCell {

	public static void main(String[] args)throws Throwable {
		FileInputStream fi = new FileInputStream("C:/Book.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws =wb.getSheet("EmpData");
		int rc = ws.getLastRowNum();
		System.out.println("No of rows are::"+rc);
		for(int i=1;i<=rc;i++)
		{
			String fname = ws.getRow(i).getCell(0).getStringCellValue();
			String mname = ws.getRow(i).getCell(1).getStringCellValue();
			String lname = ws.getRow(i).getCell(2).getStringCellValue();
			//int Empid =(int) ws.getRow(i).getCell(3).getNumericCellValue();
			System.out.println(fname+"   "+mname+"     "+lname);
			//ws.getRow(i).createCell(3).setCellValue("Pass");
			ws.getRow(i).createCell(3).setCellValue("Fail");
			XSSFCellStyle style =wb.createCellStyle();
			XSSFFont font = wb.createFont();
			//font.setColor(IndexedColors.GREEN.getIndex());
			font.setColor(IndexedColors.RED.getIndex());
			font.setBold(true);
			font.setBoldweight(XSSFFont.BOLDWEIGHT_BOLD);
			style.setFont(font);
			ws.getRow(i).getCell(3).setCellStyle(style);
			
			
		}
		fi.close();
		FileOutputStream fo= new FileOutputStream("D://EvengResults.xlsx");
		wb.write(fo);
		fo.close();
		wb.close();

	}


		

	}


