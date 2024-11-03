package se.lexicon;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


        Car car1 = new Car("volvo" , "D80" , 2019);
        car1.setBrand("Reno");
        Car car2 = new Car("BMW" , "D81");

        System.out.println(car1.getCarInfo());
        System.out.println(car2.getCarInfo());





    }
    }