package com.analisis.icarus.domain.resource;

public class Resource {
    private Integer id;
    private String name;
    private ResourceType type;
    private String utilities;

    public Resource(Integer id, String name, ResourceType type, String utilities) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.utilities = utilities;
    }

    public Resource(){

    }

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
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public ResourceType getType() {
        return type;
    }

    public void setType(ResourceType type) {
        this.type = type;
    }

    public String getUtilities() {
        return utilities;
    }

    public void setUtilities(String utilities) {
        this.utilities = utilities;
    }
}
