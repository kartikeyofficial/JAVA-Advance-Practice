package in.KartikeyCoding.Challenge63;

public enum TrafficColor {
    RED(9000),
    YELLOW(1000),
    GREEN(3000);

    private int onTimeInMills;

    public int getOnTimeInMills(){
        return onTimeInMills;
    }
     TrafficColor(int onTimeInMills){
        this.onTimeInMills = onTimeInMills;
    }
}
