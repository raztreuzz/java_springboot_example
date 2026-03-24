package com.analisis.icarus.domain.Extractor;

public interface ExtractorRate {
    float getBaseExtractionRate();
    float getTypeMultiplier();

    default float calculateExtractionPerMinute(){
        float baseRate = getBaseExtractionRate();
        float multiplier = getTypeMultiplier();

        if(baseRate <= 0){
            throw  new IllegalArgumentException("Base Rate Extraction rate must than 0");
        }
        if(multiplier <= 0){
            throw new IllegalArgumentException("Type multiplier must be grater than 0");
        }

        return baseRate * multiplier;
    }


}
