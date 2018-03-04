package com.zipcodewilmington.froilansfarm.animal.FarmAnimals;

import com.zipcodewilmington.froilansfarm.animal.Animal;
import com.zipcodewilmington.froilansfarm.Rideable;

public class Horse extends Animal implements Rideable{
    protected String name;
    protected int id;
    Horse horse;

    protected Horse(String name, int id){
        super(name, id);
    }

    public boolean isMounted() {
        return false;
    }

    public String makeNoise() {
        return null;
    }
    public String getName(){
        return this.name;
    }

}
