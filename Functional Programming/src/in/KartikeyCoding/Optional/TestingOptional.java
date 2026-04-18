package in.KartikeyCoding.Optional;

import java.util.List;
import java.util.Optional;

public class TestingOptional {
    static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9);
        Optional<Integer> sum = numbers.stream().reduce(Integer::sum);
        if (sum.isPresent()){
            System.out.println(sum.get());
        }else {
            System.out.println("List is Empty");
        }
    }
}
