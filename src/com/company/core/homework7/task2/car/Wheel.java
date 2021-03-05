package com.company.core.homework7.task2.car;

public class Wheel {
    private int size;
    private String material;
    private double price;
    private String modification;

    public Wheel () {
        this.size = 18;
        this.material = "aluminium";
        this.price = 10000;
        this.modification = "standart";
    }

    public Wheel (int size, String material, double price, String modification) {
        this.size = size;
        this.material = material;
        this.price = price;
        this.modification = modification;
    }

    public void wheelModification (String modification) {
        this.modification = modification;
        switch (this.modification) {
            case "standart": {
                this.size = 18;
                this.material = "metal";
                this.price = 10000;
                break;
            }
            case "premium": {
                this.size = 20;
                this.material = "titan";
                this.price = 12000;
                break;
            }
            case "luxiry": {
                this.size = 22;
                this.material = "chrom";
                this.price = 15000;
                break;
            }
            default: {
                System.out.println("Error wheel modification!");
                break;
            }
        }
    }

    public void setSize (int size) { this.size = size; }

    public int getSize () { return this.size; }

    public void setMaterial (String material) { this.material = material; }

    public String getMaterial () { return this.material; }

    public void setPrice (double price) { this.price = price; }

    public double getPrice () { return this.price; }

    public void setModification (String modification) { this.modification = modification; }

    public String getModification () { return this.modification; }
}
