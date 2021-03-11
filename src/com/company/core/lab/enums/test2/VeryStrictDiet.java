package com.company.core.lab.enums.test2;

public class VeryStrictDiet {

    public void takeLunch(DayOfWeek dayOfWeek) {

        switch (dayOfWeek) {

            case SUNDAY:
                System.out.println("Воскресний обед сегодня даже можно немного сладкого");
            case MONDAY:
                System.out.println("Обед для понедельника: куриная лапка");
            case TUESDAY:
                System.out.println("Вторник сегодня суп из силдерея :(");
                //..................
        }
    }
}
