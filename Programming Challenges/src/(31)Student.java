class Student {
   String name;
   int age;
   int rollNo;
   String House;

    public Student(String name, int age, int rollNo, String House) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        this.House = House;
    }
    public String toString(){
        return "Student Details:{name:"+name+"" +
                ", age:"+age+", " +
                "rollNo:"+rollNo+"," +
                " House:"+House+" }";
    }

    static void main(String[] args) {
        Student std = new Student("Kumar Kartikey",21,73,"IEC Hostel");
        System.out.println(std);
    }
}
