package org.example.OOPS_3.demo_3;

import java.sql.SQLOutput;

public class main {
    public static void main(String[] args) {
        C c = new C();
        System.out.println("debug");
        A a = c; //we are pointing the same object but with another variable
        System.out.println(a.a);
        System.out.println(a.b);
        //System.out.println(a.c); we are not able to print c, because the class A does not know that c exists in its children
        System.out.println(c.c); //this is allowed because class C is aware that something like c exists
    }
}

class A{
    int a,b;
}
class B extends A{
    int c;
}
class C extends B{
    int d;
}
