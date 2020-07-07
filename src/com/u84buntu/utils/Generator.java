package com.u84buntu.utils;

import java.util.Random;

public final class Generator {
    public final int generateInteger(int bound){
        return new Random().nextInt(bound);
    }

    public final long generateLong(){
        return new Random().nextLong();
    }

    public final float generateFloat(){
        return (float) Math.random();
    }

    public final float randomChoice(float[] array){
        return array[ new Random().nextInt(array.length) ];
    }

    public final int randomChoice(int[] array){
        return array[ new Random().nextInt(array.length) ];
    }

    public final long randomChoice(long[] array){
        return array[ new Random().nextInt(array.length) ];
    }

    public final void fillArray(int[] array, int bound, int arrayLength){
        for (int i = 0; i < arrayLength; i++) {
            array[i] = new Random().nextInt(bound);
        }
    }
    public final void fillArray(int[] array, int bound){
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(bound);
        }
    }

    public final void fillArray(float[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = (float) Math.random();
        }
    }

    public final void fillArray(float[] array, int arrayLength){
        for (int i = 0; i < arrayLength; i++) {
            array[i] = (float) Math.random();
        }
    }

    public final void fillArray(float[] array, int bound, int arrayLength){
        for (int i = 0; i < arrayLength; i++)
            array[i] = (float) new Random().nextInt(bound);
    }

    public final void fillArray(int bound, float[] array){
        for (int i = 0; i < array.length; i++)
            array[i] = (float) new Random().nextInt(bound);
    }
}
