package com.company.basics.homework3;

public class Class01 {
    public static void main(String[] args) {
        String day = "Mon";

        switch (day){
            case "Mon": {
                System.out.println("Go to Logos");
                break;
            }
            case "Tue": {
                System.out.println("Go to the GYM");
                break;
            }
            case "Wed": {
                System.out.println("Go to the Logos");
                break;
            }
            case "Thu": {
                System.out.println("Go to the GYM");
                break;
            }
            case "Fri": {
                System.out.println("Go to the Logos");
                break;
            }
            case "Sut": {
                System.out.println("Go to the GYM");
                break;
            }
            case "Sun": {
                System.out.println("Go to the sona");
                break;
            }
            default: {
                System.out.println("Incorrect day of the week!!!");
                break;
            }
        }
    }
}
