package day26;

public class Employee {
    private String empName;
    private double empSalary;

    public void setEmpName(String empName) {
        if (empName.equals("Jason")) {
            this.empName = empName;
        } else {
            this.empName = "N/A";
        }
    }


    public void setEmpSalary(double empSalary) {
        if (empSalary < 1000 || empSalary > 10000) {
            empSalary = 0.0;
        } else {
            this.empSalary = empSalary;
        }
    }

    public String getEmpName() {
        return empName;
    }

    public double getSalary() {
        return empSalary;
    }
}
