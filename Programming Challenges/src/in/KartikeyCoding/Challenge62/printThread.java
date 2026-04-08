package in.KartikeyCoding.Challenge62;

public class printThread extends Thread{
    private final int threadNumber;

    public printThread(int threadNumber){
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" Thread Starting: "+threadNumber);
        try{
            Thread.sleep(5000);
        }
        catch (InterruptedException ie){
            System.out.println("Exception Occurs: "+ie.getMessage());
        }

        System.out.println(Thread.currentThread().getName()+" Thread Ending: "+threadNumber);
    }
}
