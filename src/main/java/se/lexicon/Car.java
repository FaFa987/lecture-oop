package se.lexicon;

import java.time.LocalDate;
import java.util.UUID;

public class Car {

    private String regNumber;
    private String brand;
    private String model;
    private int year;
    private String color;
    private Person owner;

    private void generationId(){
        this.regNumber = UUID.randomUUID().toString();
    }

    public void setBrand(String brand) {
        if(brand == null || brand.trim().isEmpty())
            throw new IllegalArgumentException("Brand cannot be null or empty");
        this.brand = brand;
    }

    public void setModel(String model) {
        if(model == null || model.trim().isEmpty())
            throw new IllegalArgumentException("Model cannot be null or empty");
        this.model = model;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public String getBrand() {
        return brand;
    }
    public void setOwner(Person owner){
        this.owner = owner;
    }

    public Car(String brand, String model, int year) {
        this.generationId();
        this.setBrand(brand);
        this.setModel(model);
        this.year = year;
    }
    public  Car(String brand, String model){
        this(brand, model, LocalDate.now().getYear());
    }

    public String getCarInfo(){
        //return "Car info -> " + "# " + regNumber + ",  brand: " + brand + ", model: " + model + ", year: " + year;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Car info -> ");
        sb2.append("# ");
        sb2.append(regNumber);
        sb2.append(",  brand: ");
        sb2.append(brand);
        sb2.append(", model: ");
        sb2.append(model);
        sb2.append(", year: ");
        sb2.append(year);

        if(owner != null){
            sb2.append(", owner: ");
            sb2.append(owner.getName());
        }else {
            sb2.append(" No Owner");
        }


        return sb2.toString();
    }
}
