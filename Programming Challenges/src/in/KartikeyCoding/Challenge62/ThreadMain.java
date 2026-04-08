package in.KartikeyCoding.Challenge62;

public class ThreadMain {
    static void main(String[] args) {
        printThread t1 = new printThread(1);
        printThread t2 = new printThread(2);
        printThread t3 = new printThread(3);

        try{
            t1.start();
            t1.join();
            t2.start();
            t2.join();
            t3.start();
        }
        catch (InterruptedException ie){
            System.out.println("Exception Occurs: "+ie.getMessage());
        }

    }
}
