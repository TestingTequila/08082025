package day18;

public class FibonacciSeries
{
    public static void main(String[] args) {
        printFibonacciSeries(1,2,9);
    }

    public static void printFibonacciSeries(int fistNumber, int secondNumber, int number)
    {
        System.out.println(fistNumber + " " + secondNumber);
        for(int i =2; i<number; i++)
        {
            int k = fistNumber + secondNumber;
            System.out.println(k);
            fistNumber=secondNumber;
            secondNumber = k;
        }
    }
}
