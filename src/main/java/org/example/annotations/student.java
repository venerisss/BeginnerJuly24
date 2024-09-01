package org.example.annotations;

public class student {
    String name;
    int age;
    @Deprecated //this annotation will tell us that the newer code (printdetailsnew) is to be used by giving us a yellow underline when we try to call printdetails
    public void printdetails(){
        System.out.println("name: "+name);
        System.out.println("age: "+age);
    }
    public void printdetailsnew(){
        System.out.println("name: "+ name + "age: "+ age);
    }
}
