package Laborator9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainPbl3 {
    public static void main(String[] args){
        List<Student> studentiCuNote = Arrays.asList(
                new Student(1025,"Andrei","Popa","ISM141/2", 8.70),
        new Student(1024,"Ioan","Mihalcea","ISM141/1", 10),
        new Student(1026,"Anamaria","Prodan","TI131/1", 8.90),
        new Student(1029,"Bianca","Popescu","TI131/1", 10),
        new Student(1029,"Maria","Pana","TI131/2", 4.10),
        new Student(1029,"Gabriela","Mohanu","TI131/2", 7.33),
        new Student(1029,"Marius","Nasta","TI131/2", 3.20),
        new Student(1029,"Marius","Nasta","TI131/1", 5.12),
        new Student(1029,"Andrei","Dobrescu","TI131/2", 2.22)
);
        //a)
        List<Student> studentiZece= studentiCuNote.stream()
                .filter(student-> student.getNota()==10.0)
                .collect(Collectors.toList());
        System.out.println("Studenti cu nota 10: "+ studentiZece);

        //b)
        List<Student> studentiSubCinci= studentiCuNote.stream()
                .filter(student-> student.getNota()<5.0)
                .collect(Collectors.toList());
        System.out.println("Stundeti cu note sub 5: "+ studentiSubCinci);

        //c)
        List<Student> studentiTransformati= studentiCuNote.stream()
                .map(student->{
                    if(student.getNota()< 4.0){
                        student.setNota(4.0);
                    }
                    return student;
                })
                .collect(Collectors.toList());
        System.out.println("Studenti care au noua nota 4: " + studentiTransformati);

        //d)
        double sumaNotelor = studentiCuNote.stream()
                .map(student->student.getNota())
                .reduce(0.0, (sumaPartiala,notaCurenta)->sumaPartiala +notaCurenta);
        System.out.println("Suma tuturor notelor este: "+ sumaNotelor);

        //e)
        double media= sumaNotelor/studentiCuNote.size();
        System.out.println("Media notelor este:" + media);
    }
}
