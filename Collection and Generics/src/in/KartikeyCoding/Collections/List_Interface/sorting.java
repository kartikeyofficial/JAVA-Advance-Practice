package in.KartikeyCoding.Collections.List_Interface;

import in.KartikeyCoding.Collections.Utility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sorting {
    static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>() ;
        list.add(10);
        list.add(-10);
        list.add(5);
        list.add(2);
        list.add(-3);
        Collections.sort(list);
        Utility.print(list);
        Collections.reverse(list);
        Utility.print(list);

        Collections.shuffle(list);
        Utility.print(list);


//        List<Integer> unmodifiable = Collections.unmodifiableList(list);
//        unmodifiable.add(20);
        // for unmodifiable list.
    }
}
