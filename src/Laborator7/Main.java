package Laborator7;

import Laborator7.Circle;
import Laborator7.Form;
import Laborator7.Square;
import Laborator7.Triangle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // 7.6.1. Contor instante
        Triangle tri = new Triangle(1.1F, 2.0F, "red");
        Circle c = new Circle(1.5F, "yellow");
        Square sq = new Square(1.2F, "blue");
        System.out.println("Area = " + tri.getArea()+" details: " + tri);
        System.out.println("Area = " + c.getArea() + " details: " + c);
        System.out.println("Area = " + sq.getArea() + " details: " + sq);
        System.out.println("Total instance count is " + Form.getInstanceCount());   // sau tri.getInstanceCount() sau sq.getInstanceCount()

        //7.6.2 Password maker singleton
        PasswordMaker pm2 = PasswordMaker.getInstance();
        System.out.println("\n7.6.2 a+b): Generated passwords: ");
        System.out.println("1:" + PasswordMaker.getInstance().getPassword());
        System.out.println("2:" + PasswordMaker.getInstance().getPassword());
        System.out.println("3:" + PasswordMaker.getInstance().getPassword());
        System.out.println("4:" + pm2.getPassword());
        System.out.println("5:" + pm2.getPassword());
        System.out.println("\n7.6.2 c): Number of time getInstance() has been called: "+PasswordMaker.getCallingCounts());

        //7.6.3 Imutabilitate

        List<Student> listaInitiala = new ArrayList<>();
        listaInitiala.add(new Student(101, "Alex", "Popa", "Neasignat", 9.5));
        listaInitiala.add(new Student(102, "Maria", "Ionescu", "Neasignat", 8.0));
        listaInitiala.add(new Student(103, "Ion", "Vasile", "Neasignat", 7.5));
        listaInitiala.add(new Student(104, "Elena", "Radu", "Neasignat", 10.0));
        listaInitiala.add(new Student(105, "Andrei", "Stan", "Neasignat", 6.5));

        List<Student> listaNoua= new ArrayList<>();
        int jumatate= listaInitiala.size() / 2;

        for(int i=0;i<listaInitiala.size();i++) {
            Student studentCurent = listaInitiala.get(i);

            if (i < jumatate) {
                listaNoua.add(studentCurent.mutaInFormatie("Formatia 1"));
            }
            else {
                listaNoua.add(studentCurent.mutaInFormatie("Formatia 2"));
            }
        }

        System.out.println("\n 7.6.3: Lista impartita in cele doua formatii este: ");
        for(Student s: listaNoua){
            System.out.println(s.toString());
        }
    }
}
