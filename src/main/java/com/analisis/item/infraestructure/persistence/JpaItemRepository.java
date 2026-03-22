package com.analisis.item.infraestructure.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaItemRepository extends JpaRepository<ItemEntity, Integer> {


}
