package Revision.ToString;

public class Student {
    String name;
    int age ;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString(){
        return "The Name of the Student is: "+name
                +"\nAnd Also Age of Student is: "+age;
    }

    static void main(String[] args) {
        Student s1 = new Student("Kartikey",22);
        System.out.println(s1.toString());
    }
}
