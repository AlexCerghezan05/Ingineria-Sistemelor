package Laborator9;

 import java.util.ArrayList;
 import java.util.List;
 import java.util.Random;
 import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args){
        List<Integer> numere= new ArrayList<>();
        Random rand= new Random();

        for(int i=0;i<10;i++){
            int numarAleator = rand.nextInt(25-5+1)+5;
            numere.add(numarAleator);
        }
        System.out.println("Lista initiala este:" + numere);

        //a)
        int suma= numere.stream().reduce(0,(a,b)->a+b);
        System.out.println("Suma nr este:" + suma);

        //b)
        int maxim =numere.get(0);
        int minim = numere.get(0);

        for(int i=0;i<numere.size();i++){
            if(numere.get(i)> maxim){
                maxim= numere.get(i);
            }
            else if(numere.get(i)< minim){
                minim=numere.get(i);
            }
        }
        System.out.println("Valoarea maxima este: " + maxim + " Valoarea minima este: " + minim);

        //c)
        List<Integer> listaFiltrata= new ArrayList<>();

        for(int i=0;i<numere.size();i++){
            int elementCurent = numere.get(i);
            if(elementCurent >= 10 && elementCurent <=20){
                listaFiltrata.add(elementCurent);
            }
        }
        System.out.println("Lista cu nr intre 10 si 20 este: "+ listaFiltrata);

        //d)
        List<Double> numereDouble = numere.stream()
                .map(x->(double)x)
                .collect(Collectors.toList());
        System.out.println("Lista transformata este: "+ numereDouble);

        //e)
        boolean contine12 = numere.contains(12);
        if(contine12){
            System.out.println("Valoarea 12 se gaseste in lista!");
        }
        else{
            System.out.println("Valoarea 12 nu exista in lista!");
        }
    }
}
