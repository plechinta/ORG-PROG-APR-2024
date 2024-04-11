package org.prog;

public class BigTruck extends Truck {

    public void addBigCargo(){
        System.out.println("Adding big cargo");
    }

    @Override
    public void goTo() {
        System.out.println(color + " big truck goes somewhere");
    }
}

