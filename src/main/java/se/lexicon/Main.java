package se.lexicon;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Car bmwX6 = new Car();
        bmwX6.regNumber = "ABC1";
        bmwX6.brand = "BMW";
        bmwX6.model = "X6";
        bmwX6.color = "black";


        System.out.printf(bmwX6.getCarInfo());


    }
    }