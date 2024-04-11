package org.prog;

public class Car implements IMovable {

    public String color;

    public void goTo() {
        System.out.println(color + " car goes somewhere");
    }
}

