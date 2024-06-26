package org.prog;

public class Car implements IMovable {

    public String color;

    public void goTo() {
        System.out.println(color + " car goes somewhere");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Car){
            boolean match = this.color.equals(((Car) obj).color);
            return match;
        }
        return false;
    }

    @Override
    public int hashCode(){
        return this.color.hashCode();
    }

    @Override
    public String toString(){
        return "This car's color is " + color;
    }
}

