package org.prog;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        car.color = "red";
//        car.goTo();

        Truck truck = new Truck();
        truck.color = "green";
//        truck.goTo();
        truck.putSmallCargo();

        BigTruck bigTruck = new BigTruck();
        bigTruck.color = "yellow";
//        bigTruck.goTo();
        bigTruck.putSmallCargo();
        bigTruck.addBigCargo();

        VeryBigTruck veryBigTruck = new VeryBigTruck();
        veryBigTruck.color = "black";

        Bicycle bicycle = new Bicycle();
        smth(car);
        smth(truck);
        smth(bigTruck);
        smth(veryBigTruck);
        smth(bicycle);
    }

    public static void smth(IMovable iMovable) {
        iMovable.goTo();
    }
}
