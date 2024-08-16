package org.example.OOPS_3.compile_time_polymorphism;

public class printer {
    void print(){
        System.out.println("I am empty");
    }
    void print(String s){
        System.out.println("I am also empty");
    }
    /*String print(String a){  this is also not allowed as we during compile time polymorphism we dont consider return type, we only consider signature and the same signature is already present above
        System.out.println("I am also empty");
        return " ";
    }*/
}
