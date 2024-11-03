package se.lexicon;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    //fields
    private String personId;
    private String name;
    private LocalDate birthDate;
    private String email;
    private String address;
    //constructors


    public Person(String name, String email, LocalDate birthDate, String address) {
        this(name, birthDate, email);
        this.address = address;
    }

    public Person(String name, LocalDate birthDate, String email) {
        this(name,birthDate);
        this.email = email;
    }

    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }
    //Method


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public int getAge() {
        //return LocalDate.now().getYear() - birthDate.getYear();
        return Period.between(birthDate, LocalDate.now()).getYears();
    }
}
