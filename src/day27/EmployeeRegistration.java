package day27;

public class EmployeeRegistration
{
    private  String name;
    private  int age;
    private  char gender;
    private  String pw;
    private  String cpw;
    private  String emailId;
    private  String  city;
    private String state;

    public EmployeeRegistration(String name,int age,char gender, String pw, String cpw, String emailId, String state, String  city )
    {
        this.name =name;
        this.age= age;
        this.gender = gender;
        this.pw =pw;
        this.cpw=cpw;
        this.emailId = emailId;
        this.state = state;
        this.city = city;
    }

    public EmployeeRegistration(String state, String  city )
    {
        this("Mary",24,'F', "test1234", "test1234", "mary@janbask.com", state, city);
        this.state = state;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public String getPw() {
        return pw;
    }

    public String getCpw() {
        return cpw;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }
}
