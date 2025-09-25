package day25;

public class TestApplicationForm {
    public static void main(String[] args) {
        ApplicationForm applicationForm = new ApplicationForm("Jason", 33, 10000.0, "Ohio");
        System.out.println(applicationForm.name);//Jason
        System.out.println(applicationForm.age);//33
        System.out.println(applicationForm.salary);//12000.0
        System.out.println(applicationForm.city);//Ohio
        System.out.println("=================================");

       ApplicationForm applicationForm1 = new ApplicationForm("Kerrie", 23, 5000, "NJ");
        System.out.println(applicationForm1.name);//Kerrie
        System.out.println(applicationForm1.age);//23
        System.out.println(applicationForm1.salary);//5000.0
        System.out.println(applicationForm1.city);//NJ

        System.out.println("=================================");
        ApplicationForm applicationForm2= new ApplicationForm("Mary", 6000.0);
        System.out.println(applicationForm2.name);//Mary
        System.out.println(applicationForm2.age);//0
        System.out.println(applicationForm2.salary);//6000.0
        System.out.println(applicationForm2.city);//null
    }
}
