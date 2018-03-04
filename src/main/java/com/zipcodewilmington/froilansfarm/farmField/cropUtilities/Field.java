package com.zipcodewilmington.froilansfarm.farmField.cropUtilities;

import com.zipcodewilmington.froilansfarm.farmField.Crop;

import java.util.ArrayList;

public class Field {
    protected ArrayList<CropRow>farmCrop;

    public boolean addCropRow(CropRow aCropRow){

        farmCrop.add(aCropRow);
        return false;
    }

    public void remove(CropRow row){
        farmCrop.remove(row);
    }

    public boolean checkHarvestStatusByRowId(int id){
        return false;
    }
}
