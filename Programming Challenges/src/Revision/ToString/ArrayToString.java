package Revision.ToString;

public class ArrayToString {
    static void main(String[] args) {
        String[] arr = new String[]{
                "Hey", "i am", "Kartikey", "Rajput.", "And", "i am", "Also", "a", "Software", "Engineer"
        };
        StringBuilder sb = new StringBuilder();
        for (String str:arr){
            sb.append(str+" ");
        }
        System.out.println(sb);
    }
}
