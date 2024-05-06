package org.prog;

public class Car implements IMovable {

    public String color;
    public String plateNumber;

    public void goTo() {
        System.out.println(color  + " " + plateNumber + " car goes somewhere");
    }

    @Override
    public boolean equals (Object obj)
    if(color == null || plateNumber == null){
        throw new RuntimeException("Цвет Цвет и номер автомобиля не могут быть пустыми.")}

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Car){
            boolean match = this.color.equals(((Car) obj).color) && this.plateNumber.equals(((Car)  obj).plateNumber);
            return match;
        }
        return false;
    }

    @Override
    public int hashCode(){
        int result = 17;
        result = 31 * result + color.hashCode();
        result = 31 * result + plateNumber.hashCode();
        if (color == null || plateNumber == null) {
            throw new RuntimeException("Цвет или номер автомобиля не могут быть пустыми.");
        }
        return result;

    }


    @Override
    public String toString(){
        return "This car's plate number is "  + plateNumber + "and color is " + color;
    }


}

