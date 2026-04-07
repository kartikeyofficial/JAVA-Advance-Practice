package in.KartikeyCoding.Synchronize;

public class TestingSynchronize {
    static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        Counter counnter = new Counter();
        updaterThread t1 = new updaterThread(counnter);
        updaterThread t2 = new updaterThread(counnter);


        try {
            t1.start();
            t2.start();

            t1.join();
            t2.join();
        } catch(InterruptedException e){
            System.out.println("Thread Interrupted: "+e.getMessage());
        }
        long endTime = System.currentTimeMillis();
        long totalTime = (endTime-startTime);
        System.out.println("Final Counter Value: "+counnter.getCount()+" and Time Taken: "+totalTime);

    }
}
