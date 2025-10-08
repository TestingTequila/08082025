package day31;

public class Customer {
    private String fName;
    private String lName;
    private int age;
    private char gender;
    private double salary;
    private String companyName;
    private boolean isWFH;

    public Customer(String fName, String lName, int age, char gender, double salary, String companyName, boolean isWFH) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.companyName = companyName;
        this.isWFH = isWFH;
    }

    public String getlName() {
        return lName;
    }

    public String getfName() {
        return fName;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public double getSalary() {
        return salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public boolean isWFH() {
        return isWFH;
    }

    public Customer setfName(String fName) {
        this.fName = fName;
        return this;
    }

    public Customer setlName(String lName) {
        this.lName = lName;
        return this;
    }

    public Customer setAge(int age) {
        this.age = age;
        return this;
    }

    public Customer setGender(char gender) {
        this.gender = gender;
        return this;
    }

    public Customer setSalary(double salary) {
        this.salary = salary;
        return this;
    }

    public Customer setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    public Customer setWFH(boolean WFH) {
        isWFH = WFH;
        return this;
    }
}
