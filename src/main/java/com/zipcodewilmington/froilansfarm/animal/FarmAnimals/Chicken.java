package com.zipcodewilmington.froilansfarm.animal.FarmAnimals;

import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.Produce;
import com.zipcodewilmington.froilansfarm.animal.Animal;

public class Chicken extends Animal implements Produce {

    String name;
    int id;

    public Chicken(String name, int id) {
        super(name, id);
    }

    public Edible yield() {

        return null;
    }

    public String makeNoise() {
        return null;
    }
}
