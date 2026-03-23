package com.analisis.icarus.domain.Fuel;

public class PowerSource implements Fuel {

    private Integer id;
    private String name;
    private PowerType type;
    private float capacity;
    private float efficiency;

    public PowerSource() {

    }

    public PowerSource(Integer id,String name, PowerType type, float capacity, float efficiency) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.capacity = capacity;
        this.efficiency = efficiency;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void setType(PowerType type) {
        this.type = type;
    }

    public void setCapacity(float capacity) {
        this.capacity = capacity;
    }


    @Override
    public float getCapacity() {
        return capacity;
    }

    public void setEfficiency(float efficiency) {
        this.efficiency = efficiency;
    }

    @Override
    public float getEfficiency() {
        return efficiency;
    }

    @Override
    public float getTotalDurationMinutes() {
        return capacity*efficiency;
    }

    @Override
    public PowerType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "PowerSource{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", capacity=" + capacity +
                ", efficiency=" + efficiency +
                '}';
    }
}
