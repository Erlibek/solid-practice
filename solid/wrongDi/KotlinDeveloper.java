package com.practice.oop.solid.wrongDi;

public class KotlinDeveloper implements IDeveloper, ITester {
    @Override
    public void writeCode() {
        System.out.println("Use Kotlin syntax");
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