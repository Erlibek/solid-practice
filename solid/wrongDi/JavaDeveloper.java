package com.practice.oop.solid.wrongDi;

public class JavaDeveloper implements IDeveloper, ITester {
    @Override
    public void writeCode() {
        System.out.println("Use Java syntax");
    }

    @Override
    public void refactoring() {

    }

    @Override
    public void stressTest() {

    }

    @Override
    public void funcTest() {
        
    }
}