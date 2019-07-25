package com.example.demo.decorator;

public class Test {

    public static void main(String[] args) {

        Component component = new AddComponent2(new AddComponent1(new ConcreateComponent()));
        component.doSomething();
    }
}
