package com.practice.oop.solid.wrongLiskov;

public class JSDeveloper extends Developer {
    @Override
    public void writeCode() {
        System.out.println("Use JS syntax");
    }
}