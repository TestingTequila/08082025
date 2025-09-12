package day18;

import java.util.Arrays;

public class ArraysWithLoops {
    public static void main(String[] args) {
        //12,14,54,65,78,89
        int a1 = 12;
        int a2 = 14;
        int a3 = 54;
        int a4 = 65;
        int a5 = 78;
        int a6 = 89;
        System.out.println(a4);

        System.out.println("==================ARRAYS===================");
        //dataType[] arrayName ={value1, value2, value3, value4.......valueN};

        int[] numbers = {12, 14, 54, 65, 78, 89};

        System.out.println("=====WHILE LOOP========");
        int i =0;
        while(i<numbers.length)
        {
            System.out.println(numbers[i]);
            i++;
        }

        System.out.println("=====FOR LOOP========");

        for(int j =0;j<numbers.length;j++)
        {
            System.out.println(numbers[j]);

        }

        System.out.println("=====ADVANCED FOR LOOP========");

        for(int n: numbers)
        {
            System.out.println(n);
        }

        System.out.println("=====DIRECT METHOD FROM ARRAYS=============");
        System.out.println(Arrays.toString(numbers));

        String[] students ={"Jason", "Lee", "Roger", "Justin", "Kerrie", "Rose", "Kevin"};

        System.out.println("=====WHILE LOOP FOR STUDENTS========");
        int k =0;
        while(k<students.length)
        {
            if(students[k].equals("Justin"))
            {
                break;
            }
            System.out.println(students[k]);
            k++;
        }

        System.out.println("=====FOR LOOP FOR STUDENTS========");

        for(int l =0;l<students.length;l++)
        {
            System.out.println(students[l]);
        }

        System.out.println("=====ADVANCED FOR LOOP FOR STUDENTS========");

        for(String s: students)
        {
            System.out.println(s);
        }

        System.out.println("=====DIRECT PRINTING USING ARRAYS CLASS FOR STUDENTS========");

        System.out.println(Arrays.toString(students));
    }
}
