package day23;

import java.util.Arrays;

public class TestCustomer
{
    public static void main(String[] args) {
        Customer customer = new Customer();
        System.out.println(Arrays.toString(customer.getEmployeeDevices("Lee")));
    }
}
