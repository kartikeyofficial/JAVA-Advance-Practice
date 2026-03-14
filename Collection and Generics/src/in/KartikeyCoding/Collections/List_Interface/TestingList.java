package in.KartikeyCoding.Collections.List_Interface;

import java.util.ArrayList;
import java.util.List;

public class TestingList {
    static void main(String[] args) {
         List<String> strList = new ArrayList<String>();
         strList.add("Kartikey");
//         strList.add(76);
         strList.add("rajput");
         strList.add(1,"Harshit");
         strList.remove(0);
        for (int i=0;i<strList.size();i++){
            System.out.println(strList.get(i));
        }

        if (strList.contains("Harshit")){
            System.out.println("Harshit is Present");
            System.out.println(strList.indexOf("Harshit"));
        }
        for (String str : strList){
            System.out.println(str);
        }
    }
}
