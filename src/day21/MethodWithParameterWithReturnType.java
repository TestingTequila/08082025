package day21;

public class MethodWithParameterWithReturnType
{

    public int addition1(int a, int b)
    {
        int sum =a+b;
        System.out.println("Addition1 with return Type as int:  " + sum );
        return sum;
    }

    public void addition2(int a , int b)
    {
        int sum =a+b;
        System.out.println("Addition2 without return Type as void:  " + sum );
    }
}
