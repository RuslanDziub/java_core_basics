package com.company.core.lab.enums.test2;

public class Scholar {

    private ScholarSchedule schedule;
    private boolean goToSchool;

    public void wakeUp() {

        if (this.schedule.getDayOfWeek() == DayOfWeek.SUNDAY) {
            System.out.println("I am sleepy");
        } else {
            System.out.println("I am going to school");
        }
    }
}
