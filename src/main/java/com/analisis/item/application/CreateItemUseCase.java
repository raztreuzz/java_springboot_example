package com.analisis.item.application;

import com.analisis.item.domain.item;
import com.analisis.item.infraestructure.persistence.ItemEntity;
import com.analisis.item.infraestructure.persistence.JpaItemRepository;
import org.springframework.stereotype.Service;

@Service
public class CreateItemUseCase {

    private  final JpaItemRepository jpaItemRepository;

    public CreateItemUseCase( JpaItemRepository jpaItemRepository){
      this.jpaItemRepository = intemRepository;
    }

    public item execute(ItemEntity itemEntity){
        return jpaItemRepository.save(itemEntity);
    }


}
