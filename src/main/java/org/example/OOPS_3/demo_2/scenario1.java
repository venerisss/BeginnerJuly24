package org.example.OOPS_3.demo_2;

public class scenario1 {
    public static void main(String[] args) {
        C c = new C();
        // the final output is:
        //A
        //B
        //C because for a child class all its parents constructors are also inherited
    }
}
class A{
    public A(){
        System.out.println("A");
    }
}
class B extends A{
    public B(){
        System.out.println("B");
    }
}
class C extends B{
    public C(){
        System.out.println("C");
    }
}
