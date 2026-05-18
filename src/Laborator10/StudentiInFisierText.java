package Laborator10;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
public class StudentiInFisierText implements IStudentiExport{
    private String fileName;

    public StudentiInFisierText(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void doExport(List<Student> studenti) {

        try {

            FileWriter writer = new FileWriter(fileName);

            for(Student s : studenti) {

                writer.write(
                        s.getId() + "," +
                                s.getPrenume() + "," +
                                s.getNume() + "," +
                                s.getGrupa() + "," +
                                s.getNota() + "\n"
                );

            }

            writer.close();

            System.out.println("Export realizat in fisier text.");

        } catch (IOException e) {

            System.out.println("Eroare: " + e.getMessage());

        }
    }
}


