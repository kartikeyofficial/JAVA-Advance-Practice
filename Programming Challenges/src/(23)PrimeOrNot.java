import java.util.Scanner;

class PrimeOrNot {
    static void main(String[] args) {
        System.out.println("Welcome To Check Number is Prime or Not\n");
        Scanner x = new Scanner(System.in);
        System.out.println("Enter The Number: ");
        int num  = x.nextInt();
        System.out.println("Your Number is: "+(isPrime(num)?"Prime":"Not Prime"));
    }
    public static boolean isPrime(int num){
        for (int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
