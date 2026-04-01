package in.KartikeyCoding.ENUM;

public class TestingEnums {
    static void main(String[] args) {
        TrafficLight color= TrafficLight.RED;
        System.out.println(color);

//        Grades grade = Grades.C;
//        System.out.println(grade);
        Grades grade = Grades.valueOf("C");
        System.out.println(grade);

        for (Grades value : Grades.values()) {
            System.out.print(value+",");

        }
    }

}
