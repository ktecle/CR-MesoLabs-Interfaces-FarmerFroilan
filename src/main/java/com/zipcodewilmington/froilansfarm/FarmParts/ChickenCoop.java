package com.zipcodewilmington.froilansfarm.FarmParts;

import com.zipcodewilmington.froilansfarm.animal.FarmAnimals.Chicken;

import java.util.ArrayList;

public class ChickenCoop {
    protected ArrayList<Chicken>farmChicken;

    public ChickenCoop(){
        this.farmChicken = new ArrayList<Chicken>();
    }

    public void addChicken(Chicken aChicken){
        farmChicken.add(aChicken);
    }

    public void removeChicken(Chicken aChicken){
        farmChicken.remove(aChicken);
    }

    public ArrayList<Chicken> getFarmChicken() {
        return farmChicken;
    }
}
