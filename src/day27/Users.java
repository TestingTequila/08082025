package day27;

public class Users
{
    private String name;
    private int age;
    private String city;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public Users(String name, int age, String city)
    {
        this.name = name;
        this.age =age;
        this.city=city;
    }

    public Users(String name, int age)
    {
        this(name, age, "New Jersey");
        this.name = name;
        this.age =age;

    }

    public Users(String city)
    {
        this("Justin", 30, city);
        this.city=city;
    }
}
