package in.KartikeyCoding.Challenge63;

public class TestTrafficLight {
    static void main(String[] args) {
        TrafficLightThread t1 = new TrafficLightThread(TrafficColor.RED);
        TrafficLightThread t2 = new TrafficLightThread(TrafficColor.YELLOW);
        TrafficLightThread t3 = new TrafficLightThread(TrafficColor.GREEN);

        try {
            t1.start();
            t1.join();
            t2.start();
            t2.join();
            t3.start();
        }catch (InterruptedException ie){
            System.out.println("Exception Occurs: "+ie.getMessage());
        }
    }
}
