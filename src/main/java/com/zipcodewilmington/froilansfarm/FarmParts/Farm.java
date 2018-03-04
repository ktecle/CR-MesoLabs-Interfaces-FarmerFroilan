package com.zipcodewilmington.froilansfarm.FarmParts;

import com.zipcodewilmington.froilansfarm.animal.Animal;

import javax.swing.text.AsyncBoxView;
import java.util.ArrayList;

public class Farm {
    protected ArrayList<Stable> froilanStable;
    protected FarmHouse froilanFarmHouse;
    protected ArrayList<ChickenCoop> froilanChickenCoop;

    protected String name;

    public Farm(String name){
        this.name = name;
    }

    public ArrayList<Animal>getAllAnimals(){
        ArrayList<Animal>allAnimals = new ArrayList<Animal>();
        for (Stable s:froilanStable) {
            for (int i = 0; i < s.farmHorses.size(); i++) {
                allAnimals.add(s.farmHorses.get(i));
            }
        }
        for(ChickenCoop c: froilanChickenCoop){
                for(int j =0;j<c.farmChicken.size();j++){
                    allAnimals.add(c.farmChicken.get(i));
                }
        }

        return allAnimals;
    }

}
