package Laborator3;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
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

    }
}