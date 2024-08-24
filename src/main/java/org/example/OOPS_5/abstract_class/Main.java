package org.example.OOPS_5.abstract_class;

public class Main { //we see what all objects we can create in this main class
    public static void main(String[] args) {
        //Animal a = new Animal(); //as we cannot create objects iof abstract classes
        //Cat cat = new Cat() ; //same as above cat is an abstract class
        Animal a = new dog();
        a.walk();
    }
}
