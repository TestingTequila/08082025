package day19;

public class TestUser2
{
    public static void main(String[] args) {
        User2 u1 = new User2();
        u1.name = "Jason";
        u1.age = 22;
        u1.city = "NY";

        User2 u2 = new User2();
        u2.name = "Charles";
        u2.age = 33;
        u2.city = "Oklahoma";

        User2 u3 = new User2();
        u3.name = "Kerrie";
        u3.age = 24;
        u3.city = "Ohio";

        System.out.println(u1.name + "/ " + u1.age + "/ " + u1.city);
        System.out.println(u2.name + "/ " + u2.age + "/ " + u2.city);
        System.out.println(u3.name + "/ " + u3.age + "/ " + u3.city);

        System.out.println("******u1=u2=u3*******");
        u1=u2=u3;

        System.out.println(u1.name + "/ " + u1.age + "/ " + u1.city);
        System.out.println(u2.name + "/ " + u2.age + "/ " + u2.city);
        System.out.println(u3.name + "/ " + u3.age + "/ " + u3.city);

    }
}


//If you want your reference variable should always and always point to the same object, make the reference variable as final
//final User2 u4 = new User2();

//So in above example u4 will always point to the same object;