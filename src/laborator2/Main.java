import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[]args){
        Student s1= new Student(575, "Andrei", "Popa", "Ingineria sistemelor multimedia grupa A");
        Student s2= new Student(600, "Alex", "Cerghezan", "ISM grupa 21/1");


        System.out.println(s1);
        System.out.println(s2);
    }
}

// Laboratorul 2

public static void main(String[] args) {
    List<Integer> x = new ArrayList();
    List<Integer> y = new ArrayList();

    Random rnd= new Random();
    for (int i=0;i<5;i++){
        x.add(rnd.nextInt(11));
    }
    for(int i=0;i<7;i++){
        y.add(rnd.nextInt(11));
    }

    Collections.sort(x);
    Collections.sort(y);
    System.out.println("Lista x:" + x);
    System.out.println("Lista y: " + y);
//a)
    List<Integer> xPlusY = new ArrayList<>(x);
    xPlusY.addAll(y);
    Collections.sort(xPlusY);
    System.out.println(" xPlusY: " + xPlusY);

    //b)
    Set<Integer> zSet = new TreeSet<>(x);
    zSet.retainAll(y);
    System.out.println(" zSet: " + zSet);

    //c)
    List<Integer> xMinusY = new ArrayList<>(x);
    xMinusY.removeAll(y);
    System.out.println(" xMinusY: " + xMinusY);

    //d)
    int p = 4;
    List<Integer> xPlusYLimitedByP = new ArrayList<>();
    for (Integer val : xPlusY) {
        if (val <= p && !xPlusYLimitedByP.contains(val)) {
            xPlusYLimitedByP.add(val);
        }
    }
    System.out.println(" xPlusYLimitedByP (p=" + p + "): " + xPlusYLimitedByP);

//Tema 2.5.2 Laborator 2


List<Student> listaStudenti= new ArrayList<>();
//a)
    Student s4 = new Student(112, "Maria", "Popa", "TI21/1");
listaStudenti.add(s4);
listaStudenti.add(new Student(120,"Alis", "Popa", "TI21/2"));
    System.out.println("Conținutul listei de studenți:");
    for (Student student : listaStudenti) {
        System.out.println(student);
    }

//b)
    Student studentCautat= new Student(120, "Alis", "Popa", "TI21/2");
    System.out.println("\n Este prezentă Alis Popa? : " + listaStudenti.contains(studentCautat));

//c)
    Student studentCautat1 = new Student(112, "Maria", "Popa", "TI21/1");
    System.out.println(" Este prezentă Maria Popa? : " + listaStudenti.contains(studentCautat1));
}









