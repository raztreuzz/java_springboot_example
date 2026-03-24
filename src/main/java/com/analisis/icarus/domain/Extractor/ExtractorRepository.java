package com.analisis.icarus.domain.Extractor;

import java.util.List;
import java.util.Optional;

public interface ExtractorRepository {

    Extractor save(Extractor extractor);
    Optional<Extractor> findById(Integer id);
    List<Extractor> findAll();
    void findByType(ExtractorType type);
    void update(Integer id);
    void delete(Integer id);

}
