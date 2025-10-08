package day31;

public class TestCustomer {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Ben", "Fletcher", 42, 'M', 2345.67, "Microsoft", false);
        System.out.println("Customer Full Name: " + customer1.getfName() + " " + customer1.getlName());
        System.out.println("customer1.getAge(): " + customer1.getAge());
        System.out.println("customer1.getGender(): " + customer1.getGender());
        System.out.println("customer1.getSalary(): " + customer1.getSalary());
        System.out.println("customer1.getCompanyName(): " + customer1.getCompanyName());
        System.out.println("customer1.isWFH(): " + customer1.isWFH());

        System.out.println("========Using builder Pattern to set the value of global variables=======");

        customer1.setfName("Brian").setlName("Roger").setAge(34).setGender('M').setSalary(23456.78).setWFH(true).setCompanyName("Google");
        System.out.println("Customer Full Name: " + customer1.getfName() + " " + customer1.getlName());
        System.out.println("customer1.getAge(): " + customer1.getAge());
        System.out.println("customer1.getGender(): " + customer1.getGender());
        System.out.println("customer1.getSalary(): " + customer1.getSalary());
        System.out.println("customer1.getCompanyName(): " + customer1.getCompanyName());
        System.out.println("customer1.isWFH(): " + customer1.isWFH());

    }
}
