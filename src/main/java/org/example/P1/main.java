package org.example.P1;

import java.sql.SQLOutput;

public class main {
    public static void main(String[] args){
        newstudent s = new newstudent(20,"jane doe", "jane@scaler.com",25 ); //as soon as we created a no args constructor, now onwards it will call that constructor, earlier it was default constructor that was called, hence initial values of age was 0, name was null etc.
        //now we convert the above constructor to a no args const so we can call it in  new student
        //s.age = 50; //because age has private access, we cannot access in main class
        //s.printdetails(); this will also not be accepted as printdetails is in private
        s.psp = 50;
        System.out.println(s.psp);
        s.email = "";


    }
}
