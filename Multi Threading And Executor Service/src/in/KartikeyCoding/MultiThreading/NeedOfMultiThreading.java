package in.KartikeyCoding.MultiThreading;

public class NeedOfMultiThreading {
    static void main(String[] args) {
       long startTime = System.currentTimeMillis();
        for (int i=1;i<=1000;i++){
            System.out.print(i+"* ");
        }
        System.out.println("\nFirst Task is Completed!");

        for (int i=1;i<=1000;i++){
            System.out.print(i+"$ ");
        }
        System.out.println("\nSecond Task is Completed!");

        for (int i=1;i<=1000;i++){
            System.out.print(i+"# ");
        }
        System.out.println("\nThird Task is Completed!");

        for (int i=1;i<=1000;i++){
            System.out.print(i+"@ ");
        }
        System.out.println("\nFourth Task is Completed!");

        long endTime = System.currentTimeMillis();
        System.out.println("Total Time Taken: "+((endTime-startTime)));

    }
}
