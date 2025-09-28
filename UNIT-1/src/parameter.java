public class parameter {
    public static void main(String[] args) {

        System.out.println("Sum of Two Numbers: \n"+sum(4,7));
        System.out.println("Sum of Two Numbers: "+sum(-67,67));

    }
    public static int sum(int first, int second){
        System.out.println("First Number Received: "+first);
        System.out.println("Second Number Received: "+second);
       return first+second;
    }
}
