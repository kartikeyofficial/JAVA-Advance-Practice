import java.util.Scanner;
public class swappingTwoNumbers {
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        System.out.println("Enter The First Number(A):");
        int a= x.nextInt();
        System.out.println("Enter The Second Number(B):");
        int b= x.nextInt();
        int c=a;
        a=b;
        b=c;
        System.out.println("Value Of First Number(A):"+a);
        System.out.println("Value Of Second Number(B):"+b);

    }
}
