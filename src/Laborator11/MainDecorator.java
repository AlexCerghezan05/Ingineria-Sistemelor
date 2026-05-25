package Laborator11;
import Laborator10.IStudentiExport;
import Laborator10.StudentiInFisierText;
import Laborator10.Student;

import java.util.ArrayList;
import java.util.List;

public class MainDecorator {
    public static void main(String[] args){
        List<Student> studenti = new ArrayList<>();
        studenti.add(new Student(1, "Andrei", "Iordan", "311ISM", 9.2));
        studenti.add(new Student(2, "Andreea", "Negres", "312ISM", 10.0));

        IStudentiExport exportSimplu = new StudentiInFisierText("studenti_lab11.txt");
        IStudentiExport exportCuCronometru= new TimerExportDecorator(exportSimplu);

        System.out.println("Pornire export decorat");
        exportCuCronometru.doExport(studenti);
    }
}
