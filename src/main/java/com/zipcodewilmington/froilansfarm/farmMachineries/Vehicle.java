package com.zipcodewilmington.froilansfarm.farmMachineries;

import com.zipcodewilmington.froilansfarm.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Rideable;

public abstract class Vehicle<T> implements NoiseMaker,Rideable{

    //protected Vehicle<T>vehicleType;
    protected String vehicleType;

    public Vehicle( String type){
        this.vehicleType= type;

    }
    public String getVehicleType(){
        return this.vehicleType;
    }
    public String makeNoise() {
        return null;
    }

    public boolean isMounted() {
        return false;
    }
}
