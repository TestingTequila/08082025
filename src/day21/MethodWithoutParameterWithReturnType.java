package day21;

public class MethodWithoutParameterWithReturnType
{
    int a;
    int b;

    byte b1;
    short s1;
    long l1;
    float f1;
    double d1;
    char c1;
    boolean bl1;
    public int addition1()
    {
        int sum =a+b;
        System.out.println("Addition1 with return Type as int:  " + sum );
        return sum;
    }

    public void addition2()
    {
        int sum =a+b;
        System.out.println("Addition2 without return Type as void:  " + sum );
    }
}
