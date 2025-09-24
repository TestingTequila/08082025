package day24;

import static day24.Car.speed;
import static day24.Car.wheels;

public class TestCar {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.name = "BMW";
        c1.price = 90000;
        c1.color = "Red";
        c1.start();
        speed();
        //Car.wheels= 5; cannot change the value as this is final


        System.out.println("Name of Car C1:: " + c1.name + "\nPrice: " + c1.price + "\nColor: " + c1.color + "\nWheels: " + Car.wheels);

        Car c2 = new Car();
        c2.name = "Audi";
        c2.price = 80000;
        c2.color = "White";
        c2.start();
        speed();

        System.out.println("Name of Car C2:: " + c2.name + "\nPrice: " + c2.price + "\nColor: " + c2.color + "\nWheels: " + Car.wheels);

        Car c3 = new Car();
        c3.name = "Tesla";
        c3.price = 70000;
        c3.color = "Black";
        c3.start();
        speed();
        System.out.println("Name of Car C3::" + c3.name + "\nPrice: " + c3.price + "\nColor: " + c3.color + "\nWheels: " + Car.wheels);

    }
}


// Common Property Value--> Make it Static