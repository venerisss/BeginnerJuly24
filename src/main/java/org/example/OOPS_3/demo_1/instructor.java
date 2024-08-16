package org.example.OOPS_3.demo_1;

public class instructor extends user { //creating a child class of user using extends keyword
    String batchName;
    double avgRating;
    void scheduleClass(){
        System.out.println(username + " is taking " + batchName);
    }

}
