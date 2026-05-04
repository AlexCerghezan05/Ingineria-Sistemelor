package Laborator8;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class CitireExcel {

    public static void main(String[] args) {
        try {
            // 1. Deschidem fișierul Excel
            FileInputStream file = new FileInputStream(new File("C:\\Users\\Alexandru Cerghezan\\IdeaProjects\\Ingineria-Sistemelor\\src\\Laborator8\\laborator8_input.xlsx"));

            // 2. Creăm instanța workbook-ului (specific pentru .xlsx)
            XSSFWorkbook workbook = new XSSFWorkbook(file);

            // 3. Obținem prima pagină din Excel (index 0)
            XSSFSheet sheet = workbook.getSheetAt(0);

            // 4. Iterăm prin fiecare rând din pagină
            Iterator<Row> rowIterator = sheet.iterator();
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();

                // 5. Iterăm prin celulele de pe rândul curent
                Iterator<Cell> cellIterator = row.cellIterator();
                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();

                    // 6. Afișăm în consolă în funcție de tipul de date (Numeric sau String)
                    switch (cell.getCellType()) {
                        case NUMERIC:
                            System.out.print(cell.getNumericCellValue() + " \t\t ");
                            break;
                        case STRING:
                            System.out.print(cell.getStringCellValue() + " \t\t ");
                            break;
                        default:
                            System.out.print("AltTip \t\t ");
                    }
                }
                System.out.println();
            }

            file.close();
            workbook.close();

        } catch (IOException e) {
            System.err.println("Eroare: Nu am putut găsi sau citi fișierul Excel.");
            System.err.println("Asigură-te că 'laborator8_input.xlsx' este în folderul ProiectareSoftware!");
            e.printStackTrace();
        }
    }
}

