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

    public String toString(){
        return "\n Student:" + nume  + " " + prenume + "\n Grupa: " + formatieDeStudiu + "\n Matricol: " + numarMatricol;
    }
}
