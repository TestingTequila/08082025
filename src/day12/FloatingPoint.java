package day12;

public class FloatingPoint {
    public static void main(String[] args) {
        float f1 = 12.123456789F;
        float f2 = (float) 12.123456789;
        System.out.println(f1);
        System.out.println(f2);

        double d1 = 12.1234567890987654321;
        System.out.println(d1);
    }
}


//float [4 byte(32 bits), up to 6-7 decimal places]
//double [8 byte(64 bits), up to 15-16 decimal places]