package in.KartikeyCoding.ExecutorServices.SingleThread;

public class PrintTaskThread implements  Runnable{
    @Override
    public void run() {
        for (int i=1;i<=10000;i++){
            System.out.print(i+""+targetChar+" ");
        }
        System.out.println("\n"+Thread.currentThread().getName()+" "+targetChar+" Task Completed");
    }

    private final char targetChar;
    public PrintTaskThread(char targetChar){
        this.targetChar = targetChar;
    }
}
