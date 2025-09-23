package day22;

public class Students
{
    public int getStudentsMarks(String studentName)
    {
        if(studentName.equals("Justin"))
        {
            return 90;
        }
        else if (studentName.equals("Jason"))
        {
            return 84;
        }
        else if (studentName.equals("Kerrie"))
        {
            return 67;
        }
        else if (studentName.equals("Marie"))
        {
            return 92;
        }
        return -1;
    }
}
