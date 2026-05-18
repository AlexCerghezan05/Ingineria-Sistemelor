package Laborator10;

import java.util.Arrays;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        List<Student> studenti = Arrays.asList(

                new Student(1025,"Andrei","Popa","ISM141/2", 8.70),
                new Student(1024,"Ioan","Mihalcea","ISM141/1", 10),
                new Student(1026,"Anamaria","Prodan","TI131/1", 8.90),
                new Student(1029,"Bianca","Popescu","TI131/1", 10),
                new Student(1030,"Maria","Pana","TI131/2", 4.10),
                new Student(1031,"Gabriela","Mohanu","TI131/2", 7.33),
                new Student(1032,"Marius","Nasta","TI131/2", 3.20),
                new Student(1033,"Marius","Nasta","TI131/1", 5.12),
                new Student(1034,"Andrei","Dobrescu","TI131/2", 2.22)

        );

        Exporter exporter = new Exporter();

        System.out.println("=== AFISARE CONSOLE ===");

        IStudentiExport strategyConsole =
                new StudentiInConsola();

        exporter.startExport(strategyConsole, studenti);

        System.out.println("\n=== EXPORT TXT ===");

        IStudentiExport strategyText =
                new StudentiInFisierText("studenti.txt");

        exporter.startExport(strategyText, studenti);

        System.out.println("\n=== CITIRE TXT ===");

        IStudentiImport importText =
                new StudentiDinFisierText("studenti.txt");

        List<Student> studentiCititi =
                importText.doImport();

        for(Student s : studentiCititi) {
            System.out.println(s);
        }
    }
}
