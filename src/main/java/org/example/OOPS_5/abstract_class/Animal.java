package org.example.OOPS_5.abstract_class;

abstract public class Animal { //if we have an abstract method in a class we need to also make the class also abstract
    String name; //concrete classes can only have concrete methods and not abstract class
    int age;
    void printName(){
        System.out.println(name);
    }
    abstract void walk(); //this is an abstract class, to override this walk we use the child class of this abstract class which is dog class
}
