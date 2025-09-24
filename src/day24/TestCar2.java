package day24;

public class TestCar2 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.name = "BMW";
        c1.price = 90000;
        c1.color = "Red";


        System.out.println("Name of Car C1:: " + c1.name + "\nPrice: " + c1.price + "\nColor: " + c1.color + "\nWheels: ");

        Car c2 = new Car();
        c2.name = "Audi";
        c2.price = 80000;
        c2.color = "White";

        System.out.println("Name of Car C2:: " + c2.name + "\nPrice: " + c2.price + "\nColor: " + c2.color + "\nWheels: ");

        Car c3 = new Car();
        c3.name = "Tesla";
        c3.price = 70000;
        c3.color = "Black";
        System.out.println("Name of Car C3::" + c3.name + "\nPrice: " + c3.price + "\nColor: " + c3.color + "\nWheels: " );

    }
}


// Common Property Value--> Make it Static