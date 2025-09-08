package day13;

public class StringConcatenation {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";

        int i1 = 100;
        int i2 = 200;

        System.out.println(s1);//Hello
        System.out.println(s2);//World

        System.out.println(i1);//100
        System.out.println(i2);//200

        System.out.println(s1 + i1);//Hello+100 = Hello100
        System.out.println(s1 + s2 + i1 + i2);//HelloWorld100200
        System.out.println(i1 + i2 + s1 + s2);//300HelloWorld
        System.out.println(i1 + i2 + s1 + i1 + i2 + s2);//300Hello100200World

        System.out.println(s1 + i1 * i2);//Hello20000
        System.out.println(s1+i2/i1);// Hello2

        //System.out.println((s1+200)/i1); Compile Time Error

    }
}

// + - < *  /