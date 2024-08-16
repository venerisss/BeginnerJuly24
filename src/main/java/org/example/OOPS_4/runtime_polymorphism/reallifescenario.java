package org.example.OOPS_4.runtime_polymorphism;

import java.util.Random;

public class reallifescenario {
    public static void main(String[] args) {
        for(int i=0;i<10;i++) {
            User user = getObj();
        /*if(user instanceof student){ //this if else block will make the code unnecessarily complex
            //trigger student login
        }else{
            //trigger  instructor login
        }*/
            user.login(); //now which type of login will be triggered will depend on the user present there, thus this runtime polymorphism will help us avoid all the complex if else blocks
        }
    }
    public static User getObj(){
        Random r = new Random();
        int random = r.nextInt();
        if(random%2==0){
            return new student();
        }
        return new instructor();
    }


}

class User{
    String username;
    String password;
    void login(){
        System.out.println(username + "is logging in");
    }
}
class instructor extends User{
    @Override //this w2ill make sure we do not make any mistakes by intellij
    void login(){
        System.out.println(username+" is an instructor");
    }
}
class student extends User{
    @Override //this w2ill make sure we do not make any mistakes by intellij
    void login(){
        System.out.println(username+" is a student and trying to login");
    }

}

