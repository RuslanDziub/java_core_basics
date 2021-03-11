package com.company.core.lab.enums.test2;

public enum DayOfWeek {

    SUNDAY ("Sunday"),
    MONDAY ("Monday"),
    TUESDAY ("Tuesday"),
    WEDNESDAY ("Wednesday"),
    THURSDAY ("Thursday"),
    FRIDAY ("Friday"),
    SATURDAY ("Saturday");

    private String title;

    DayOfWeek(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "DayOfWeek{" +
                "title='" + title + '\'' +
                '}';
    }
}
