package com.example.java;

public class Main {

    public String sayHello() {
        return "Hello World";
    }

    public static void main(String[] args) {
        System.out.println(new Main().sayHello());
    }
}
