package genric;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class genric_fetch_excel {
	public static String  getdata(int row, int coloumn, String cell) 
	{
		String val=" ";
		try{
			FileInputStream fis= new FileInputStream("./Excel/Adv1.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(cell);
			Row r = sh.getRow(row);
			Cell c = r.getCell(coloumn);
			val=c.getStringCellValue();
		}
		catch (Exception e) {
			System.out.println("unable to fetch");
		}
		return val;
	}
}
