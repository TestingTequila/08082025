package day14;

public class MiscScenariosUsingPrintStatement {
    public static void main(String[] args) {

        System.out.println("===Post Increment======");

        System.out.println("-------Example 1-------------------");
        int num = 10;
        System.out.println(num++);//10
        System.out.println(num);//11


        System.out.println("-------Example 2-------------------");

        int a =100;
        System.out.println(a++);//100
        System.out.println(a);//101

        System.out.println("===Pre Increment======");

        int c =1;
        System.out.println(++c);//2
        System.out.println(c);//2

        System.out.println("==================Complex Example==========");

        char ch ='a';
        System.out.println(ch++);//a
        System.out.println(ch);//b
        System.out.println((int)ch);//98


    }
}
