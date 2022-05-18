package com.aula02;

public class TemplateString {
    public static void main(String[] args) {
        String name = "Everton";
        Integer age = 40;
        String city = "Curitiba";

        String message = String.format("Hello! My name is %s, I'm %s and I live in %s.", name, age, city);

        System.out.println(message);
    }
}
