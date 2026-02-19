import java.util.Scanner;

class ExitTheProgram {
    static void main(String[] args) {
        System.out.println("Welcome to Exit Keyword Program\n");
        Scanner x = new Scanner(System.in);
        while(true){
            System.out.println("Enter The Command: ");
            String command = x.next();
            if(command.equalsIgnoreCase("exit")){
                break;
            }
        }
        System.out.println("You Have Successfully Exit");
    }
}
