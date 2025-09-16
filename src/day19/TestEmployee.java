package day19;

public class TestEmployee {
    public static void main(String[] args) {
        System.out.println("==========EMP1==========");
        Employee emp1 = new Employee();
        emp1.name = "Jason";
        emp1.age = 32;
        emp1.city = "NY";
        emp1.salary = 4000;
        System.out.println("EmpName: " + emp1.name +"\nEmpAge: "+emp1.age + "\nEmpCity: " + emp1.city + "\nEmpSalary: " + emp1.salary);

        System.out.println("==========EMP2==========");
        Employee emp2 = new Employee();
        emp2.name = "Kerrie";
        emp2.age = 23;
        emp2.city = "NJ";
        emp2.salary = 1500;
        System.out.println("EmpName: " + emp2.name +"\nEmpAge: "+emp2.age + "\nEmpCity: " + emp2.city + "\nEmpSalary: " + emp2.salary);

        System.out.println("==========EMP3==========");
        Employee emp3 = new Employee();
        emp3.name = "Charles";
        emp3.age = 33;
        emp3.city = "OK";
        emp3.salary = 20000;
        System.out.println("EmpName: " + emp3.name +"\nEmpAge: "+emp3.age + "\nEmpCity: " + emp3.city + "\nEmpSalary: " + emp3.salary);

        System.out.println("***********EMP3=null*********");
        emp3 =null;
        try {
            System.out.println("EmpName: " + emp3.name +"\nEmpAge: "+emp3.age + "\nEmpCity: " + emp3.city + "\nEmpSalary: " + emp3.salary);
        }
        catch (NullPointerException e)
        {
            e.printStackTrace();
        }

        System.out.println("***********emp3 = new Employee()*********");
        emp3 = new Employee();
        System.out.println("EmpName: " + emp3.name +"\nEmpAge: "+emp3.age + "\nEmpCity: " + emp3.city + "\nEmpSalary: " + emp3.salary);


        System.out.println("=======Creating Object without Reference Variable should be avoided====");
        new Employee().name="Justin";
        new Employee().age =36;
        new Employee().city= "Ohio";
        new Employee().salary = 3456;
        System.out.println("EmpName: " + new Employee().name +"\nEmpAge: "+new Employee().age + "\nEmpCity: " + new Employee().city + "\nEmpSalary: " + new Employee().salary);

        System.gc();






    }
}
