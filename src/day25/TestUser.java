package day25;

public class TestUser
{
    public static void main(String[] args) {
        User user =new  User();
        System.out.println(user.b);//0
        System.out.println(user.s);//0
        System.out.println(user.i);//0
        System.out.println(user.l);//0
        System.out.println(user.f);//0.0
        System.out.println(user.d);//0.0
        System.out.println(user.c);//NUL
        System.out.println(user.bl);//false
        user.addition();
    }
}
