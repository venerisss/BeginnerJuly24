package org.example.OOPS_1;

public class main { //the green play button on the left denotes that this is the starting point in java
    public static void main(String[] args){//this is the entry point of java code, this is the first method that gets executed in java
        student one = new student(); //new memory allocated as soon as new keyword is used, we create a new object here
        one.name = "Bhavik";
        one.age = 24;
        one.psp = 95;
        one.changeBatch();
        one.joinClass(); //if u r interested and want to see how the change batch code is executing, use the step into button, go to console to see how it is printed
        one.printdetails(); //the stepover button helps execute the code line by line in debugging

        student two = new student(); //new memory allocated as soon as new keyword is used
        two.name = "Bhanu"; //resume program button helps us to jump to debugger points
        two.age = 25;
        two.psp = 100;
        two.printdetails();
    }
}
