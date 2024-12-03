package Pętle_Listy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Listy {
    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();
        lista.add("Kot");
        lista.add("Pies");
        lista.add("Chomik");
        lista.add("Kot");
        lista.add("Kot");
        lista.add("Pies");
        lista.add("Chomik");
        lista.add("Kot");
        lista.add("Kot");
        lista.add("Pies");
        lista.add("Chomik");
        lista.add("Kot");
        lista.add("Kot");
        lista.add("Pies");
        lista.add("Chomik");
        lista.add("Kot");
        lista.add("Chomik");

        System.out.println(lista.get(0));
        lista.set(0,"Krowa");
        System.out.println(lista.get(0));
        lista.remove("Pies");
        System.out.println(lista.get(1));
        System.out.println(lista.size());
        System.out.println(lista.contains("Kot"));
        System.out.println(lista.indexOf("Chomik"));
        System.out.println(lista.lastIndexOf("Chomik"));

        Collections.sort(lista); //do poczytania (Stack, GitHub)

        System.out.println("__________");

        int allAnimal = 0;
        for (String animal : lista) {
            if (animal == "Chomik") {
                allAnimal++;
            }
        }
        System.out.println(allAnimal);

        lista.clear();  //czyszczenie całej listy

//        lista.removeAll() -- do potestowania
//        lista.addAll()  -- do potestowania

//        HW: zwróc pętlę na wyliczenie listy liczby elementów w liście np. chomików
          //size - to samo co length w tablicach

//        List<String> nazwa = Arrays.asList("ok ", "hskj");  --> zapisywanie listy w jednym ciągu

        List<String> list = new ArrayList<>() {{
            add("one");
            add("two");
            add("three");
        }};
    }
}
