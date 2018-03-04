package com.zipcodewilmington.froilansfarm.farmMachineries;

public class CropDuster extends AirCraft implements FarmVehicle{

    public CropDuster(String type) {
        super(type);
    }

    public boolean isCurrentlyOperating(Vehicle aFarmMachine) {
        return false;
    }

    public void operate() {

    }
}
