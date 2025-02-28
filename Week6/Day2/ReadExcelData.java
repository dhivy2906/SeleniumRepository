package Week6.Day2;

	import java.io.File;
	import java.io.IOException;

	import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
	import org.apache.poi.xssf.usermodel.XSSFCell;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class ReadExcelData {

		public static void main(String[] args) throws InvalidFormatException, IOException {
			// Excel file location
			File excelFile = new File("./TestData/CreateLead.xlsx");
			
			// Open the excel workbook
			XSSFWorkbook workBook = new XSSFWorkbook(excelFile);
			
			//Locate the work sheet from the workbook
//			XSSFSheet sheetAt = workBook.getSheetAt(0);
			XSSFSheet sheetAt = workBook.getSheet("Sheet1");
			
			//get the cell from the sheet
			XSSFCell cell21 = sheetAt.getRow(2).getCell(1);
			
			//get data from the cell
			String stringCellValue = cell21.getStringCellValue();
			System.out.println(stringCellValue);
			
			String stringCellValue2 = sheetAt.getRow(2).getCell(0).getStringCellValue();
			System.out.println(stringCellValue2);
			
			String stringCellValue3 = sheetAt.getRow(1).getCell(3).getStringCellValue();
			System.out.println(stringCellValue3);
			
			int rowCount = sheetAt.getLastRowNum();
			short colCount = sheetAt.getRow(0).getLastCellNum();
			System.out.println("Row count: "+rowCount);
			System.out.println("Column count: "+colCount);
			
			System.out.println("<--------------------->");
			//Get All the Test data
			
			//iterate the row
			for(int i=1; i<=rowCount; i++) {
				
				//iterate the column
				for(int j=0; j<colCount; j++) {
					String cellValue = sheetAt.getRow(i).getCell(j).getStringCellValue();
					System.out.println(cellValue);
				}
				
			}
			// close workbook
			workBook.close();
		}


}
