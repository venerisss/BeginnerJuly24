package org.example.OOPS_3.demo_2;

public class scenario3 {
}
class AAA{
    public AAA() {
        System.out.println("AAA");
    }
}
class BBB extends AAA{
    public BBB(String s){ //parametrised constructor 1

        System.out.println("BBB"+s);
    }
    public BBB(String s, int i){ //parametrised constructor 2
        System.out.println("BBB");
    }
    public BBB(){ //no args constructor
        System.out.println("BBB");
    }
}
class CCC extends BBB{
    public  CCC(){
        //super("Hello"); //using the super keyword here we resolve the error for using parametrised constructor 1 in class BBB
        super("Hello", 5); //this will help map java to parametrised constructor 2
        //if we want to call the no args constructor, then comment off the super keyword or remove the super keyword so java does not map it to parametrised constructors 1 and 2
        System.out.println("CCC"); //thus super should be present before the CCC's constructor as BBB is parent of CCC and should be executed before
    }
}