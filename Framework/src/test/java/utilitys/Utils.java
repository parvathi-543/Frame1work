package utilitys;


import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Utils {
	static String projectpath;
	static XSSFWorkbook wb;
	static XSSFSheet sheet;

	public static void main(String[] args) {
		getRowCount();
		getColCount();
		getColCountNumber();
	}
	public static void getRowCount() {


		try {
			projectpath=System.getProperty("user.dir");
			wb = new XSSFWorkbook(projectpath+"\\Excel sheet\\data.xlsx.xlsx");
			sheet = wb.getSheet("Sheet1"); 
			int rownum=sheet.getPhysicalNumberOfRows();
			System.out.println("no of rows:"+rownum);
		} 
		catch (IOException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}   

	}

	public static void getColCount() {

		try {
			projectpath=System.getProperty("user.dir");
			wb = new XSSFWorkbook(projectpath+"\\Excel sheet\\data.xlsx.xlsx");
			sheet = wb.getSheet("Sheet1"); 
			String celldata=sheet.getRow(0).getCell(0).getStringCellValue();
			System.out.println("no of columns1:"+celldata);
			String celldata2=sheet.getRow(0).getCell(1).getStringCellValue();
			System.out.println("no of columns2:"+celldata2);
		} 
		catch (IOException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}}
		public static void getColCountNumber() {

			try {
				projectpath=System.getProperty("user.dir");
				wb = new XSSFWorkbook(projectpath+"\\Excel sheet\\data.xlsx.xlsx");
				sheet = wb.getSheet("Sheet1"); 
				double celldata=sheet.getRow(1).getCell(2).getNumericCellValue();
				System.out.println("no of columns1:"+celldata);
				
			} 
			catch (IOException e) {
				System.out.println(e.getMessage());
				System.out.println(e.getCause());
				e.printStackTrace();
			}
	}
}

