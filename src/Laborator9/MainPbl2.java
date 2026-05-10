package Laborator9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainPbl2 {
  public static void main(String[] args){
      String text = "Acesta este un program scris in java pentru expresii lambda";
      String[] arrayCuvinte= text.split(" ");

      List<String> listacuvinte = new ArrayList<>();
      for(int i=0; i < arrayCuvinte.length;i++){
          listacuvinte.add(arrayCuvinte[i]);
      }
      System.out.println("Lista initiala de cuvinte este: "+ listacuvinte);

      //a)
      int contor=0;
      List<String> listaFiltrata= new ArrayList<>();
      for(String cuvant : listacuvinte){
          if(cuvant.length() >= 5){
              contor++;
              listaFiltrata.add(cuvant);
          }
      }
      System.out.println("Exista " + contor + " cuvinte cu cinci sau mai multe caractere");
      System.out.println("Lista filtrata este: "+ listaFiltrata);

      //b)
      Collections.sort(listaFiltrata);
      System.out.println("Noua lista sortata alfabetic este: "+ listaFiltrata);

      //c)
       for(String cuvant: listacuvinte){
           if(cuvant.startsWith("p")){
               System.out.println("Element care incepe cu litera p este: " + cuvant);
               break;
           }
       }
  }
}
