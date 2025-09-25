package day25;

public class TestCustomer
{
    public static void main(String[] args) {
        Customer customer= new Customer();
        System.out.println(customer.name);
        System.out.println(customer.age);
        System.out.println(customer.city);
        System.out.println(customer.salary);
        System.out.println("=========================================");
        Customer customer1= new Customer();
        System.out.println(customer1.name);
        System.out.println(customer1.age);
        System.out.println(customer1.city);
        System.out.println(customer1.salary);
    }
}
