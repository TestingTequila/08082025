package day25;

public class ApplicationForm {
    String name;
    int age;
    double salary;
    String city;

    public ApplicationForm(String name, int age, double salary, String city) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.city = city;

    }

    public ApplicationForm(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public ApplicationForm(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public ApplicationForm(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}
