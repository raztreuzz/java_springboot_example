package com.analisis.icarus.domain.resource;

import java.util.List;
import java.util.Optional;

public interface ResourceRepository {

    Resource save(Resource resource);
    Optional <Resource> findById(Integer id);
    List<Resource> findAll();
    List<Resource> findByName (String name);
    void updated(Integer id);
    void delete(Integer id);
}
