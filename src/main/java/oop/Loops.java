package oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Loops {

    static String[] tablica;    // deklaracja zmiennej

    //psvm -> public static void main(String[] args) {
    public static void main(String[] args) {
        tablica = new String[3];   // inicjalizacja zmiennej zadeklarowanej w linii 9
        String str1 = "Ala ";
        String str2 = "ma ";
        String str3 = "kota";
        tablica[0] = str1;
        tablica[1] = str2;
        tablica[2] = str3;

/*
        // pętla while -> wykonywana dopóki warunek = true
        int counter = 1;
        // warunek -> counter <= 10
        while (counter < 10) {
            System.out.println("help! " + counter);
            counter++;  // inkrementacja -> ++ oznacza dodanie 1
            // counter++ oznacza to samo co: counter = counter + 1;
            // counter--; -> dekrementacja
        }

          dopóki (warunek jest prawdziwy) {
            wykonuj kod;
        }

    */

        // pętla for
        //   inicjalizacja ; weryfikacja ; aktualizacja
        for (int count = 1;  count <= 10 ; count++) {
            System.out.println("wow! " + count);
        }

        // pętla for(each) -> iteracja po wszystkich elementach zbioru
        for (String s : tablica) {
            // sout ->  System.out.println
            System.out.println(s);
        }

        //streamy

        Arrays.stream(tablica).forEach(s -> System.out.println(s));
    }
}