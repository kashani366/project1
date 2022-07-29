package com.anisa.model.entity;

import java.util.Random;

public enum Gender {
    female,
    man,
    unknown;

    public static Gender getRandom() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }

    public static void main(String[] args) {
        System.out.println( Gender.getRandom());

    }
}