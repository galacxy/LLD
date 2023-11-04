package com.lld.snnakesladders.model;

import java.util.Random;

public class Dice {
    private static final Random random = new Random();
    private final int faceCount;
    public int rollDice(){
        return random.nextInt(faceCount);
    }
    public Dice(int faceCount){
        this.faceCount = faceCount;
    }
}
