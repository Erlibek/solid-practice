package com.practice.oop.solid.isp;

public class KotlinDeveloper implements IDeveloper, ITester {
    @Override
    public void writeCode() {
        System.out.println("Use Kotlin syntax");
    }

    @Override
    public void refactoring() {
        System.out.println("Refactoring");
    }

    @Override
    public void stressTest() {

    }

    @Override
    public void funcTest() {

    }
}