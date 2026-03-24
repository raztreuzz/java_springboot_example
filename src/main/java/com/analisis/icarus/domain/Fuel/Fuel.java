package com.analisis.icarus.domain.Fuel;

public interface Fuel {
    String getName();

    float getCapacity();
    float getEfficiency();

    default float calculateDuration(float consumptionRate){
        if (consumptionRate <= 0){
           throw new IllegalArgumentException("La cantidad de consumo debe ser mayor a cero");
        }
        float effectiveCapacity = getCapacity() * getEfficiency();
        return effectiveCapacity / consumptionRate;
    }

    float getTotalDurationMinutes();

}
