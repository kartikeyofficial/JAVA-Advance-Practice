package in.KartikeyCoding.Challenge42;

public class test {
    static void main(String[] args) {
        Person person1 = new Person("Kartikey",21);
        Person person2 = new Person("Kartikey",21);
        if (person1.equals(person2)){
            System.out.println("Equals");
        }
        else {
            System.out.println("Not Equals");
        }
    }
}
