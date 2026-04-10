package in.KartikeyCoding.ExecutorServices.MultiThread;

public class PrintTaskMultiThreads implements  Runnable{
    @Override
    public void run() {
        for (int i=1;i<=100;i++){
            System.out.print(i+""+targetChar+" ");
        }
        System.out.println("\n"+Thread.currentThread().getName()+" "+targetChar+" Task Completed");
    }

    private final char targetChar;
    public PrintTaskMultiThreads(char targetChar){
        this.targetChar = targetChar;
    }
}
