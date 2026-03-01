package in.kgCoding.Equals;

public class equalsandHashcodeTest {
    static void main(String[] args) {
        person Person1 = new person("Kumar Kartikey",21,"2300900100073");
        person Person2 = new person("Kumar Kartikey",21,"2300900100073");

        if (Person1.equals(Person2)){
            System.out.println("Equals");
        }
        else {
            System.out.println("Not Equals");
        }
    }
}
