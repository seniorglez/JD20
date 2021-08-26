package com.seniorglez.jd20;

import java.util.Random;

public class Dice implements Rollable {

    private int numberOfFaces;
    private int numberOfDices;

    public Dice(int numberOfFaces, int numberOfDices) {
        this.numberOfDices = numberOfDices;
        this.numberOfFaces = numberOfFaces;
    }

    public Dice(int numberOfFaces) {
        this(numberOfFaces, 1);
    }

    @Override
    public int[] getResult() {
        int[] result = new int[numberOfDices];
        for (int i = 0; i < numberOfDices; i++) {
            result[i] = thow();
        }
        return result;
    }

    private int thow() {
        return new Random().nextInt(numberOfFaces) + 1;
    }

}