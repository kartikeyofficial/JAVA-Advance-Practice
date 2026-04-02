package in.KartikeyCoding.MultiThreading.ThreadClass;

public class extendingThread {
    static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        FirstTask t1 = new FirstTask();
        SecondTask t2 = new SecondTask();
        ThirdTask t3 = new ThirdTask();
        FourthTask t4 = new FourthTask();

        System.out.println("\nStarting First Thread");
        t1.start();
        System.out.println("\nStarting Second Thread");
        t2.start();
        System.out.println("\nStarting Third Thread");
        t3.start();
        System.out.println("\nStarting Fourth Thread");
        t4.start();
        long endTime = System.currentTimeMillis();
        System.out.println("Total Time Taken: "+((endTime-startTime)));
    }
}
