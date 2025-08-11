package org.example;

public class Computer {
    String brand;
    int ramInGB;
    static int i = 1;

    public Computer(){
        this.brand = "Generic";
        this.ramInGB = 8;
    }

    public Computer(String brand){
        this();
        this.brand = brand;
    }

    public Computer(String brand, int ramInGB){
        this.ramInGB = ramInGB;
        this.brand = brand;
    }

    public void display(){
        System.out.println("Computer " + i + ": Brand = " + brand + ", RAM = " + ramInGB + "GB");
        ++i;
    }
}


