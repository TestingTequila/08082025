package day16;

public class MultipleIfWithElseStatement
{
    public static void main(String[] args) {
        if(true)
        {
            System.out.println("1st Condition");
        }
        if(true)
        {
            System.out.println("2nd Condition");
        }
        if(true)
        {
            System.out.println("3rd Condition");
        }
        if(false)
        {
            System.out.println("4th Condition");
        }
        else
        {
            System.out.println("None of the above condition is true...");
        }
    }
}


//We shouldn't be using multiple if's with Else statement
