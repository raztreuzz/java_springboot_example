package com.analisis.item.infraestructure.persistence;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public abstract class SqlJpaItemRepository implements JpaItemRepository {

    private final JpaItemRepository jpaItemRepository;


}
