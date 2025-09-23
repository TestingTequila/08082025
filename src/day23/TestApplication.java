package day23;

public class TestApplication {

    public static void main(String[] args) {
        Application application = new Application();
        application.test(128);
        application.test((byte) 12);
        application.test((short) 12);
        application.test((long) 12);
        application.test(12, (byte) 66);
        application.test((byte) 12, 87, "Justin");
    }
}
