package com.unillanos.listasuper.domain.ports.out;

import com.unillanos.listasuper.domain.model.Location;
import org.springframework.stereotype.Repository;

@Repository
public interface ILocationRepository {

        Location findById(int id);
}
