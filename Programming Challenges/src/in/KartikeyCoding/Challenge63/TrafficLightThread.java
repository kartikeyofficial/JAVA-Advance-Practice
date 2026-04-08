package in.KartikeyCoding.Challenge63;

import java.net.FileNameMap;

public class TrafficLightThread extends Thread{
    private final TrafficColor color;

    public  TrafficLightThread(TrafficColor color){
        this.color = color;
    }

    @Override
    public void run() {
        System.out.println(color+" is Active\n");
        try {
            Thread.sleep(color.getOnTimeInMills());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(color+" is Inactive Now!");
    }
}
