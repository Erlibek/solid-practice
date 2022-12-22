package com.practice.oop.solid.wrongLiskov;

public class JavaDeveloper extends Developer {
    @Override
    public void writeCode() {
        System.out.println("Use Java syntax");
    }
}