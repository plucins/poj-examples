package lab4;

public enum DaysOfWeek {
    PON("Poniedziałek", true),
    WT("Wtorek", true),
    SR("Środa", true),
    CZW("Czwartek" , true),
    PT("Piątek", true),
    SO("Sobota", false),
    ND("Niedziela", false);

    private String fullNameInPolish;
    private boolean isWorkingWeekDay;

    DaysOfWeek(String fullNameInPolish, boolean isWorkingWeekDay) {
        this.fullNameInPolish = fullNameInPolish;
        this.isWorkingWeekDay = isWorkingWeekDay;
    }

    public String getFullNameInPolish() {
        return fullNameInPolish;
    }

    public boolean isWorkingWeekDay() {
        return isWorkingWeekDay;
    }

    @Override
    public String toString(){
        return "Dzień tygodnia " + fullNameInPolish;
    }
}
