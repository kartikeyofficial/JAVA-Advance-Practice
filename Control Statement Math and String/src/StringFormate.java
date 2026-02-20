public class StringFormate {
    static void main(String[] args) {
        int marks =56;
        String name = "Kumar Kartikey";
        System.out.println("Hello "+name+", Your Marks are: "+marks);
        System.out.printf("Hello %s, Your Marks are: %d",name,marks);
        System.out.printf("Hello %15s, Your Marks are: %d",name,marks);
    }
}
