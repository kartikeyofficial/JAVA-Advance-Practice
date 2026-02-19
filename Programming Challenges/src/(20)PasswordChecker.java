import java.util.Scanner;

class PasswordChecker {
    public static boolean isValidPassword(String password){

      return password.length()>6;
    }
    static void main(String[] args) {
        System.out.println("Welcome to Password Checker\n");
        Scanner x= new Scanner(System.in);
        String password;
        do{
            System.out.println("Please Enter Your Password: ");
            password = x.next();
        }while (!isValidPassword(password));
        System.out.println("Thanks for Enter Valid Password");
    }
}
