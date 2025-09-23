package day23;

public class LaunchBrowser
{
    public  String openBrowser(String browserName)
    {
        String browserType = "No Browser";
        if(browserName.equals("IE"))
        {
            browserType= browserName;
        }
        else if (browserName.equals("Chrome"))
        {
            browserType=  browserName;
        }

        else if (browserName.equals("Edge"))
        {
            browserType=  browserName;
        }

        else if (browserName.equals("Safari"))
        {
            browserType=  browserName;
        }
        return browserType;
    }
}
