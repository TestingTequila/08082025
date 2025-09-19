package day21;

public class MethodWithoutParametersWithoutReturnType {
    int a; //global variables: instance Variables
    int b; //global variables: instance Variables

    public void addition() {
        int sum = a + b;
        System.out.println("Addition of " + a + " and " + b + " is " + sum);
    }

    public void subtraction() {
        int diff = a - b;
        System.out.println("Subtraction of " + a + " and " + b + " is " + diff);
    }

    public void multiplication() {
        int product = a * b;
        System.out.println("Multiplication of " + a + " and " + b + " is " + product);
    }
}
