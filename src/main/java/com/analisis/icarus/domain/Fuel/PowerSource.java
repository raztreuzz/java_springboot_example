package com.analisis.icarus.domain.Fuel;

public class PowerSource implements Fuel {

    private Integer id;
    private String name;
    private PowerType type;
    private PowerSourceType source;
    private float capacity;
    private float efficiency;

    public PowerSource(Integer id, String name, PowerType type, PowerSourceType source, float capacity, float efficiency) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.source = source;
        setCapacity(capacity);
        setEfficiency(efficiency);

    }

    public PowerSource(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String getName() {

        return name;
    }

    public void setName(String name) {

        if(name == null || name.isBlank()){
            throw new IllegalArgumentException("name cannot be null or blank");
        }

        this.name = name;
    }

    public PowerType getType() {
        return type;
    }

    public void setType(PowerType type) {
        if(type == null){
            throw new IllegalArgumentException("type cannot be null");
        }
        this.type = type;
    }

    public PowerSourceType getSource() {
        return source;
    }

    public void setSource(PowerSourceType source) {
        if(source == null)
        {
            throw new IllegalArgumentException("source cannot be null");
        }
        this.source = source;
    }

    @Override
    public float getCapacity() {
        return capacity;
    }

    public void setCapacity(float capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be greater than 0");
        }
        this.capacity = capacity;
    }

    @Override
    public float getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(float efficiency) {
        if (efficiency <= 0 || efficiency > 1) {
            throw new IllegalArgumentException("Efficiency > 0, debe ser mayor a cero");
        }
        this.efficiency = efficiency;
    }
    //Utils

    @Override
    public float getTotalDurationMinutes() {
        return capacity * efficiency;
    }

    @Override
    public String toString() {
        return "PowerSource{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", source=" + source +
                ", capacity=" + capacity +
                ", efficiency=" + efficiency +
                '}';
    }
}
