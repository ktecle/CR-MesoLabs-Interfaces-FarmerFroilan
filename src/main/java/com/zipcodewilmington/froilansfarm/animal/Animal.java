package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.NoiseMaker;

public abstract class Animal<T> implements Eater,NoiseMaker,Edible {
    protected String name;
    protected int id;

    public Animal(String name, int id){
        this.name = name;
        this.id =id;
    }
    public abstract String makeNoise();

    public String getName(){
        return this.name;
    }
    public int getId(){
        return this.id;
    }

    public void eat(Edible anEdible, int amount) {

    }


    public boolean isEdible(Edible food) {
        return false;
    }

    public Edible getEdibleFood() {
        return null;
    }
}
