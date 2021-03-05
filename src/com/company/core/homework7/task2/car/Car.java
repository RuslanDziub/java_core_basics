package com.company.core.homework7.task2.car;

public class Car {
    private String mark;
    private String model;
    private String complektation;
    private double price;
    private Helm helm = new Helm();
    private Wheel wheel = new Wheel();
    private Body body = new Body();

    public Car (String mark, String model, String complektation) {
        this.mark = mark;
        this.model = model;
        this.complektation = complektation;
        switch (this.complektation) {
            case "standart": {
                helm.helmModification(this.complektation);
                wheel.wheelModification(this.complektation);
                body.bodyModification(this.complektation);
                this.price = (helm.getPrice() + wheel.getPrice() + body.getPrice()) * 1.5;
                break;
            }
            case "premium": {
                helm.helmModification(this.complektation);
                wheel.wheelModification(this.complektation);
                body.bodyModification(this.complektation);
                this.price = (helm.getPrice() + wheel.getPrice() + body.getPrice()) * 1.5;
                break;
            }
            case "luxiry": {
                helm.helmModification(this.complektation);
                wheel.wheelModification(this.complektation);
                body.bodyModification(this.complektation);
                this.price = (helm.getPrice() + wheel.getPrice() + body.getPrice()) * 1.5;
                break;
            }
            default: {
                System.out.println("Error complectation!");
                break;
            }
        }
    }

    public void showCar () {
        System.out.println("mark: " + this.mark + "\n" +
                            "model: " + this.model + "\n" +
                            "complektation: " + this.complektation + "\n" +
                            "price: " + this.price);
    }

    public void setMark (String mark) { this.mark = mark; }

    public String getMark () { return this.mark; }

    public void setModel (String model) { this.model = model; }

    public String getModel () { return this.model; }

    public void setComplektation (String complektation) { this.complektation = complektation; }

    public String getComplektation () { return this.complektation; }

    public void setPrice (double price) { this.price = price; }

    public double getPrice () { return this.price; }
}
