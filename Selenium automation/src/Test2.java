import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test2 {
	private static XSSFWorkbook excelWBook;
	private static XSSFSheet ExcelWSheet;

	public static void exceltest(String Path,String SheetName) {
		String path="C:/Users/Dell/Desktop/Newfolder";
		try {
			FileInputStream fis=new FileInputStream(path);
			excelWBook = new XSSFWorkbook(fis);
		
			ExcelWSheet = excelWBook.getSheet(SheetName);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	public static String getcelldata(int rownum,int colnum) {
		try {
		XSSFCell Cells = ExcelWSheet.getRow(rownum).getCell(colnum);
		String Celldata=Cells.getStringCellValue();
		return Celldata ;
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
			}
	}
	
	public static void setcelldata(String Result, int Rownum, int Colnum) throws Exception {
		
		
		
	}
	
	
}

