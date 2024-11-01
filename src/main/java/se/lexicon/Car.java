package se.lexicon;

import java.util.UUID;

public class Car {

    private String regNumber;
    private String brand;
    private String model;
    private int year;
    private String color;

    public void setBrand(String brand) {
        if(brand == null || brand.trim().isEmpty())
            throw new IllegalArgumentException("Brand cannot be null or empty");
        this.brand = brand;
    }

    public void generationId(){
        this.regNumber = UUID.randomUUID().toString();
    }

    /*
    public void setRegNumber(String regNumber) {
        if(regNumber == null || regNumber.trim().isEmpty())
            throw new IllegalArgumentException("RegNumber cannot be null or empty");
        this.regNumber = regNumber;
    }*/

    public void setModel(String model) {
        if(model == null || model.trim().isEmpty())
            throw new IllegalArgumentException("Model cannot be null or empty");
        this.model = model;
    }


    public String getCarInfo(){
        return "Car info -> " + "# " + regNumber + ",  brand: " + brand + ", model: " + model;
    }
}
