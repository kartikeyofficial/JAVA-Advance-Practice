package in.KartikeyCoding.Collections;

import java.util.Collection;
import java.util.Collections;

public class Utility {
    public static <E> void  print(Collection<E> collection){
        System.out.print("\nCollection is: ");
        for (E coll: collection){
            System.out.print(coll+" ");
        }

    }
}
