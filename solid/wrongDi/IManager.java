package com.practice.oop.solid.wrongDi;

// Менеджер проектов
public interface IManager {
    // Менеджер может разговаривать только с Java разработчиком
    void speak(JavaDeveloper developer);
}