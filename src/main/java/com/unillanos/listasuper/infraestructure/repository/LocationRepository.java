package com.unillanos.listasuper.infraestructure.repository;


import com.unillanos.listasuper.domain.model.Location;
import com.unillanos.listasuper.domain.ports.out.ILocationRepository;
import com.unillanos.listasuper.infraestructure.entity.LocationEntity;
import com.unillanos.listasuper.infraestructure.mappers.GenericMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LocationRepository implements ILocationRepository {

    @Autowired
    private JPALocationRepository jpaLocationRepository;

    @Override
    public Location findById(int id) {
        LocationEntity locationEntity = jpaLocationRepository.findById(id);
        Location location = GenericMapper.map(locationEntity, Location.class);
        return location;
    }
}
