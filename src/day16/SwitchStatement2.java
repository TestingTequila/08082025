package day16;

public class SwitchStatement2 {
    public static void main(String[] args) {
        int dayOfTheWeek = 4;
        switch (dayOfTheWeek) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Its Weekday");
                break;
            default:
                System.out.println("Its Weekend");
        }
    }
}


//