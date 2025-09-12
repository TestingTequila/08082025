package day18;

import java.util.Arrays;

public class ArraysWithLoops2 {
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
        while(i<numbers.length) {
            if(numbers[i]==65)
            {
                numbers[i]=100;
            }
            System.out.println(numbers[i]);
            i++;
        }

        System.out.println("=====DIRECT METHOD FROM ARRAYS=============");
        System.out.println(Arrays.toString(numbers));

        String[] students ={"Jason", "Lee", "Roger", "Justin", "Kerrie", "Rose", "Kevin"};

    }
}
