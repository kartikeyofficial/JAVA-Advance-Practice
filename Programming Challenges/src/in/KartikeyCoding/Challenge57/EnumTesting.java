package in.KartikeyCoding.Challenge57;

public class EnumTesting {
    static void main(String[] args) {
        Day day = Day.MONDAY;
        System.out.println(day);
        System.out.println("\nAll days of the Week\n");
        for (Day value : Day.values()) {
            System.out.println(value);
        }
    }
}
