package in.KartikeyCoding.MultiThreading.Runnable;

public class PrintTask implements Runnable{
    @Override
    public void run() {

        for (int i=1;i<=1000;i++){
            System.out.print(i+targetChar);
        }
        System.out.println("\nTask is Completed!"+ Thread.currentThread().getName()+targetChar);
    }
    private final char targetChar ;
    public PrintTask(char targetChar){
        this.targetChar = targetChar;
    }
}
