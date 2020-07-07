package com.u84buntu.utils;

import java.util.Arrays;

public class ArrayUtil {
    public float[] multipleArray(float[] firstArr, float[] secondArr){
        float[] array = new float[secondArr.length];
        for (int i = 0; i < firstArr.length; i++) {
            array[i] = firstArr[i] * secondArr[i];
        }
        return array;
    }
}