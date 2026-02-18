import java.util.Scanner;

class calculatorSwitch {
    static void main(String[] args) {
        System.out.println("welcome to Calculator\n");
        Scanner x = new Scanner(System.in);
        System.out.println("Enter The First Number: ");
        int num1 = x.nextInt();
        System.out.println("Enter The Second Number: ");
        int num2 = x.nextInt();
        System.out.println("Enter The Operator (+,-,*,/): ");
        String operator = x.next();
        int result = switch (operator){
            case "+"-> num1+num2;
            case "-"-> num1-num2;
            case "*"-> num1*num2;
            case "/"-> num1/num2;
            default -> 0;
        };
        System.out.println("Your Answer is: "+result);
    }
}
