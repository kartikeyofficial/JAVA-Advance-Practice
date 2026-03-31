import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class UniqueCharacters {
    static void main(String[] args) {
        Set<Character> unique = new HashSet<>();
        System.out.println("Please Enter Your String: ");
        Scanner x = new Scanner(System.in);
        String usrStr = x.next();

        for (char ch : usrStr.toCharArray()) {
            unique.add(ch);
        }
        System.out.println("Unique Character in String are: "+unique.size());
        
    }
}
