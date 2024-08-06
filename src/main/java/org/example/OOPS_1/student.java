package org.example.OOPS_1; //here we create a new package so as to avoid confusion in related classes inside this package and other packages

public class student { //creation of a student class, here no space is used
    int age;
    float psp;
    String name;
    void changeBatch(){
        System.out.println("Changing batch");
    }
    void joinClass(){
        System.out.println(name + "is joining class");
    }
    void printdetails(){
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("PSP: "+ psp);
    }
}
