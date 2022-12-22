package com.practice.oop.solid.wrongOpenClosed;

public class Developer {
    private String langName;

    public String getLangName() {
        return langName;
    }

    public void setLangName(String langName) {
        this.langName = langName;
    }

    // Неправильно по SOLID: в зависимости от названия языка - реализуем нужный функционал
    // Если будут добавляться новые языки (расширение класса) - придется добавлять новый if
    // - а это модификация базового класса и это нарушение принципа open closed

    public void writeCode() {
       if (langName.equals("Java")) {
           System.out.println("Use Java syntax");
       } else if (langName.equals("JS")) {
               System.out.println("Use JS syntax");
       } else if (langName.equals("Swift")) {
           System.out.println("Use Swift syntax");
       } else {
           System.out.println("Use default syntax");
       }
    }

    public void eat() {

    }
}