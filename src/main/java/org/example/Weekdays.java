package org.example;

public enum Weekdays {

    MONDAY("Workday", true),
    TUESDAY("Workday", true),
    WEDNESDAY("Workday", false),
    THURSDAY("Workday", true),
    FRIDAY("Workday", true),
    SATURDAY("Weekend", false),
    SUNDAY("Weekend", false);

    private final String value;
    private final boolean hasToWork;

    //Wird nur vom System aufgerufen
    Weekdays(String value, boolean hasToWork) {
        this.value = value;
        this.hasToWork = hasToWork;
    }

    public String getValue() {
        return value;
    }

    public boolean isHasToWork() {
        return hasToWork;
    }
}
