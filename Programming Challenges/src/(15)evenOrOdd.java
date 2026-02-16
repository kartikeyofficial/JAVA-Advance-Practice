import java.util.Scanner;

class evenOrOdd {
    static void main(String[] args) {
        System.out.println("Welcome to Odd and Even\n");
        Scanner x = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int num = x.nextInt();
        String oddOrEven = (num%2==0)?"Even":"Odd";
        System.out.println("The Given Number is: "+oddOrEven);
    }
}
