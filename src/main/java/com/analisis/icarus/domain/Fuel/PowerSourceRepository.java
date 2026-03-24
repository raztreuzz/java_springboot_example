package com.analisis.icarus.domain.Fuel;

import java.util.List;
import java.util.Optional;

public interface PowerSourceRepository {

    PowerSource save(PowerSource powerSource);
    Optional<PowerSource> findById(Integer id);
    List<PowerSource> findAll();
    void deleteById(Integer id);
    void updateById(Integer id);

}
