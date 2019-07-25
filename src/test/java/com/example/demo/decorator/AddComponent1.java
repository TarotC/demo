package com.example.demo.decorator;

public class AddComponent1 extends Decorator {

    public AddComponent1(Component component) {
        super(component);
    }

    @Override
    public void doSomething() {
        super.doSomething();
        doOtherthing();
    }

    public void doOtherthing() {
        System.out.println("功能B");
    }
}
