package day24;

public class Car {
    String name;
    int price;
    String color;
    static final int wheels = 4;

    public void start()
    {
        System.out.println("Car Start....");
        //static int x =70; Local variables can't be static
    }

    public static void speed()
    {
        System.out.println("Car speed....");

    }
}
