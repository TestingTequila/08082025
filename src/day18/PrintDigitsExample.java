package day18;

public class PrintDigitsExample
{
    public static void main(String[] args) {
        printDigitsInANumber(683452);
    }

    public static void printDigitsInANumber(int number)
    {
        while (number!=0)
        {
            int digit =number%10;
            System.out.println(digit);
            number =number/10;
        }
    }
}



