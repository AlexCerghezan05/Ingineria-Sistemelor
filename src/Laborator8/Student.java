package Laborator8;

public class Student {
    private String nume;
    private String prenume;
    private double nota;

    // Constructor
    public Student(String nume, String prenume, double nota) {
        this.nume = nume;
        this.prenume = prenume;
        this.nota = nota;
    }

    public String getNume() { return nume; }
    public String getPrenume() { return prenume; }
    public double getNota() { return nota; }

    public String toString() {
        return "Student{" + "nume='" + nume + '\'' + ", prenume='" + prenume + '\'' + ", nota=" + nota + '}';
    }
}
