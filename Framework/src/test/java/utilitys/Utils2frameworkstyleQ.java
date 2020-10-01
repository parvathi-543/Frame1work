package utilitys;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Utils2frameworkstyleQ {
	static String projectpath;
	static XSSFWorkbook wb;
	static XSSFSheet sheet;
	
	//constructor
	public Utils2frameworkstyleQ (String excelpath,String sheetname)  {
		try {
			projectpath=System.getProperty("user.dir");
			wb = new XSSFWorkbook(excelpath);
			sheet = wb.getSheet(sheetname); 
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}}

	//methods

	public static int getRowCount()  {

		int rownum=sheet.getPhysicalNumberOfRows();
		System.out.println("no of rows:"+rownum);
		return rownum;   
	}
	public static  int getcolCount()  {

		int colnum=sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("no of coumns:"+colnum);
		
		return colnum;
		  
	}
	public static String getColCount(int rownum,int colnum) {
		String celldata;
		 celldata=sheet.getRow(rownum).getCell(colnum).getStringCellValue();
		//System.out.println("no of columns1:"+celldata);
		return celldata;
	}
	public static void getColCountNumber(int rownum,int colnum) {

		double celldata=sheet.getRow(rownum).getCell(colnum).getNumericCellValue();
		//System.out.println("no of columns:"+celldata);
	}
}