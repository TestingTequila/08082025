package day23;

public class Customer
{
    public  String[] getEmployeeDevices(String empName)
    {
        String[] devices = new String[0];

        if(empName.equals("Jason"))
        {
            devices= new String[]{"macbook pro", "ipad", "iphone17"};
        }
        else if (empName.equals("Justin"))
        {
            devices= new String[]{"windows11", "samsung s12"};
        }

        else if (empName.equals("Ben"))
        {
            devices= new String[]{"windows14", "samsung s18", "iphone15"};
        }
        else if (empName.equals("Kerrie"))
        {
            devices= new String[]{"airtel connection box"};
        }
        return devices;
    }
}
