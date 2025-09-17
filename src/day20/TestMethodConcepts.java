package day20;

public class TestMethodConcepts
{
    public static void main(String[] args) {
        MethodsConcept mc = new MethodsConcept();
        mc.a =122;
        mc.b =88;
        mc.addition();
        mc.subtraction();
        mc.multiplication();
        mc.division();
        //mc.c; cannot access variable c as it has private access modifier
        //mc.permutation(); cannot access method permutation() as it has private access modifier

    }
}
