public class learningIf {
    public static void main(String[] args) {
        boolean is_male= false;
        String name= "Kartikey";
        System.out.println("Before If:");
        System.out.println(name);
        if(is_male){
            System.out.println("After If:");
            System.out.println("Mr. "+name);
        }
        else
        {
            System.out.println("After else:");
            System.out.println("Mrs. "+name);
        }

    }
}
