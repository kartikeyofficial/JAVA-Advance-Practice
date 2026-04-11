package in.KartikeyCoding.Challenge64;

public class printRunnable implements Runnable{
    @Override
    public void run() {
        Thread current = Thread.currentThread();
        for (int i=1;i<=10;i++){
            System.out.print(i+""+symbol+" ");
        }
        System.out.println("Thread is Completed! "+current.getName());

    }
    private final char symbol;

    public printRunnable(char symbol) {
        this.symbol = symbol;
    }
}
