package day22;

public class TestStudent1 {
    public static void main(String[] args) {
        Students1 st = new Students1();
        int marks =st.getStudentsMarks(" Ben");
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
