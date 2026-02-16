import java.util.Scanner;

class minimumOfTwoNumber {
    static void main(String[] args) {
        System.out.println("Welcome to Minimum of Two Numbers:\n");
        Scanner x = new Scanner(System.in);
        System.out.print("Enter The First Number:");
        int num1 = x.nextInt();
        System.out.print("Enter The Second Number:");
        int num2 = x.nextInt();
        int smallNumber = num1<num2 ?num1:num2;
        System.out.println("Smallest Number of Them is: "+smallNumber);
    }
}
