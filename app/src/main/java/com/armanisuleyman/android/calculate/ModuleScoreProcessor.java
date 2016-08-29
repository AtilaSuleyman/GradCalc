package com.armanisuleyman.android.calculate;

import java.util.Collection;
import java.util.List;

public  class ModuleScoreProcessor{

    public float calculateAverage(List<Float> weights, List<Float> results) throws IllegalArithmeticException {
        if ((weights.size() != results.size())){
            throw new IllegalArithmeticException();
        }

        float sum = 0;
        for (Float weight : weights) {
            sum += weight;
        }
            float total = 0;
            if (sum > 100) {
                throw new IllegalArithmeticException();
            } else {
                for (int i = 0; i < results.size(); i++){
                    float multiplier = results.get(i)/100;
                    total += multiplier*weights.get(i);
                }
            }
        return total;
    }
}