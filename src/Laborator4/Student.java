package Laborator4;

import java.util.Objects;

public class Student {
   public int numarMatricol;
   public String prenume;
    public String nume;
    public String formatieDeStudiu;
    double nota;

    public Student(int numarMatricol, String prenume, String nume, String formatieDeStudiu){
        this.numarMatricol = numarMatricol;
        this.prenume = prenume;
        this.nume = nume;
        this.formatieDeStudiu = formatieDeStudiu;
        this.nota = 0.0;
    }

    public Student(String numarMatricol, String prenume, String nume, String formatieDeStudiu){
        this.numarMatricol = Integer.parseInt(numarMatricol);
        this.prenume = prenume;
        this.nume = nume;
        this.formatieDeStudiu = formatieDeStudiu;
        this.nota = 0.0;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return numarMatricol == student.numarMatricol;
    }

    public int hashCode(){
        return Objects.hash(numarMatricol);
    }

    public String toString(){
        return numarMatricol + "," + prenume + "," + nume + "," + formatieDeStudiu + ", Nota: " + nota;
    }
}