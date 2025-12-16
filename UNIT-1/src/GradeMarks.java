import java.util.Scanner;

public class GradeMarks {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Welcome To The Grade Basis Calculator\n");
        System.out.println("Enter The Percentage Of Student Marks:");
        float marks = x.nextFloat();

        if(marks >= 90 ){
            System.out.println("Grade-A");
        } else if (marks >=75 ) {
            System.out.println("Grade-B");
        } else if (marks >=60 ) {
            System.out.println("Grade-C");
        } else if(marks >=30  ){
            System.out.println("Grade-D");
        } else{
            System.out.println("Grade-F (FAIL)");
        }
    }
}
