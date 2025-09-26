package day26;

public class TestEmployee2
{
    public static void main(String[] args) {
        Employee2 employee2= new Employee2("Jason", 12000);
        System.out.println("Pay Employee " + employee2.getEmpName() + " a Salary of $" + employee2.getEmpSalary());
    }
}
