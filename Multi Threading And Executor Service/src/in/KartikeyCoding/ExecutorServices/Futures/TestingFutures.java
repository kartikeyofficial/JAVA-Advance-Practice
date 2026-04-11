package in.KartikeyCoding.ExecutorServices.Futures;

import java.util.concurrent.*;

public class TestingFutures {
    static void main(String[] args)throws InterruptedException, ExecutionException {
        ExecutorService service  = Executors.newFixedThreadPool(4);
        fetchName kar = new fetchName("Kartikey");
        fetchName har = new fetchName("Harshit");
        fetchName aman = new fetchName("Aman");
        fetchName rohit = new fetchName("Rohit");

        Future<String> name1 = service.submit(kar);
        Future<String> name2 = service.submit(har);
        Future<String> name3 = service.submit(aman);
        Future<String> name4 = service.submit(rohit);

        System.out.println("Full name is: "+name1.get());
        System.out.println("Full name is: "+name2.get());
        System.out.println("Full name is: "+name3.get());
        System.out.println("Full name is: "+name4.get());

        service.shutdownNow();

    }
}
