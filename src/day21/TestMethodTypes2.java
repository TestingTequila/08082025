package day21;

public class TestMethodTypes2
{
    public static void main(String[] args) {
        MethodWithoutParameterWithReturnType type1 = new MethodWithoutParameterWithReturnType();
        type1.a=12;
        type1.b =8;
        int total1=type1.addition1(); // having return type
        System.out.println(total1 + 20);
        type1.addition2(); // no return Type : void, cannot perform further calculation or manipulation

        System.out.println("=================================");

        MethodWithParameterWithReturnType type2 = new MethodWithParameterWithReturnType();
        int total=type2.addition1(33,7);
        System.out.println(total*5); //200
        type2.addition2(33,7); //40

    }
}
