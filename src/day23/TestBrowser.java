package day23;

public class TestBrowser
{
    public static void main(String[] args) {
        LaunchBrowser lb = new LaunchBrowser();
        String browserName=lb.openBrowser("Abc");
        System.out.println("Browser Name: " + browserName);
        if(browserName.equals("Chrome"))
        {
            System.out.println("Launch Chrome Browser...");
        }
    }
}
