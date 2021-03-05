package com.company.core.homework7.task2.car;

public class Helm {
    private int diametr;
    private String material;
    private double price;
    private String modification;

    public Helm () {
        this.diametr = 30;
        this.material = "fabric";
        this.price = 15000;
        this.modification = "standart";
    }

    public Helm (int diametr, String material, int price, String modification) {
        this.diametr = diametr;
        this.material = material;
        this.price = price;
        this.modification = modification;
    }

    public void helmModification (String modification) {
        this.modification = modification;
        switch (this.modification) {
            case "standart": {
                this.diametr = 30;
                this.material = "fabric";
                this.price = 10000;
                break;
            }
            case "premium": {
                this.diametr = 28;
                this.material = "leather";
                this.price = 12000;
                break;
            }
            case "luxiry": {
                this.diametr = 26;
                this.material = "alcantare";
                this.price = 15000;
                break;
            }
            default: {
                System.out.println("Error helm modification!");
                break;
            }
        }
    }

    public void setDiametr (int diametr) {
        this.diametr = diametr;
    }

    public int getDiametr () {
        return this.diametr;
    }

    public void setMaterial (String material) { this.material = material; }

    public String getMaterial () { return this.material; }

    public void setPrice (double price) { this.price = price; }

    public double getPrice () { return this.price; }

    public void setModification (String modification) { this.modification = modification; }

    public String getModification () { return this.modification; }
}
