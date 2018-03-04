package com.zipcodewilmington.froilansfarm.FarmParts;

import com.zipcodewilmington.froilansfarm.animal.FarmAnimals.Horse;

import java.util.ArrayList;

public class Stable {
    protected ArrayList<Horse>farmHorses;

    public Stable(){
        this.farmHorses = new ArrayList<Horse>();
    }


    public void addHorse(Horse aHorse){
        farmHorses.add(aHorse);
    }

    public void removeHorse(Horse aHorse){
        farmHorses.remove(aHorse);
    }

    public ArrayList<Horse> getAllHorses(){
        return this.farmHorses;
    }
}
