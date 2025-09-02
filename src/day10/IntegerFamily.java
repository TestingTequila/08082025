package day10;

public class IntegerFamily {
    public static void main(String[] args) {

        //What are Variables ?
        //Two types of Variables
        //Syntax

        //1. When you know the exact value that you want to store
        // dataType variableName= value;
        // dataType x= 10;

        System.out.println("Hello");

        //[byte, short, int, long], float, double, char, boolean

        System.out.println("=====BYTE========================");
        byte x = 10; //1 byte of memory
        System.out.println(x);//10
        byte x1 = 100; //1 byte of memory
        System.out.println(x1);
        byte x2 = 120; //1 byte of memory
        byte x3 = -10; //1 byte of memory
        byte x4 = 127; //1 byte of memory
        //byte x5= 128; //Out of range for Byte Data Type
        byte x6 = -128;
        //byte x7= -129; //Out of range for Byte Data Type

        //Byte: 1 Byte [-128 to 127 ]

        System.out.println(Byte.MAX_VALUE);//127
        System.out.println(Byte.MIN_VALUE);//-128


        System.out.println("=====SHORT========================");
        //Byte: 2 Byte [-32768 to 32767]
        short s1 = 128;

        short s2 = 32767;
        //short s3 = 32768; Out of range for short Data Type

        short s4 = -32768;
        //short s5 = -32769; Out of range for short Data Type
        System.out.println(Short.MAX_VALUE);//32767
        System.out.println(Short.MIN_VALUE);//-32768

        System.out.println("=====INT========================");
        //int: 4 Bytes [-2147483648 to 2147483647]
        int i1 = 32768;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println("=====INT========================");
        //long: 8 Bytes [  to -]
        long l2 = 2147483648L;

        System.out.println("======Misc Examples====");

        byte b1 = 10;// this captures the least memory

        long l1 = 8860418225L;
        System.out.println(l1);


    }
}
