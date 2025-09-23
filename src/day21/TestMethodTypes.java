package day21;

public class TestMethodTypes {
    public static void main(String[] args) {
        System.out.println("==========MethodWithoutParametersWithoutReturnType======");
        MethodWithoutParametersWithoutReturnType type1 = new MethodWithoutParametersWithoutReturnType();
        type1.a = 12;
        type1.b = 8;
        type1.addition(); ///20
        type1.subtraction(); //4
        type1.multiplication();//96

        MethodWithoutParametersWithoutReturnType type11 = new MethodWithoutParametersWithoutReturnType();
        type11.a = 122;
        type11.b = 88;
        type11.addition(); ///20
        type11.subtraction(); //4
        type11.multiplication();//96

        System.out.println("======MethodWithParametersWithoutReturnType=============");

        MethodWithParametersWithoutReturnType type2 = new MethodWithParametersWithoutReturnType();
        type2.addition(12, 8);//20
        type2.subtraction(34, 4);//30
        type2.multiplication(5, 4);//20


        MethodWithParametersWithoutReturnType type22 = new MethodWithParametersWithoutReturnType();
        type22.addition(122, 88);//210
        type22.subtraction(344, 4);//340
        type22.multiplication(50, 4);//200

        System.out.println("========MethodWithLocalVariablesWithoutReturnType=========");

        MethodWithLocalVariablesWithoutReturnType type3 = new MethodWithLocalVariablesWithoutReturnType();
        type3.addition();//20

        MethodWithLocalVariablesWithoutReturnType type33 = new MethodWithLocalVariablesWithoutReturnType();
        type33.addition();//20

        System.out.println("====================================");

        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        System.out.println("s3.intern(): "+ s3.intern());
        String s4 =s3.intern();

        System.out.println("Pool Vs Heap");
        System.out.println(s1==s2);//true
        System.out.println(s1==s3);//false
        System.out.println(s1==s4);//true
        System.out.println(s1.equals(s3));//true
    }

}
