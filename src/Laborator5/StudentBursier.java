package Laborator5;
import Laborator4.Student;
import java.util.Objects;

public class StudentBursier extends Student {
    private double cuantumBursa;

    public StudentBursier(int numarMatricol, String prenume, String nume, String formatieDeStudiu, double nota, double cuantumBursa) {
        super(numarMatricol, prenume, nume, formatieDeStudiu);
        this.setNota(nota);
        this.cuantumBursa = cuantumBursa;
    }

    public String toString() {
        return super.toString() + ", Bursa: " + cuantumBursa;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        if (!super.equals(obj)) return false;
        StudentBursier student = (StudentBursier) obj;
        return Double.compare(student.cuantumBursa, cuantumBursa) == 0;
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), cuantumBursa);
    }
}
