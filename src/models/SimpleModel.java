package models;

import java.util.Random;

public class SimpleModel {

    String[] students = {"Adi", "Budi", "Cindy", "Dodi", "Evi"};

    public String randomText() {
        Random random = new Random();
        int randomNum = random.nextInt(students.length);
        
        return students[randomNum];
    }
    
}
