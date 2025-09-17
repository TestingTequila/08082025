package day19;

public class TestUser {
    public static void main(String[] args) {
        User u1 = new User();
        u1.name = "Jason";
        u1.age = 22;
        u1.city = "NY";

        User u2 = new User();
        u2.name = "Charles";
        u2.age = 33;
        u2.city = "Oklahoma";

        User u3 = new User();
        u3.name = "Kerrie";
        u3.age = 24;
        u3.city = "Ohio";

        System.out.println(u1.name + "/ " + u1.age + "/ " + u1.city);
        System.out.println(u2.name + "/ " + u2.age + "/ " + u2.city);
        System.out.println(u3.name + "/ " + u3.age + "/ " + u3.city);

        System.out.println("*******u1=u2*******");
        u1 = u2;
        System.out.println(u1.name + "/ " + u1.age + "/ " + u1.city);
        System.out.println(u2.name + "/ " + u2.age + "/ " + u2.city);
        System.out.println(u3.name + "/ " + u3.age + "/ " + u3.city);

        System.out.println("*******u2=u3*******");
        u2 = u3;
        System.out.println(u1.name + "/ " + u1.age + "/ " + u1.city);
        System.out.println(u2.name + "/ " + u2.age + "/ " + u2.city);
        System.out.println(u3.name + "/ " + u3.age + "/ " + u3.city);

        System.out.println("*******u3=u1*******");
        u3 = u1;
        System.out.println(u1.name + "/ " + u1.age + "/ " + u1.city);
        System.out.println(u2.name + "/ " + u2.age + "/ " + u2.city);
        System.out.println(u3.name + "/ " + u3.age + "/ " + u3.city);

    }
}
