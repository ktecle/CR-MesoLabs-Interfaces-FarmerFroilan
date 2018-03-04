package com.zipcodewilmington.froilansfarm.farmField;

import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.Produce;

public abstract class Crop<T> implements Produce,Edible {

    protected boolean hasBeenHarvested;
    protected Crop<T> aCrop;

    public Crop(Crop<T> cropType){
        this.aCrop = cropType;
        this.hasBeenHarvested=false;
    }

    public Edible yield() {
        return null;
    }

    public boolean isEdible(Edible food) {
        return false;
    }

    public Edible getEdibleFood() {
        return null;
    }
    public Crop getCrop(){
        return this.aCrop;

    }
}
