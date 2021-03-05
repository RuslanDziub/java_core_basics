package com.company.core.homework7.task2.car;

public class Body {
    private String color;
    private String material;
    private double price;
    private String modification;

    public Body () {
        this.color = "gray";
        this.material = "metal";
        this.price = 50000;
        this.modification = "standart";
    }

    public Body (String color, String material, double price, String modification) {
        this.color = color;
        this.material = material;
        this.price = price;
        this.modification = modification;
    }

    public void bodyModification (String modification) {
        this.modification = modification;
        switch (this.modification) {
            case "standart": {
                this.color = "gray";
                this.material = "metal";
                this.price = 40000;
                break;
            }
            case "premium": {
                this.color = "white";
                this.material = "aluminium";
                this.price = 50000;
                break;
            }
            case "luxiry": {
                this.color = "black";
                this.material = "carbon";
                this.price = 60000;
                break;
            }
            default: {
                System.out.println("Error modification!");
                break;
            }
        }
    }

    public void setColor (String color) { this.color = color; }

    public String getColor () { return this.color; }

    public void setMaterial (String material) { this.material = material; }

    public String getMaterial () { return this.material; }

    public void setPrice (double price) { this.price = price; }

    public double getPrice () { return this.price; }

    public void setModification (String modification) { this.modification = modification; }

    public String getModification () { return this.modification; }
}
