package se.lexicon;

public class Car {

    String regNumber;
    String brand;
    String model;
    int year;
    String color;

    public String getCarInfo(){
        return "Car info -> " + "# " + regNumber + ",  brand: " + brand + ", model: " + model;
    }
}
