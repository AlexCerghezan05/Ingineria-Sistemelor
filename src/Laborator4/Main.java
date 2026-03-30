package Laborator4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, Student> mapStudenti = new HashMap<>();

        try {
            File fisierStudenti = new File("studenti.txt");
            Scanner scannerStudenti = new Scanner(fisierStudenti);

            while (scannerStudenti.hasNextLine()) {
                String linie = scannerStudenti.nextLine();
                String[] date = linie.split(",");

                Student studentNou = new Student(date[0], date[1], date[2], date[3]);

                mapStudenti.put(studentNou.numarMatricol, studentNou);
            }
            scannerStudenti.close();

        } catch (FileNotFoundException e) {
            System.out.println(" Nu am gasit fisierul studenti.txt ");
        }

        try {
            File fisierNote = new File("note_anon.txt");
            Scanner scannerNote = new Scanner(fisierNote);

            while (scannerNote.hasNextLine()) {
                String linie = scannerNote.nextLine();
                String[] date = linie.split(",");

                int matricol = Integer.parseInt(date[0]);
                double nota = Double.parseDouble(date[1]);

                Student studentGasit = mapStudenti.get(matricol);

                if (studentGasit != null) {
                    studentGasit.setNota(nota);
                }
            }
            scannerNote.close();

        } catch (FileNotFoundException e) {
            System.out.println(" Nu am gasit fisierul note_anon.txt");
        }

        System.out.println("Lista studentilor cu notele actualizate este:");
        for (Student s : mapStudenti.values()) {
            System.out.println(s.toString());
        }
    }
}