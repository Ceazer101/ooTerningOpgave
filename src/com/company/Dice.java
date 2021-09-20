package com.company;

import java.util.Random;

public class Dice {

    private int faceValue;


    public Dice(){
        this.faceValue = faceValue;

    }

    public void roll(){
        Random rn = new Random();
        faceValue = rn.nextInt(6)+1;
    }

    public int getFaceValue(){
        return faceValue;
    }

    @Override
    public String toString() {
        return "Terningen viser: " + getFaceValue();
    }
}
