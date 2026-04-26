package Laborator7;

import java.util.Objects;

public final class Student {
    private final int numarMatricol;
    private final String prenume;
    private final String nume;
    private final String formatieDestudiu;
    private final double nota;

    public Student(int numarMatricol, String prenume, String nume, String formatieDestudiu, double nota){
        this.numarMatricol = numarMatricol;
        this.prenume = prenume;
        this.nume= nume;
        this.formatieDestudiu = formatieDestudiu;
        this.nota = nota;
    }

    public double getNota(){
        return nota;
    }

    public String getPrenume(){
        return prenume;
    }

    public String getNume(){
        return nume;
    }

    public String getFormatieDestudiu(){
        return formatieDestudiu;
    }

    public Student mutaInFormatie(String formatieNoua){
        return new Student (this.numarMatricol, this.prenume, this.nume, formatieNoua, this.nota);

    }

    public boolean equals(Object obj){
        if(this== obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Student student= (Student) obj;
        return numarMatricol== student.numarMatricol;
    }

    public int hashCode(){
        return Objects.hash(numarMatricol);
    }

    public String toString(){
        return numarMatricol+ " | " + prenume + " " + nume + " | " + formatieDestudiu + " | Nota: " + nota;
    }
}

