package com.practice.oop.solid.isp;

public class JavaDeveloper implements IDeveloper, ITester {
    @Override
    public void writeCode() {
        System.out.println("Use Java syntax");
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