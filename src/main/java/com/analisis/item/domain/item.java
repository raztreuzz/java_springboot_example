package com.analisis.item.domain;

public class item {
    private Integer id;
    private  String name;
    private Double SalePrice;
    private Boolean active;

    public item(){

    }

    public item(Integer id, String name, Boolean active, Double sale_price) {
        this.id = id;
        setName(name);
        this.active = active;
        setSale_price(sale_price);
    }

    public Double getSale_price() {

        return SalePrice;
    }

    public void setSale_price(Double sale_price) {
        if(sale_price >= 0) {
            this.SalePrice = sale_price;
        }
        else{
            throw new RuntimeException("El precio no puede ser negativo");
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(!name.isBlank()) {
            this.name = name;
        }else{
            throw new RuntimeException("El nombre esta vacio!!");
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sale_price=" + SalePrice +
                ", active=" + active +
                '}';
    }
}
