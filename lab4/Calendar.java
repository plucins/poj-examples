package lab4;

public class Calendar {
    DaysOfWeek daysOfWeek;
    private int month;
    private int year;

    public Calendar(DaysOfWeek daysOfWeek, int month, int year) {
        this.daysOfWeek = daysOfWeek;
        this.month = month;
        this.year = year;
    }

    public DaysOfWeek getDaysOfWeek() {
        return daysOfWeek;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
}
