package com.volgatech.javacore2018.lab4.supermarket.applicationhost.utill;

import java.util.Random;

public class RandomNumber {
    private RandomNumber() {
    }

    public static int getNumber(Integer min, Integer max) {
        Random rand = new Random();
        return min + rand.nextInt(max);
    }

    public static int getNumber(Integer max) {
        return getNumber(0, max);
    }
}
