package utilitys;



public class utilsQ {
	
	public static void main(String[] args) {
		
	
	String	projectpath=System.getProperty("user.dir");
	Utils2frameworkstyleQ excel=new Utils2frameworkstyleQ(projectpath+"\\Excel sheet\\data.xlsx","Sheet1");
	excel.getRowCount();//rowcount
	excel.getColCount(1,0);//username
	excel.getColCount(1,1);//password
	excel.getColCountNumber(1,2);//empid
	excel.getcolCount();//columncount
}
}