package org.example.OOPS_4.interfaces;

public class dog implements animal{//we use implements for a class to inherit an interface and if there are 3 methods in interface we need to write to override all 3 methods and give implementation or we will get error
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void walk() {
        System.out.println("Dog is walking");
    }

    @Override
    public void run() {
        System.out.println("Dog is running");
    }
}
