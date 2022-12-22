package com.practice.oop.solid.openclosed;

public class JSDeveloper extends Developer {
    // Реализуем метод по-своему
    @Override
    public void writeCode() {
        System.out.println("Use JS syntax");
    }
}