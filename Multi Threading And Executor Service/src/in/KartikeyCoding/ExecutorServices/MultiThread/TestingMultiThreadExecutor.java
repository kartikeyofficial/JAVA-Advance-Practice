package in.KartikeyCoding.ExecutorServices.MultiThread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestingMultiThreadExecutor {
    static void main(String[] args) throws InterruptedException{
        ExecutorService service = Executors.newFixedThreadPool(3);
        PrintTaskMultiThreads t1 = new PrintTaskMultiThreads('*');
        PrintTaskMultiThreads t2 = new PrintTaskMultiThreads('$');
        PrintTaskMultiThreads t3 = new PrintTaskMultiThreads('#');

        service.submit(t1);
        service.submit(t2);
        service.submit(t3);

        service.shutdown();
        System.out.println("************1");
        if (!service.awaitTermination(10, TimeUnit.SECONDS)){
            System.out.println("****************2");
            service.shutdownNow();
        }


    }
}
