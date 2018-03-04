package com.zipcodewilmington.froilansfarm.animal.person;

import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.animal.Eater;
import com.zipcodewilmington.froilansfarm.animal.Animal;

public abstract class Person extends Animal implements  Rider{

    public Person(String name, int id) {
        super(name, id);
    }

    public abstract String makeNoise();

    public void eat(Edible anEdible, int amount) {

    }

    public Readable mount(Rideable availableRideable) {
        return null;
    }

    public void disMount(Rideable aRideable) {

    }

}
