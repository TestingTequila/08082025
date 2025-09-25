package day25;

public class Customer {
    String name;//null
    int age;//0
    double salary;//0.0
    String city;//null


    public Customer()
    {
        System.out.println("This is my Constructor from Customer Class");
        this.name = "Charles";
        this.age =33;
        this.city = "Oklahoma";
        this.salary =10000;
    }
}
