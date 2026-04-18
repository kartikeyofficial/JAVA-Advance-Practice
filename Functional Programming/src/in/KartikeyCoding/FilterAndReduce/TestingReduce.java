package in.KartikeyCoding.FilterAndReduce;

import java.util.List;
import java.util.function.BiFunction;

public class TestingReduce {
    static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8);
        int sum = 0;
        for (Integer i : list) {
            sum += i;
        }
        System.out.println(sum);


        int newSum = list.stream()
                .reduce(0, (a,b)-> a+b);
        System.out.println("Sum using Reduce is: "+newSum);

        int max = list.stream()
                .reduce(Integer.MIN_VALUE, (a,b)-> a>b ? a:b);
        System.out.println(max);
    }

}
