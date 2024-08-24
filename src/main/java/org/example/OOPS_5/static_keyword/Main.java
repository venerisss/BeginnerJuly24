package org.example.OOPS_5.static_keyword;

public class Main {
    public static void main(String[] args) { //for static keywords we dont need to create an object to access the attributes or behaviours of a class
        System.out.println(ABC.s); //even the s is also italic
        ABC.print(); //the print is written in italic as it is intelliJ's way of saying something is static

        ABC abc = new ABC();
        System.out.println(abc.s);//there is no error even if we create an object to access static keyword members indirectly, it just shows a warning which can be ignored
        abc.print(); //this shows a yellow underline which means it is a warning and not an error, here we are accessing the members(attr and beh.) through an object which is an indirect approach

        System.out.println("***************");
        Animal one  = new Animal("Dog");
        one.age = 5;
        Animal two = new Animal("Cat");
        System.out.println(one.name);
        System.out.println(two.name);
        System.out.println(one.age);
        System.out.println(two.age); //the value of static is thus common
        System.out.println(Animal.age);

        System.out.println("Changing value now");
        Animal.age = 10;
        System.out.println(one.age);
        System.out.println(two.age);
        System.out.println(Animal.age);
        
    }
}
class ABC{
    static String s; //this is a static attribute
    static void print(){ //this is a static behaviour
        System.out.println("I am static");
    }
}
class Animal{
    String name;
    static  int age;

    public Animal(String name) { //parametrised constructor
        this.name = name;

    }
}
