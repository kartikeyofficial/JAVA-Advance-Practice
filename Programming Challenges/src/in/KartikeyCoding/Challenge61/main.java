package in.KartikeyCoding.Challenge61;

public class main {
    static void main(String[] args)throws InterruptedException {
        ThreadState t1 = new ThreadState();
        System.out.println("Created the Thread: "+t1.getState());
        t1.start();
         t1.join(); // join ka matalab hai ki jab tak t1 object khatam na ho gaya ho tab tak wait karega.
        System.out.println("Thread Finished: "+t1.getState());
    }
}
