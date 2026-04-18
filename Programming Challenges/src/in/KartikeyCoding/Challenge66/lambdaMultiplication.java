package in.KartikeyCoding.Challenge66;

import java.util.function.BinaryOperator;

public class lambdaMultiplication {
    static void main(String[] args) {
        BinaryOperator<Integer> multi =(a,b) -> a*b;
        int result = multi.apply(4,6);
        System.out.println(result);
    }

}
