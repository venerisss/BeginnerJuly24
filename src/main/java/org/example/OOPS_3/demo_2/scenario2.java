package org.example.OOPS_3.demo_2;

public class scenario2{ //similar name classes cannot be present in java
    public static void main(String[] args) {

    }
}
class AA{
    public AA() {
        System.out.println("AA");
    }
}
class BB extends AA{
    public BB(){ //make this private to get a new error 1 usage below
        System.out.println("BB");
    }
}
class CC extends BB{ //as soon as we change public to private, There is no default constructor available in 'org.example.OOPS_3.demo_2.BB'
    public  CC(){
        System.out.println("CC");
    }
}
