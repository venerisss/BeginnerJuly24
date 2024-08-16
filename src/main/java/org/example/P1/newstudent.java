package org.example.P1;

public class newstudent{
    private int age;
    float psp; //default value
    protected String name; //default value null

    public String email; //default value null
    /*public newstudent(){ //this is a no args constructor with public as access modifier
        this.age = 20;
        this.email = "temp@scaler.com";
        this.name = "John Doe";
        this.psp = 10;
    }*/
    public newstudent(int age, String name, String email, float psp){ //intially when we call this it shows 3 problesm and errors as there is no, no args constructor in the main so we go to main and change to no args constructor
        this.age = age;
        this.name = name;
        this.email = email;
        this.psp = psp;
    }
    public newstudent(String name){
        this.name = name;
    }
    /*public newstudent(String email){ this is not allowed as the constructor with the same string signature is already present with the same name.. as according to rule 2 parametrized constructors need to have unique signature.
        this.name = email;
    }*/


    void changeBatch(){
        age++; //we r able to access this even if it is in private as it is in same class
        System.out.println("Changing batch");
        printdetails();  //we r able to access this even if it is in private as it is in same class
    }
    public int getAge(){
        return age;
    }
    void joinClass(){
        System.out.println(name + "is joining class");
    }
    protected void pausecourse(){
        System.out.println(name+ " is pausing course");
    }
    private void printdetails(){
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("PSP: "+ psp);
    }
}
