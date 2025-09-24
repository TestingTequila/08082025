package day24;

public class TestBatch {
    public static void main(String[] args) {
        Batch b1 = new Batch();
        b1.timeOfBatch = 9;
        b1.morningOrEvening = "Morning";
        b1.numberOfStudents = 23;
        Batch.nameOfTrainer = "Ashish";

        Batch b2 = new Batch();
        b2.timeOfBatch = 10;
        b2.morningOrEvening = "Evening";
        b2.numberOfStudents = 20;
        b2.nameOfTrainer = "Ashish";

        Batch b3 = new Batch();
        b3.timeOfBatch = 2;
        b3.morningOrEvening = "Afternoon";
        b3.numberOfStudents = 44;
        b3.nameOfTrainer = "Ashish";
    }
}


// So if for different objects, the value of the property remains same, we can make this static