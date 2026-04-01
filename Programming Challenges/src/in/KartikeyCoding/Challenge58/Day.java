package in.KartikeyCoding.Challenge58;

public enum Day {
    SUNDAY(false),
    MONDAY(true),
    TUESDAY(true),
    WEDNESDAY(true),
    THURSDAY(true),
    FRIDAY(true),
    SATURDAY(false);

    private final boolean isWeekDay;

    Day(boolean isWeekDay) {
        this.isWeekDay = isWeekDay;
    }


    public String getType(){
        return  isWeekDay ? "WeekDay" : "Weekend";
    }
}
