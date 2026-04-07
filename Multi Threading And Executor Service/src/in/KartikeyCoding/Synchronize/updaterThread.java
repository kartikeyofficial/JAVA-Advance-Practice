package in.KartikeyCoding.Synchronize;

public class updaterThread extends Thread{
    private final Counter counter;

    public updaterThread(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i=0;i<10000;i++){
            counter.increament();
        }
    }
}
