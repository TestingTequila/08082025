package day14;

public class PostIncrementOperators {
    public static void main(String[] args) {


        int a = 1;
        int b = a;
        System.out.println(a);//1
        System.out.println(b);//1

        System.out.println("=====1. Post Increment Operator=======");
        System.out.println("----------Example 1----------");
        int i = 1;
        int j = i++;
        System.out.println(i);//2
        System.out.println(j);//1

        System.out.println("----------Example 2----------");
        int c = 100;
        int d = c++;

        System.out.println(c);//101
        System.out.println(d);//100

        System.out.println("----------Example 3----------");
        int x = 10;
        int y = x++;
        System.out.println(x); //11
        System.out.println(y); //10

        System.out.println("----------Example 4----------");

        int a1 =-99;
        int b1 = a1++;
        System.out.println(a1);//-98
        System.out.println(b1);//-99

    }
}
