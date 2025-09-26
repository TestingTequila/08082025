package day26;

public class TestEmployee3
{
    public static void main(String[] args) {
        Employee3 employee3= new Employee3("Kerrie", 10000);//Setting
        System.out.println("Pay Employee " + employee3.getEmpName() + " a Salary of $" + employee3.getEmpSalary());
        employee3.setEmpName("John"); // updating
        employee3.setEmpSalary(8000); // updating
        System.out.println("Pay Employee " + employee3.getEmpName() + " a Salary of $" + employee3.getEmpSalary());
    }
}
