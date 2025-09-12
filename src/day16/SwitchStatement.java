package day16;

public class SwitchStatement {
    public static void main(String[] args) {
        int dayOfTheWeek = 6;
        switch (dayOfTheWeek) {
            case 1:
                System.out.println("Its Monday");
                break;
            case 2:
                System.out.println("Its Tuesday");
                break;
            case 3:
                System.out.println("Its Wednesday");
                break;
            case 4:
                System.out.println("Its Thursday");
                break;
            case 5:
                System.out.println("Its Friday");
                break;
            default:
                System.out.println("Its Weekend");
        }
    }
}


//IDE: Integrated Development Environment