public class Function {
    public static void main(String[] args) {
        System.out.println("In Main Method");
        greetUser();
        System.out.println("Complete Callling The Method");
        printFirstPatter();
    }

    public static void greetUser(){
        System.out.println("Good Morning from Kartikey");
    }
    public static void printFirstPatter(){
        int rows = 0;
        while(rows<20){
            System.out.print("*");
            int i= 0;
            while(i<rows){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }
    }
}
