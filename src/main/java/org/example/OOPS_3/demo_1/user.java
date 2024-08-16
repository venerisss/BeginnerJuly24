package org.example.OOPS_3.demo_1;

public class user {
    /*private - if u use private here it will cause error in instructor class*/ String username;
    void login(){ //default access modifier - visibility - any other class in same package
        System.out.println(username+ " is logging in");
    }
}
