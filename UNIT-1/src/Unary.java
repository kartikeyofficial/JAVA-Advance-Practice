public class Unary {
    public static void main(String[] args) {
        int x= 5;
        int y= -x;
        System.out.println(y);

        int a =5;
        a= a+1;
        System.out.println(a);
//        a++;
//        System.out.println(a);
//        ++a;
//        System.out.println(a);
        System.out.println("Watching Increament");
        System.out.println(a++);
        System.out.println(a);
        System.out.println(++a);

        System.out.println("Decreament");
        System.out.println(--a);
        System.out.println(a--);
        System.out.println(a);
    }
}
