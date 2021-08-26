package com.seniorglez.jd20;

public class Bonus  implements Rollable {

    private int value;

    public Bonus(int value) {
        this.value = value;
    }

    @Override
    public int[] getResult() {
        int[] result = {value};
        return result;
    }

}