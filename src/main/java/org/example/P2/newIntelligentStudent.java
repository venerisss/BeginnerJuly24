package org.example.P2;

import org.example.P1.newstudent; //we imported a class from a different package

public class newIntelligentStudent extends newstudent {
    public newIntelligentStudent(int age, String name, String email, float psp) {
        super(25, "name", "email",100);
    } //extends keyword is used to create inheritance

    public newIntelligentStudent() {
        super();
    }

    public void print(){
        System.out.println(name); //thus we are able to access name as it is a child and protected allows the child to inherit the parent class from a different package (p1)
        //System.out.println(age); //thus age has a private access modifier in p1 package which includes the newstudent class we imported
        //System.out.println(psp); //because psp is not public in org.example.P1.newstudent, i.e it is default, it only works in the same class
        pausecourse();
        //printdetails();

    }
}
