package com.practice.oop.solid.wrongIsp;

public class KotlinDeveloper implements IUniversal {
    @Override
    public void writeCode() {
        System.out.println("Use Kotlin syntax");
    }

    @Override
    public void refactoringCode() {
        System.out.println("Refactoring");
    }

    @Override
    public void stressTest() {

    }

    @Override
    public void funcTest() {

    }
}