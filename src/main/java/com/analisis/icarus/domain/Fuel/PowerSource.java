package com.analisis.icarus.domain.Fuel;

public class PowerSource implements Fuel {

    private String name;
    private PowerType type;
    private float capacity;
    private float efficiency;

    public PowerSource() {

    }

    public PowerSource(String name, PowerType type, float capacity, float efficiency) {
        this.name = name;
        this.type = type;
        this.capacity = capacity;
        this.efficiency = efficiency;

    }


    @Override
    public String getName() {
        return "";
    }

    @Override
    public float getCapacity() {
        return 0;
    }

    @Override
    public float getEfficiency() {
        return 0;
    }

    @Override
    public float getTotalDurationMinutes() {
        return 0;
    }

    @Override
    public PowerType getType() {
        return null;
    }


}
