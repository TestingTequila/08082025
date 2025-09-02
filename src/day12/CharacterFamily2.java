package day12;

public class CharacterFamily2 {
    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = 'b';
        System.out.println(c1);//a
        System.out.println(c2);//b
        System.out.println(c1 + c2);//ab?

        char c3 = 'A';
        char c4 = 'B';
        System.out.println(c3 - c4); //-1

        char c5 = '0';
        char c6 = '1';
        System.out.println(c5);//0
        System.out.println(c6);//1
        System.out.println(c5 + c6);//48+49 =97


        System.out.println((int) '1');
        System.out.println((char) 49); //1

        System.out.println("=================================================");

        char u1 = 'a';
        char u2 = 'b';
        System.out.println((char) u1);//a
        System.out.println((int) u1);//97
        System.out.println(u1 + u2); //195 or ab
        System.out.println((int) u1 + (int) u2); //195 or ab
        System.out.println(u1 + 0); //97+0
        System.out.println(u1 + '0'); //97+ 48 =145
        System.out.println((char)u1+(char)u2); //195 or ab

    }
}
