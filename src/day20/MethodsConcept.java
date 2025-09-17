package day20;

public class MethodsConcept {
    // Write a program to perform addition of 2 integer  numbers

    public int a;
    int b;

    private int c;

    public void addition() {
        int sum = a + b;
        System.out.println("Addition of " + a + " and " + b + " is " + sum);
    }

    public void subtraction() {
        int difference = a - b;
        System.out.println("Subtraction of " + a + " and " + b + " is " + difference);
    }

    public void multiplication() {
        int product = a * b;
        System.out.println("Multiplication of " + a + " and " + b + " is " + product);
    }

    public void division() {
        int divide = a / b;
        System.out.println("Division of " + a + " and " + b + " is " + divide);
    }

    private void permutation() {
        int permutation = a / b + a * b;
        System.out.println("permutation of " + a + " and " + b + " is " + permutation);
    }


}
