package com.example.demo.decorator;

public class ConcreateComponent implements Component {

    @Override
    public void doSomething() {
        System.out.println("功能A");
    }
}
