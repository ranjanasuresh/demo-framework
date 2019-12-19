package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class data {
	public static String getdata(String path,String sheet,int row,int column) throws Throwable, IOException
	{
		String data=null;
		try {
			FileInputStream f=new FileInputStream(path);
			Workbook book = WorkbookFactory.create(f);
			data=book.getSheet(sheet).getRow(row).getCell(column).getStringCellValue();
		} 
		catch (FileNotFoundException e) {
		}
			return data;		
		}
	}

