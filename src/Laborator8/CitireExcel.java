package     Laborator8;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

public class CitireExcel {

    public static void main(String[] args) {
        System.out.println("--- Datele din fișierul inițial ---");
        try {
            FileInputStream file = new FileInputStream(new File("C:\\Users\\Alexandru Cerghezan\\IdeaProjects\\Ingineria-Sistemelor\\src\\Laborator8\\laborator8_input.xlsx"));
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheetAt(0);

            Iterator<Row> rowIterator = sheet.iterator();
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                Iterator<Cell> cellIterator = row.cellIterator();
                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();
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
            e.printStackTrace();
        }
        genereazaFisierCuMedie();

    }

    public static void genereazaFisierCuMedie() {
        try {
            FileInputStream fileIn = new FileInputStream(new File("C:\\Users\\Alexandru Cerghezan\\IdeaProjects\\Ingineria-Sistemelor\\src\\Laborator8\\laborator8_input.xlsx"));
            XSSFWorkbook workbook = new XSSFWorkbook(fileIn);
            XSSFSheet sheet = workbook.getSheetAt(0);

            for (int i = 0; i <= sheet.getLastRowNum(); i++) {
                Row row = sheet.getRow(i);

                if (row == null) {
                    continue;
                }

                Cell newCell = row.createCell(6);

                if (i == 0) {
                    newCell.setCellValue("Media");
                } else {

                    Cell cellNota1 = row.getCell(3);
                    Cell cellNota2 = row.getCell(4);
                    Cell cellNota3 = row.getCell(5);

                    double n1 = (cellNota1 != null) ? cellNota1.getNumericCellValue() : 0;
                    double n2 = (cellNota2 != null) ? cellNota2.getNumericCellValue() : 0;
                    double n3 = (cellNota3 != null) ? cellNota3.getNumericCellValue() : 0;

                    double media = (n1 + n2 + n3) / 3.0;
                    newCell.setCellValue(media);
                }
            }

            fileIn.close();

            FileOutputStream fileOut = new FileOutputStream(new File("C:\\\\Users\\\\Alexandru Cerghezan\\\\IdeaProjects\\\\Ingineria-Sistemelor\\\\laborator8_output2.xlsx"));
            workbook.write(fileOut);

            fileOut.close();
            workbook.close();

            System.out.println("SUCCES! Fișierul 'laborator8_output2.xlsx' a fost generat.");

        } catch (IOException e) {
            System.err.println("A apărut o eroare la crearea noului fișier.");
            e.printStackTrace();
        }
    }
}