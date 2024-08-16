package org.example.OOPS_4.runtime_polymorphism;

import java.util.Random;

public class scenario {
    public static void main(String[] args) {
        A a = new C(); //a parent is holding an object of child
        a.print();

        a = new B();
        a.print();

        a = new C();
        a.print();

        for(int i=0;i<10;i++) {
            A obj = getObj();
            obj.print();
        }
    }
    public static A getObj(){ //this is a method that will randomly give an object of type A or any of its children
        Random r = new Random();
        int random = r.nextInt();//it will give us a random number
        if(random%3==0){  //we can have 3 outputs when we mod the random number with 3. random%3==0, random%3==1,random%3==2
            return new A();
        }
        if(random%3==1){
            return new B();
        }
        return new C();
    }
}
class A{
    void print() {
        System.out.println("A");
    }
}
class B extends A{
    void print(){
        System.out.println("B");
    }
}
class C extends B{
    void print(){
        System.out.println("C");
    }
}
