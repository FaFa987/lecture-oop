package se.lexicon;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Car volvo = new Car();
        volvo.generationId();
        volvo.setBrand("PO14");
        volvo.setModel("20M");


        Car car1 = new Car();
        car1.generationId();
        car1.setBrand("K500");

        System.out.println(volvo.getCarInfo());
        System.out.println(car1.getCarInfo());


    }
    }