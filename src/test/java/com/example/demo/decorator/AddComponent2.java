package com.example.demo.decorator;

public class AddComponent2 extends Decorator {

    public AddComponent2(Component component) {
        super(component);
    }

    @Override
    public void doSomething() {
        super.doSomething();
        doOhterThing();
    }

    public void doOhterThing() {
        System.out.println("功能C");
    }
}
