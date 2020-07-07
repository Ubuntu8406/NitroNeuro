package com.u84buntu.neurons;

import com.u84buntu.utils.Generator;

public class HiddenLayer {
    float[] firstWeights;
    Generator generator;
    int count;

    public HiddenLayer(int count) {
        this.generator = new Generator();
        this.firstWeights = new float[this.count = count];
    }

    public void setWeights(float[] firstWeights) {
        generator.fillArray(firstWeights);
    }
}
