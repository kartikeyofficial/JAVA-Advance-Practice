package in.KartikeyCoding.ExecutorServices.Futures;

import java.util.concurrent.Callable;

public class fetchName implements Callable<String> {
    private final String name;

    public fetchName(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(4000);
        return name+ " Bhartiy";

    }
}
