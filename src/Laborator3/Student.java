package Laborator3;
import java.util.Objects;

public class Student {
    int numarMatricol;
    String prenume;
    String nume;
    String formatieDeStudiu;

    public Student(int numarMatricol, String prenume, String nume, String formatieDeStudiu){
        this.numarMatricol= numarMatricol;
        this.prenume= prenume;
        this.nume= nume;
        this.formatieDeStudiu= formatieDeStudiu;
    }

    public Student(String numarMatricol, String prenume, String nume, String formatieDeStudiu){
        this.numarMatricol=Integer.parseInt(numarMatricol);
        this.prenume= prenume;
        this.nume= nume;
        this.formatieDeStudiu=formatieDeStudiu;
    }

      public boolean equals(Object obj){
        if(this==obj) return true;
        if(obj==null|| getClass() !=obj.getClass()) return false;
        Student student= (Student) obj;
        return numarMatricol==student.numarMatricol &&
                Objects.equals(prenume, student.prenume) &&
                Objects.equals(nume, student.nume) &&
                Objects.equals(formatieDeStudiu, student.formatieDeStudiu);
      }
    public String toString(){
        return numarMatricol + "," + prenume + "," + nume + "," + formatieDeStudiu;
    }

      public int hashCode(){
        return Objects.hash(numarMatricol, prenume, nume, formatieDeStudiu);
      }

}
