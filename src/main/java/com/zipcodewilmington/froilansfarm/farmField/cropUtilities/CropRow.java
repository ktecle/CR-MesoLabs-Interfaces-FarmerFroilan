package com.zipcodewilmington.froilansfarm.farmField.cropUtilities;

import com.zipcodewilmington.froilansfarm.farmField.Crop;

import java.util.ArrayList;

public class CropRow {
    protected Crop aCrop;
    protected int numberOfCropPlants;
    protected int cropRowId;
    protected boolean hasBeenHarvested;
    private Crop crop;

    public CropRow(Crop aCrop, int numberOfCropPlants,int id, boolean hasBeenHarvesed){
        this.aCrop =aCrop;
        this.numberOfCropPlants=numberOfCropPlants;
        this.cropRowId =id;
        this.hasBeenHarvested=hasBeenHarvesed;
    }
    public Crop getCrop(){
        return this.aCrop;
    }

    public int getNumberOfCropPlants() {
        return numberOfCropPlants;
    }

    public boolean hasBeenHarvested(){
        return hasBeenHarvested;
    }

    public int getId(){
        return cropRowId;
    }
}
