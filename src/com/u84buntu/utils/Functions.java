package com.u84buntu.utils;

public final class Functions {

    public static float Sigmoid(float x){
        return (float) (1 / (1 + Math.exp(-x)));
    }
    public static float LogisticFunction(float x){
        return (float) (1 / (1 + 1 / Math.exp(x)));
    }

    public static float ReLU(float x){
        float y = 0;
        if (x < 0) y = 0;
        else if (x >= 0) y = x;
        return y;
    }
}
