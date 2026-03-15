package in.KartikeyCoding.Collections.List_Interface;

import in.KartikeyCoding.Collections.Utility;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    static void main(String[] args) {
        List<String> newList = new ArrayList<String>();
        newList.add("Kartikey");
        newList.add("Aman");
        System.out.println(newList.contains("Aman"));
       for (String i : newList){
           System.out.println(i);
       }
       newList.remove(0);
        System.out.println("Again Print: ");
        for (String i : newList){
            System.out.println(i);
        }
        newList.add(0,"Kumar");
        System.out.println("\nAgain Print The List:\n");
        for (String i : newList){
            System.out.println(i);
        }

    }
}
