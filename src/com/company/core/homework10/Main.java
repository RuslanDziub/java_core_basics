package com.company.core.homework10;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Print month: ");
        String month = scanner.next();

        while (true) {
            System.out.println("=========================================================");
            System.out.println("Enter operation:");
            System.out.println("1. Is there such a month?");
            System.out.println("2. Show all months from the same season.");
            System.out.println("3. Show all months with the same number of days.");
            System.out.println("4. Show all months with fever days.");
            System.out.println("5. Show all months thet have more days.");
            System.out.println("6. Show next season.");
            System.out.println("7. Show previous season.");
            System.out.println("8. Show all mounths that have an even number of days.");
            System.out.println("9. Show all mounths that have an odd number of days.");
            System.out.println("10. Check if the entered month has an even number of days.");
            System.out.println("To exit, press: exit.");
            System.out.print("Operation: ");
            String operation = scanner.next().toLowerCase(Locale.ROOT);
            System.out.println("=========================================================");

            switch (operation) {
                case "1": {
                    boolean availability = false;
                    for(Months months : Months.values()) {
                        if(months.name().equalsIgnoreCase(month)) {
                            availability = true;
                            System.out.println("Yes");
                            break;
                        }
                    }
                    if (!availability) {
                        System.out.println("No");
                    }
                    break;
                }
                case "2": {
                    String season = "";
                    for(Months months : Months.values()) {
                        if(months.name().equalsIgnoreCase(month)) {
                            season = months.getSeason().name();
                            System.out.println("Season is " + season);
                            break;
                        }
                    }
                    for(Months months : Months.values()) {
                        if(months.getSeason().name().equals(season)) {
                            if (months.name().equalsIgnoreCase(month)) {
                                continue;
                            }
                            System.out.println(months.name());
                        }
                    }
                    break;
                }
                case "3": {
                    int day = 0;
                    for(Months months : Months.values()) {
                        if(months.name().equalsIgnoreCase(month)) {
                            day = months.getDay();
                            System.out.println(day + " days a month");
                            break;
                        }
                    }
                    for(Months months : Months.values()) {
                        if(months.getDay() == day) {
                            if (months.name().equalsIgnoreCase(month)) {
                                continue;
                            }
                            System.out.println(months.name());
                        }
                    }
                    break;
                }
                case "4": {
                    int day = 0;
                    for(Months months : Months.values()) {
                        if(months.name().equalsIgnoreCase(month)) {
                            day = months.getDay();
                            System.out.println(day + " days a month");
                            break;
                        }
                    }
                    for(Months months : Months.values()) {
                        if(months.getDay() < day) {
                            if (months.name().equalsIgnoreCase(month)) {
                                continue;
                            }
                            System.out.println(months.name() + ": " + months.getDay() + " days");
                        }
                    }
                    break;
                }
                case "5": {
                    int day = 0;
                    for(Months months : Months.values()) {
                        if(months.name().equalsIgnoreCase(month)) {
                            day = months.getDay();
                            System.out.println(day + " days a month");
                            break;
                        }
                    }
                    for(Months months : Months.values()) {
                        if(months.getDay() > day) {
                            if (months.name().equalsIgnoreCase(month)) {
                                continue;
                            }
                            System.out.println(months.name() + ": " + months.getDay() + " days");
                        }
                    }
                    break;
                }
                case "6": {
                    int indexSeason = 0;
                    for(Months months : Months.values()) {
                        if(months.name().equalsIgnoreCase(month)) {
                            indexSeason = months.getSeason().ordinal();
                            if (indexSeason == Seasons.values().length - 1) {
                                indexSeason = 0;
                            } else {
                                indexSeason++;
                            }
                            System.out.println("Season is " + months.getSeason().name());
                            System.out.println("Next season is " + Seasons.values()[indexSeason]);
                            break;
                        }
                    }
                    break;
                }
                case "7": {
                    int indexSeason = 0;
                    for(Months months : Months.values()) {
                        if(months.name().equalsIgnoreCase(month)) {
                            indexSeason = months.getSeason().ordinal();
                            if (indexSeason == 0) {
                                indexSeason = Seasons.values().length - 1;
                            } else {
                                indexSeason--;
                            }
                            System.out.println("Season is " + months.getSeason().name());
                            System.out.println("Previous season is " + Seasons.values()[indexSeason]);
                            break;
                        }
                    }
                    break;
                }
                case "8": {
                    System.out.println("Months that have an even number of days:");
                    for(Months months : Months.values()) {
                        if(months.getDay() % 2 == 0) {
                            System.out.println(months.name() + " " + months.getDay() + " days");
                        }
                    }
                    break;
                }
                case "9": {
                    System.out.println("Months that have an odd number of days:");
                    for(Months months : Months.values()) {
                        if(months.getDay() % 2 != 0) {
                            System.out.println(months.name() + " " + months.getDay() + " days");
                        }
                    }
                    break;
                }
                case "10": {
                    for(Months months : Months.values()) {
                        if(months.name().equalsIgnoreCase(month)) {
                            if(months.getDay() % 2 == 0) {
                                System.out.println(months.name() + " have an even number of days:");
                                System.out.println(months.name() + " " + months.getDay() + " days");
                            } else {
                                System.out.println(months.name() + " have an odd number of days:");
                                System.out.println(months.name() + " " + months.getDay() + " days");
                            }
                            break;
                        }
                    }
                    break;
                }
                case "exit": {
                    return;
                }
                default: {
                    System.out.println("!!!!!!!!!!!!!!!!!!!Incorrect operation!!!!!!!!!!!!!!!!!!!");
                    break;
                }
            }
        }
    }
}
