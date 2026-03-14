package in.KartikeyCoding.Collections;

import java.util.Collection;
import java.util.Collections;

public class Utility {
    public static <E> void  print(Collection<E> collection){
        System.out.println("Collection is: ");
        for (E coll: collection){
            System.out.println(coll);
        }

    }
}
