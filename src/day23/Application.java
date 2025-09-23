package day23;

public class Application
{
    //1. by changing the data type of parameters
    public void test()
    {
        System.out.println("test method with 0 parameters....");
    }
    public void test(int a)
    {
        System.out.println("test method with int parameters...." + a);
    }
    public void test(byte a)
    {
        System.out.println("test method with byte parameters...." + a);
    }
    public void test(short a)
    {
        System.out.println("test method with short parameters...." + a);
    }
    public void test(long a)
    {
        System.out.println("test method with long parameters...." + a);
    }
    public void test(char a)
    {
        System.out.println("test method with char parameters...." + a);
    }
    public void test(float a)
    {
        System.out.println("test method with float parameters...." + a);
    }
    public void test(double a)
    {
        System.out.println("test method with double parameters...." + a);
    }
    public void test(boolean a)
    {
        System.out.println("test method with boolean parameters...." + a);
    }

    //2. by changing the order of data types of parameters
    public void test(int a, byte b)
    {
        System.out.println("INT parameters...." + a + "BYTE: " + b);
    }
    public void test(byte b, int a)
    {
        System.out.println("INT parameters...." + a + "BYTE: " + b);
    }

    //3. by changing the count of parameters
    public void test(byte b, int a, String s)
    {
        System.out.println("INT parameters...." + a + "BYTE: " + b + "STRING: " + s);
    }
}
