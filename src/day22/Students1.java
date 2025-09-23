package day22;

public class Students1
{
    int marks=-1;
    public int getStudentsMarks(String studentName)
    {
        if(studentName.equals("Justin"))
        {
            marks= 90;
        }
        else if (studentName.equals("Jason"))
        {
            marks=  84;
        }
        else if (studentName.equals("Kerrie"))
        {
            marks=  67;
        }
        else if (studentName.equals("Marie"))
        {
            marks=  92;
        }
        return marks;
    }
}
