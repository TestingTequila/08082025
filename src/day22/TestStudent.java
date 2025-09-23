package day22;

public class TestStudent {
    public static void main(String[] args) {
        Students st = new Students();
        int marks =st.getStudentsMarks("Kerrie");
        System.out.println("Marks scored by Student is : " + marks);
        if(marks>=90)
        {
            System.out.println("Student has got grade A++");
        }
        else
        {
            System.out.println("Student has not scored A++");
        }
    }
}
