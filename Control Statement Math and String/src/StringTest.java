public class StringTest {
    static void main(String[] args) {
        StringBuilder sb = new StringBuilder("First ");
        sb.append(45);
        sb.append(", This is My Marks");
        System.out.println(sb.toString());
    }
}
