package day26;

public class Employee3 {
    private String empName;
    private double empSalary;

    public String getEmpName() {
        if(empName.equals("Kerrie")||empName.equals("John")) {
            return empName;
        }else
        {
            return "N/A";
        }
    }

    public double getEmpSalary() {
        if(empSalary<1000 || empSalary>10000)
        {
            this.empSalary =0.0;
        }
        {
            return empSalary;
        }
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public Employee3(String empName, double empSalary)
    {
        this.empName = empName;
        this.empSalary = empSalary;
    }



}
