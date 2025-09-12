package day17;

public class ArraysWithUnknownValues {
    public static void main(String[] args) {
        //I want to store the marks of 6 students

        int x;
        x = 100;

        int[] marks = new int[6];
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println(marks[5]);

        System.out.println("=====Assigned Value=======");
        marks[2] = 67;
        marks[4] = 55;
        marks[0] = 99;
        marks[3] = 78;

        System.out.println(marks[0]);//99
        System.out.println(marks[1]);
        System.out.println(marks[2]);//67
        System.out.println(marks[3]);//78
        System.out.println(marks[4]);//55
        System.out.println(marks[5]);

        String[] whiskey = new String[4];
        System.out.println(whiskey[0]);
        System.out.println(whiskey[1]);
        System.out.println(whiskey[2]);
        System.out.println(whiskey[3]);

        System.out.println("=====Assign Value=========");
        whiskey[0] = "Chivas";
        whiskey[1] = "Black Label";
        whiskey[2] = "Jameson";
        whiskey[3] = "Jack Daniel";
        System.out.println(whiskey[0]);
        System.out.println(whiskey[1]);
        System.out.println(whiskey[2]);
        System.out.println(whiskey[3]);


    }
}
