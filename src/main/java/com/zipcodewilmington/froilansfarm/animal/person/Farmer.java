package com.zipcodewilmington.froilansfarm.animal.person;

import com.zipcodewilmington.froilansfarm.farmField.Crop;
import com.zipcodewilmington.froilansfarm.farmField.cropUtilities.CropRow;

public class Farmer extends Person implements Botanist{


    public Farmer(String name, int id) {
        super(name, id);
    }

    public boolean plant(Crop cropType, CropRow cropRowIndex) {
        return false;
    }
    public String makeNoise() {
        return null;
    }
}
