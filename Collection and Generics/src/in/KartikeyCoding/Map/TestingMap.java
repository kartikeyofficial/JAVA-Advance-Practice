package in.KartikeyCoding.Map;

import java.util.HashMap;
import java.util.Map;

public class TestingMap {
    static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Kartikey",73);
        map.put("Harshit",61);
        map.put("Izazul",65);
        map.put("Rohit",118);
        map.put("Aman",21);
        System.out.println(map.size());
        System.out.println(map.keySet());

        System.out.println(map.get("Kartikey"));
        System.out.println(map.containsKey("Rohit"));
        System.out.println(map.containsKey("Bhumi"));
        System.out.println(map.remove("Aman"));
        System.out.println(map.size());

        for (String key : map.keySet()){
            System.out.println(key+" : "+map.get(key));
        }


    }
}
