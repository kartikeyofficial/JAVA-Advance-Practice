import java.util.Scanner;

class MultiplicationTable {
    static void main(String[] args) {
        System.out.println("Welcome to Multiplication of Table:\n");
        Scanner x = new Scanner(System.in);
        System.out.println("Enter The Number For Table: ");
        int num = x.nextInt();
        int result ;
        System.out.println("Your Table is:");
        for (int i=1;i<=10;i++){
            result = i*num;
            System.out.println(num+" X "+i+" = "+result);
        }


    }
}
