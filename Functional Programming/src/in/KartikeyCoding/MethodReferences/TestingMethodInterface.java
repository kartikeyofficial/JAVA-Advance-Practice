package in.KartikeyCoding.MethodReferences;

import java.util.List;

public class TestingMethodInterface {
    static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8);
        list.stream()
                .filter(num -> num%2!=0)
                .forEach(System.out::println);


//        list.stream()
//                .filter(num -> num%2!=0)
//                .forEach(num-> System.out.println(num));


//        int sum = 0;
//        for (Integer i : list) {
//            sum += i;
//        }
//        System.out.println(sum);
//

        int newSum = list.stream()
                .reduce(0, Integer::sum);
        System.out.println("Sum using Reduce is: "+newSum);
//
        int max = list.stream()
                .reduce(Integer.MIN_VALUE, (a,b)-> a>b ? a:b);
        System.out.println("Max Value of the Array is: "+max);
    }

}
