package day16;

public class IfElseIfStatement4
{
    public static void main(String[] args) {

        long marks =67L;
        if(marks>90 && marks<=100)
        {
            System.out.println("A++ Grade");
        }
        else if(marks>80 && marks<=90)
        {
            System.out.println("A+ Grade");
        }
        else if(marks>70 && marks<=80)
        {
            System.out.println("B++ Grade");
        }
        else if(marks>60 && marks<=70)
        {
            System.out.println("B+ Grade");
        }
        else if(marks>50 && marks<=60)
        {
            System.out.println("B Grade");
        }
        else
        {
            System.out.println("Sorry...better luck next time");
        }
    }
}


//We shouldn't be using multiple if's with Else statement
