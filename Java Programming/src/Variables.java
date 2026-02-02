import java.util.Scanner;
class Variable{
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter The First Number:");
        int c= x.nextInt();
        System.out.println("Enter Your Second Number:");
        int a= x.nextInt();
        System.out.println("Enter Your Third Number:");
        int b=x.nextInt();
        System.out.println("The Addition of Three Numbers are:"+(a+b+c));
        float myfloat=5.0f;
        System.out.println(myfloat);

        boolean isvegeterian = true;
        System.out.println(isvegeterian);

        double myDouble = 5.7678615278;
        System.out.println(myDouble);
        String str="Good Morning";
        System.out.println(str);

    }
}