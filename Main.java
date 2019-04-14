package com.mycompany.mavenproject2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int n = 100;
        List<Item> items = new ArrayList<Item>();
        Item[] item = new Item[n];
        for (int i = 0; i < n; i++) {
            item[i] = new Item();
            items.add(item[i]);
        }

        //Produkcja
        for (int i = 0; i < 100; i = i + 4) {
            Thproduce p1 = new Thproduce(items.get(i));
            p1.start();
            Thproduce p2 = new Thproduce(items.get(i + 1));
            p2.start();
            Thproduce p3 = new Thproduce(items.get(i + 2));
            p3.start();
            Thproduce p4 = new Thproduce(items.get(i + 3));
            p4.start();
        }

         //Konsmupcja        
        for (int j = 0; j < 102; j = j + 3) {
            if (j+3<100) {
                Thconsume c1 = new Thconsume(items.get(j));
                c1.start();
                Thconsume c2 = new Thconsume(items.get(j + 1));
                c2.start();
                Thconsume c3 = new Thconsume(items.get(j + 2));
                c3.start();
            } else {
                Thconsume c1 = new Thconsume(items.get(j));
                c1.start();
            }
        }
    }

}
