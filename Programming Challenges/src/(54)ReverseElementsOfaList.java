import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class ReverseElementsOfaList {
    static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        Collections.reverse(list);
        for (int reverse: list){
            System.out.print(reverse+" ");
        }

    }
}
