package in.KartikeyCoding.Collections.Set_Inteface;

import in.KartikeyCoding.Collections.Utility;

import java.util.HashSet;
import java.util.Set;

public class SetTesting {
    static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("Kartikey");
        set.add("Harshit");
        set.add("Aman");
        Utility.print(set);

        System.out.println(set.add("Kartikey"));
        System.out.println(set.size());

        System.out.println(set.contains("Aman"));
        set.remove("Aman");
        Utility.print(set);
    }
}
