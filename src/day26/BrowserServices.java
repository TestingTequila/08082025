package day26;

public class BrowserServices
{
    public void launchBrowser()
    {
        System.out.println("Trying to launch browser... ");
        checkRAM();
        checkVersion();
        checkOS();
        checkBrowserServices();
        System.out.println("Opening the browser...");
    }

    private void checkRAM() {
        System.out.println("checkRAM");
    }

    private void checkVersion() {
        System.out.println("checkVersion");
    }

    private void checkOS() {
        System.out.println("checkOS");
    }

    private void checkBrowserServices() {
        System.out.println("checkBrowserServices");
    }
}
