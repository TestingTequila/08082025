package day18.day18b;

public class TestResume {
    public static void main(String[] args) {
        Resume emp1 = new Resume();
        emp1.fName = "Charles";
        emp1.lName = "Orji";
        emp1.totalExperience = 7;
        emp1.gender = 'm';
        emp1.openToRelocate = false;

        System.out.println("First Name: " + emp1.fName + "\nLast Name: " + emp1.lName+ "\nGender: "+ emp1.gender + "\nTotalExperience: " + emp1.totalExperience +"\nOpenToRelocate: " + emp1.openToRelocate);

        System.out.println("=============================================");
        Resume emp2 =new Resume();
        emp1.fName = "Kerrie";
        emp1.lName = "Wright";
        emp1.totalExperience = 5;
        emp1.gender = 'f';
        emp1.openToRelocate = true;

        System.out.println("First Name: " + emp1.fName + "\nLast Name: " + emp1.lName+ "\nGender: "+ emp1.gender + "\nTotalExperience: " + emp1.totalExperience +"\nOpenToRelocate: " + emp1.openToRelocate);

    }
}
