import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class FrequencyOfNumber {
    static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,4,6,1,2,2,1,6);
        System.out.println(Collections.frequency(list,1));
        System.out.println(Collections.frequency(list,2));
    }
}
