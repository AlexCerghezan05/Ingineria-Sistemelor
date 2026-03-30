package Laborator3;
import Laborator4.Student;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Path drumFisier = Path.of("in.txt");
        String Textul = Files.readString(drumFisier);
        String[] partiLinii = Textul.split("\n");
        List<String> listaLinii = Arrays.asList(partiLinii);
        //a)
        String textA = "";
        for (String linie : listaLinii) {
            textA = textA + linie + "\n\n";
        }
        System.out.println(textA);


        //b)

        String textB = "";
        for (String linie : listaLinii) {
            textB = textB + linie.replace(".", ".\n") + "\n";
        }
        System.out.println(textB);

        //c)
        String textFinal=textA+textB;
        Files.writeString(Path.of("out.txt"),textFinal);

//Problema 3.5.2:

        Path drum=Path.of("studenti_in.txt");
        List<String> liniiFisier=Files.readAllLines(drum);
        List<Student> listaStudenti= new ArrayList<>();
        for(String rand : liniiFisier){
            String[] bucati= rand.split(",");
            Student studentnou= new Student(bucati[0],bucati[1],bucati[2],bucati[3]);
            listaStudenti.add(studentnou);
        }

        //Afisare Studenti:
        for(Student s:listaStudenti){
            System.out.println(s);
        }

        //Sortare si salvare:

        listaStudenti.sort((s1,s2)-> s1.nume.compareTo(s2.nume));
        String textSalvare= "";
        for(Student s : listaStudenti){
            textSalvare=textSalvare+s.toString()+ "\n";
            Files.writeString(Path.of("studenti_out.txt"), textSalvare);
        }


        //Tema 3.5.3
        listaStudenti.sort((s1,s2)->{
            int comparaFormatiedeStudiu=s1.formatieDeStudiu.compareTo(s2.formatieDeStudiu);
            if(comparaFormatiedeStudiu!=0){
                return comparaFormatiedeStudiu;
            }
            return s1.nume.compareTo(s2.nume);
        });
//Afisare lista studenti dupa Formatie de studiu
        String textTema= "";
        for(Student s: listaStudenti){
            textTema=textTema+s.toString()+ "\n";
        }
        Files.writeString(Path.of("studenti_out_sorted.txt"),textTema);
    }
}