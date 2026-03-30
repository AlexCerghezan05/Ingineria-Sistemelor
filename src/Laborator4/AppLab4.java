package Laborator4;

import java.util.HashMap;
import java.util.Map;

public class AppLab4 {
    public static void main(String[] args){

        HashMap<String, Integer> varste = new HashMap<>();
        varste.put("Ioan", 21);
        varste.put("Maria", 22);
        varste.put("Victor", 20);
        varste.put("Simina", 20);
        varste.put("Marius", 21);
        varste.put("Mihai", 21);
        varste.put("Daniela", 23);

        Map<String, String> adrese = Map.of("Ioan", "Sibiu", "Maria", "Bucuresti", "Victor",
                "Cluj", "Simina", "Alba-Iulia", "Marius", "Medias", "Mihai",
                "Cisnadie", "Daniela", "Sibiu");

        //a)

        System.out.println("Varste:" + varste + " \n ");

        varste.put("Vlad",19);
        varste.put("Iulia",19);

        System.out.println(varste+ "\n");

        //c

        HashMap<String, Tanar> tineri= new HashMap<>();
        for(String name: varste.keySet()){
            int varsta= varste.get(name);
            String adresa=adrese.get(name);

            if(adresa==null){
                adresa="fara adresa";
            }

            Tanar t= new Tanar(name, varsta, adresa);
            tineri.put(name,t);
        }

        for (Tanar t : tineri.values()) {
            System.out.println(t);
        }
    }
}
