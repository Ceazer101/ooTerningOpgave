package com.company;

public class Main {

    public static void main(String[] args) {
        Dice dice = new Dice();

       dice.roll();
        System.out.println(dice.getFaceValue());
        System.out.println(dice.getFaceValue());

        dice.roll();
        System.out.println(dice.getFaceValue());


    }
}
