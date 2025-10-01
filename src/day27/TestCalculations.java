package day27;

public class TestCalculations
{
    public static void main(String[] args) {

        Calculations calculations = new Calculations(100, 200);
        calculations.addition();

        System.out.println("==============================");

        Users user1 =new Users("Jason", 26, "NY");
        System.out.println(user1.getName()); //Jason
        System.out.println(user1.getAge()); //26
        System.out.println(user1.getCity());//NY
        System.out.println("==========User2====================");
        Users user2 = new Users("London");
        System.out.println(user2.getName()); //null
        System.out.println(user2.getAge());  //0
        System.out.println(user2.getCity()); //London
        System.out.println("============User3=================");
        Users user3= new Users("Kerrie", 23);
        System.out.println(user3.getName());//Kerrie
        System.out.println(user3.getAge()); //23
        System.out.println(user3.getCity());//New Jersey

        System.out.println("==========EmployeeRegistration========");
         EmployeeRegistration emp1= new EmployeeRegistration("NJ", "Dormanto");
        System.out.println(emp1.getName());
        System.out.println(emp1.getAge());
        System.out.println(emp1.getGender());
        System.out.println(emp1.getEmailId());
        System.out.println(emp1.getPw());
        System.out.println(emp1.getCpw());
        System.out.println(emp1.getState());
        System.out.println(emp1.getCity());

    }
}
