package org.example.OOPS_4.interfaces;

public interface animal { //writing void eat(String s) is fine
    void eat(); //because the interface consists only methods and are abstract, thus we should not write something like "void eat(){...}"
    public abstract void walk(); //notice that public abstract is grey which means Modifier 'abstract' is redundant for interface methods
    void run();
}
