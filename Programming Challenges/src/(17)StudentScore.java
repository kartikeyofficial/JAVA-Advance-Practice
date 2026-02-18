import java.util.Scanner;

class StudentScore {
    static void main(String[] args) {
        System.out.println("Welcome to Student Score\n");
        Scanner x = new Scanner(System.in);
        System.out.print("Enter The Marks Of Student:");
        int marks = x.nextInt();
        String grade = marks>80? "High Marks": (marks>=50 && marks<=80) ? "Moderate marks":"Low";
        System.out.println("Student Marks is: "+grade);
    }
}
