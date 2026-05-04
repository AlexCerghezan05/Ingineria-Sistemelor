package Laborator8;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ProcesareStudenti {

    private static final String CALE_FISIER = "C:\\Users\\Alexandru Cerghezan\\IdeaProjects\\Ingineria-Sistemelor\\laborator8_students.xls";

    public static void main(String[] args) {

        List<Student> listaInitiala = new ArrayList<>();
        listaInitiala.add(new Student("Popa", "Andrei", 8.5));
        listaInitiala.add(new Student("Vecerdea", "Bianca", 9.2));
        listaInitiala.add(new Student("Ionescu", "Mihai", 7.8));


        System.out.println("Punctul a) Exportăm lista în Excel...");
        exportaStudenti(listaInitiala);


        System.out.println("\nPunctul b) Citim datele din Excel...");
        List<Student> listaCitita = citesteStudenti();


        System.out.println("Lista finală de studenți importată este:");
        for (Student s : listaCitita) {
            System.out.println(s);
        }
    }


    public static void exportaStudenti(List<Student> studenti) {
        try {

            HSSFWorkbook workbook = new HSSFWorkbook();
            HSSFSheet sheet = workbook.createSheet("Studenti");


            Row headerRow = sheet.createRow(0);
            headerRow.createCell(0).setCellValue("Nume");
            headerRow.createCell(1).setCellValue("Prenume");
            headerRow.createCell(2).setCellValue("Nota");


            int rowNum = 1;
            for (Student s : studenti) {
                Row row = sheet.createRow(rowNum++);
                row.createCell(0).setCellValue(s.getNume());
                row.createCell(1).setCellValue(s.getPrenume());
                row.createCell(2).setCellValue(s.getNota());
            }


            FileOutputStream out = new FileOutputStream(new File(CALE_FISIER));
            workbook.write(out);
            out.close();
            workbook.close();

            System.out.println("SUCCES! Fișierul a fost creat la: " + CALE_FISIER);

        } catch (Exception e) {
            System.err.println("Eroare la export!");
            e.printStackTrace();
        }
    }


    public static List<Student> citesteStudenti() {
        List<Student> listaRezultata = new ArrayList<>();
        try {
            FileInputStream in = new FileInputStream(new File(CALE_FISIER));
            HSSFWorkbook workbook = new HSSFWorkbook(in);
            HSSFSheet sheet = workbook.getSheetAt(0);


            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                Row row = sheet.getRow(i);
                if (row == null) continue;


                String nume = row.getCell(0).getStringCellValue();
                String prenume = row.getCell(1).getStringCellValue();
                double nota = row.getCell(2).getNumericCellValue();


                listaRezultata.add(new Student(nume, prenume, nota));
            }
            in.close();
            workbook.close();

        } catch (Exception e) {
            System.err.println("Eroare la citire!");
            e.printStackTrace();
        }
        return listaRezultata;
    }
}

