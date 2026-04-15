package in.KartikeyCoding.FilterAndReduce;

import java.util.List;
import java.util.function.Consumer;

public class testingFilterAndReduce {
    static void main(String[] args) {
        List<String> fruits = List.of("Apple","Banana","Mango","Cherry","Date");
        System.out.println(fruits.size());
        fruits.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String fruit) {
                System.out.println(fruit);
            }
        });

        System.out.println("\nPrint By Lambda Function Using Filter:\n");

        fruits.stream()
                .filter(fruit -> fruit.endsWith("e"))
                .forEach(fruit -> System.out.println(fruit));


    }
}
