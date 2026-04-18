package in.KartikeyCoding.Challenge66;

import java.util.List;

public class StreamTesting {
    static void main(String[] args) {
        List<String> name = List.of("Kartikey","Harshit","Rohit","Aman Kumar");
        name.stream()
                .forEach(names-> System.out.println(names));
    }
}
