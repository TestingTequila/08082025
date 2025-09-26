package day26;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setEmpName("Kerrie");
        emp1.setEmpSalary(90000);

        System.out.println("Pay the Employee " + emp1.getEmpName() + " a salary of $" + emp1.getSalary());
    }
}
