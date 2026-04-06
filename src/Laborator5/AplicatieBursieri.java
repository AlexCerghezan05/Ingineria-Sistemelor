package Laborator5;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

    public class AplicatieBursieri {

        public static void main(String[] args) {
            List<StudentBursier> listaBursieri = new ArrayList<>();

            listaBursieri.add(new StudentBursier(1025, "Andrei", "Popa", "ISM141/2", 8.70, 725.50));
            listaBursieri.add(new StudentBursier(1024, "Ioan", "Mihalcea", "ISM141/1", 9.80, 801.10));
            listaBursieri.add(new StudentBursier(1026, "Anamaria", "Prodan", "TI131/1", 8.90, 745.50));
            listaBursieri.add(new StudentBursier(1029, "Bianca", "Popescu", "TI131/1", 9.10, 780.80));

            String numeFisier = "bursieri_out.txt";
            salvareInFisier(numeFisier, listaBursieri);

            System.out.println("Am creat fisierul " + numeFisier);
        }

        public static void salvareInFisier(String nume, List<StudentBursier> lista) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(nume))) {

                for (StudentBursier student : lista) {
                    writer.write(student.toString());
                    writer.newLine();
                }

            } catch (IOException e) {
                System.out.println(" Fisierul nu s-a salvat");
                e.printStackTrace();
            }
        }
    }
