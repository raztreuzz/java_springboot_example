package com.analisis.icarus.domain.Extractor;

import com.analisis.icarus.domain.Fuel.PowerSource;
import com.analisis.icarus.domain.Fuel.PowerSourceType;
import com.analisis.icarus.domain.resource.Resource;

public class Extractor implements  ExtractorRate{

    private Integer id;
    private String name;
    private ExtractorStatus status;
    private ExtractorType type;
    private Resource resource;
    private PowerSource power;
    private float baseRate;

    public Extractor(Integer id, String name, ExtractorStatus status, ExtractorType type, PowerSource power, Resource resource, float baseRate) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.type = type;
        this.power = power;
        setBaseRate(baseRate);
        validatePowerCompatibility();
    }
    public Extractor(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.isBlank()){
            throw new IllegalArgumentException("Name Cannot be empty");
        }
        this.name = name;
    }

    public ExtractorStatus getStatus() {
        return status;
    }

    public void setStatus(ExtractorStatus status) {
        if(status ==  null ){
            throw  new IllegalArgumentException("status cannot be null");
        }
        this.status = status;
    }

    public ExtractorType getType() {
        return type;
    }

    public void setType(ExtractorType type) {
        if(type == null){
            throw new IllegalArgumentException("TYPE CANNOT BE NULL");
        }
        this.type = type;
        validatePowerCompatibility();
    }

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        if(resource == null){
            throw  new IllegalArgumentException("resource cannot be null");
        }
        this.resource = resource;
    }

    public PowerSource getPower() {
        return power;
    }

    public void setPower(PowerSource power) {
        if(power == null){
            throw new IllegalArgumentException("POWER SOURCE CANNOT BE NULL");
        }
        this.power = power;
    }

    public float getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(float baseRate) {
        if(baseRate <= 0){
            throw new IllegalArgumentException("base rate must be greater than 0");
        }
        this.baseRate = baseRate;
    }

    @Override
    public float getBaseExtractionRate() {
        return baseRate;
    }

    @Override
    public float getTypeMultiplier() {
        if(type == null){
            throw new IllegalArgumentException("Extractor type is not defined");
        }
        return switch (type){
            case BIOFUEL_EXTRACTOR -> 1.0f;
            case ELECTRICITY_EXTRACTOR -> 1.55f;
        };
    }

    @Override
    public float calculateExtractionPerMinute() {
        validatePowerCompatibility();
        return ExtractorRate.super.calculateExtractionPerMinute();
    }

    private void validatePowerCompatibility(){
        if(type == null || power == null || power.getSource() == null){
            return;
        }

        if(type == ExtractorType.BIOFUEL_EXTRACTOR && power.getSource() != PowerSourceType.BIOFUEL){
            throw new IllegalArgumentException("Biofuel_Extractor requires a Biofuel power Source");
        }

        if(type == ExtractorType.ELECTRICITY_EXTRACTOR && power.getSource() != PowerSourceType.ELECTRICITY){
            throw new IllegalArgumentException("Electricity_Extractor requires an Electricity Source");
        }
    }

    @Override
    public String toString() {
        return "Extractor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", type=" + type +
                ", resource=" + resource +
                ", power=" + power +
                ", baseRate=" + baseRate +
                '}';
    }
}
