package day24;

public class Application {
    public void m1() {
        System.out.println("NS m1 method");
        Application a1 = new Application();
        a1.m1();
        Application.m4();
    }

    public void m2() {
        m1();
        System.out.println("NS m2 method");
    }

    public void m3() {
        m2();
        System.out.println("NS m3 method");
    }

    public static void m4() {
        System.out.println("S m4 method");
        Application a2 = new Application();
        a2.m3();
    }

    public static void m5() {
        Application.m4();
        System.out.println("S m5 method");
    }

    public static void m6() {
        Application.m4();
        System.out.println("S m6 method");
    }
}
