package com.zipcodewilmington.froilansfarm.farmMachineries;

public class Tractor extends Vehicle implements FarmVehicle {

    public Tractor(String type) {
        super(type);
    }

    public void harvest(){

    }

    public String makeNoise() {
        return null;
    }

    public boolean isCurrentlyOperating(Vehicle aFarmMachine) {
        return false;
    }

    public void operate() {

    }
}
