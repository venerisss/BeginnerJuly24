package org.example.OOPS_4.interfaces;

public class Main {
    public static void main(String[] args) { //just like int a = 5; where int = datatype, a = variable, 5 is the data
        animal a = new dog(); //here animal is of interface datatype a is a variable and it stores the dog as a child
        a.eat();
        a.walk();
        a.run();
        //animal b = new animal(); 'animal' is abstract; cannot be instantiated
    }
}
