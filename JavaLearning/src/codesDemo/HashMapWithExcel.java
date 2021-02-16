package codesDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.gargoylesoftware.htmlunit.javascript.host.worker.Worker;

public class HashMapWithExcel {
	
	public static Map<String, Map<String, String>> setMapData() throws IOException
	{
		String Path = "C:\\Selenium\\Codes\\HashData.xlsx";
		
		FileInputStream fis = new FileInputStream(Path);
		
		Workbook workbook = new XSSFWorkbook(fis);
		
		Sheet sheet = workbook.getSheetAt(0);
		
		int lastRow = sheet.getLastRowNum();
		
		Map<String, Map<String, String>> excelFileMap = new HashMap<String, Map<String, String>>();
		
		Map<String, String> dataMap = new HashMap<String, String>();
		
		//looping over entire row
		for(int i=0;i<=lastRow;i++)
		{
			Row row = sheet.getRow(i);
			
			//1st cell as value
			Cell valueCell = row.getCell(1);
			
			//0th cell as key
			Cell keyCell = row.getCell(0);
			
			String value = valueCell.getStringCellValue().trim();
			String key = keyCell.getStringCellValue();
			
			//putting key and value in datamap
			dataMap.put(key, value);
			
			//putting datamap to excelfilemap
			excelFileMap.put("Datasheet", dataMap);
		
		}
		
		//returning excel file map
		return excelFileMap;
		
		
		
	}
	

	public static void main(String[] args) {
		

	}

}
