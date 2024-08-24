package org.example.OOPS_5.abstract_class;

public class dog extends Animal{//thus to make the error go away one method is we need to make the dog class also abstract i.e we have to write "public abstract dog extends Animal"
    @Override
    void walk() { //2nd way is to implement and override the methods
        System.out.println("Dog is walking");
    }
}
