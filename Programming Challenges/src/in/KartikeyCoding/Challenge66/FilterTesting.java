package in.KartikeyCoding.Challenge66;

import java.util.List;

public class FilterTesting {
    static void main(String[] args) {
        List<String> strs = List.of("Kumar Kartikey is a Good Boy","Bad","And It Always Studying Programming","Egoistic","And always Learn About new new Things.");
        String result = strs.stream()
                .filter(str -> str.length()>10)
                .reduce("",(a,b)-> a+" "+b);

        System.out.println(result);

    }
}
