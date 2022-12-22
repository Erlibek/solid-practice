package com.practice.oop.solid.wrongLiskov;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Developer dev1 = new JavaDeveloper();
        dev1.setLangName("Java");

        Developer dev2 = new JSDeveloper();
        dev2.setLangName("JS");

        List<Developer> devList = new ArrayList<>();
        devList.add(dev1);
        devList.add(dev2);

        reaction(devList);
    }

    // Неверный подход SOLID
    public static void reaction(List<Developer> devList) {
        for (Developer dev: devList) {
            if (dev instanceof JavaDeveloper) {
                System.out.println("Cool");
            } else if (dev instanceof JSDeveloper) {
                System.out.println("Not bad");
            } else {
                System.out.println("Default");
            }
        }
    }
}