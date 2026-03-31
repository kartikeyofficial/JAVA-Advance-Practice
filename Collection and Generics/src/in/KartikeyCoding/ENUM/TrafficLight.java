package in.KartikeyCoding.ENUM;

public enum TrafficLight {
    RED("Stop"), GREEN("Go"), YELLOW("Wait");

    private final String action;

    TrafficLight(String action) {
        this.action = action;
    }

}
