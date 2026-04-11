package in.KartikeyCoding.Challenge64;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class singleThread {
    static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        printRunnable t1 = new printRunnable('*');
        printRunnable t2 = new printRunnable('#');
        printRunnable t3 = new printRunnable('$');

        service.submit(t1);
        service.submit(t2);
        service.submit(t3);

        service.shutdown();

    }
}
