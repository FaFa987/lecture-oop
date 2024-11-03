package se.lexicon;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Person {
    //fields
    private static int sequencer = 100;
    private long personId;
    private String name;
    private LocalDate birthDate;
    private String email;
    private String address;

    //constructors


    public Person(String name, String email, LocalDate birthDate, String address) {
        this(name, birthDate, email);
        this.setAddress(address);
    }

    public Person(String name, LocalDate birthDate, String email) {
        this(name,birthDate);
        this.setEmail(email);
    }

    public Person(String name, LocalDate birthDate) {
        this.personId = ++sequencer;
        this.setName(name);
        this.birthDate = Objects.requireNonNull(birthDate, "birthDate cannot be null");
    }
    //Method


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = Objects.requireNonNull(name, "Name cannot be null");
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = Objects.requireNonNull(email, "Email cannot be null");
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = Objects.requireNonNull(address, "Address cannot be null");
    }

    public int getAge() {
        //return LocalDate.now().getYear() - birthDate.getYear();
        return Period.between(birthDate, LocalDate.now()).getYears();
    }


    public String getPersonId(){
        StringBuilder sb = new StringBuilder();
        sb.append("Person Info > ");
        sb.append("Id:  ");
        sb.append(personId);
        sb.append(", Name: ");
        sb.append(name);
        return sb.toString();
    }
}
