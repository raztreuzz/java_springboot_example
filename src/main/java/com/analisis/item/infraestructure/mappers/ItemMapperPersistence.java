package com.analisis.item.infraestructure.mappers;

import com.analisis.item.infraestructure.persistence.ItemEntity;
import com.analisis.item.domain.item;
import org.springframework.stereotype.Component;

@Component
public class ItemMapperPersistence {

    public item entitydomain(){
        return  new item(
                ItemEntity.getId(),
                ItemEntity.getName(),
                ItemEntity.getSale();
        )
    }

    public  ItemEntity domainToEntinty(item item)

}
