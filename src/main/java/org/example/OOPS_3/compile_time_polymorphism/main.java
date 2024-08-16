package org.example.OOPS_3.compile_time_polymorphism;

public class main {
    public static void main(String[] args) {
        printer p = new printer();
        p.print(); //here java is not confused
        p.print("Hello"); //press cmd and click the word to check exactly where it takes
    }

}
