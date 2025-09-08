package day13;

public class MathOperations {
    public static void main(String[] args) {

        //1. I/I =I part
        System.out.println(10 / 2);//5
        System.out.println(9 / 2);  //4
        System.out.println(10 / 3); //3

        //2. I/D or D/I = ?
        System.out.println(10 / 3.0);//3.3333333333333335
        System.out.println(10.0 / 3);//3.3333333333333335
        System.out.println(10 / 2.0);  //5.0
        System.out.println(10.0 / 2.0); //5.0

        //Example

        int a = 10;
        int b = 2;
        int c = 3;
        double d1 = a / c;//3
        System.out.println(d1);//3.0

        //Modulo Operator [%] - Remainder
        System.out.println(10%2);//0
        System.out.println(10%3);//1
        System.out.println(10%3.0);//1.0
        System.out.println(10.3%3);//1.3000000000000007

        double d2 = 10.3;
        int i1=3;
        double i2 =d2%i1;
        System.out.println(i2);

    }
}
