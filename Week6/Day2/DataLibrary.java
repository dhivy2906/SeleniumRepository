package Week6.Day2;


	import java.io.File;
	import java.io.IOException;

	import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class DataLibrary {

		public static String[][] readExcel(String fileName, String sheetName) throws InvalidFormatException, IOException {
			// Excel file location
			File excelFile = new File("./data/"+fileName+".xlsx");
			
			// Open the excel workbook
			XSSFWorkbook workBook = new XSSFWorkbook(excelFile);
			
			//Locate the work sheet from the workbook
//			XSSFSheet sheetAt = workBook.getSheetAt(0);
			XSSFSheet sheetAt = workBook.getSheet(sheetName);
			
			int rowCount = sheetAt.getLastRowNum();
			short colCount = sheetAt.getRow(0).getLastCellNum();
			System.out.println("Row count: "+rowCount);
			System.out.println("Column count: "+colCount);
			
			System.out.println("<--------------------->");
			//Get All the Test data
			
			String[][] data = new String[rowCount][colCount];
			
			//iterate the row
			for(int i=1; i<=rowCount; i++) {
				
				//iterate the column
				for(int j=0; j<colCount; j++) {
					String cellValue = sheetAt.getRow(i).getCell(j).getStringCellValue();
					System.out.println(cellValue);
					data[i-1][j] = cellValue;
				}
				
			}
			// close workbook
			workBook.close();
			
			return data;
		}

	}
