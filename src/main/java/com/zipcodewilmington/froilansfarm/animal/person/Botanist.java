package com.zipcodewilmington.froilansfarm.animal.person;

import com.zipcodewilmington.froilansfarm.farmField.Crop;
import com.zipcodewilmington.froilansfarm.farmField.cropUtilities.CropRow;

public interface Botanist {

    //The botanist plants one farmField type in one specific CropRow.

    public boolean plant(Crop cropType, CropRow cropRowIndex);
}
