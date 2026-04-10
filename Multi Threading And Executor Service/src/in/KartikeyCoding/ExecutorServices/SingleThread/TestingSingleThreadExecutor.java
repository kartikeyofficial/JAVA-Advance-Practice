package in.KartikeyCoding.ExecutorServices.SingleThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestingSingleThreadExecutor {
    static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        PrintTaskThread task1 = new PrintTaskThread('*');
        PrintTaskThread task2 = new PrintTaskThread('$');
        PrintTaskThread task3 = new PrintTaskThread('#');

        service.submit(task1);
        service.submit(task2);
        service.submit(task3);
        service.shutdown();
    }
}
