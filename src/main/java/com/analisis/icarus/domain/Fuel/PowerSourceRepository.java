package com.analisis.icarus.domain.Fuel;

import java.util.List;
import java.util.Optional;

public interface PowerSourceRepository {

    PowerSource save(PowerSource powerSource);
    Optional<PowerSource> findById(Long id);
    List<PowerSource> findAll();
    void deleteById(Long id);
    void updateById(Long id);

}
