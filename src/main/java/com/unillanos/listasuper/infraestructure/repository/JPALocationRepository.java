package com.unillanos.listasuper.infraestructure.repository;

import com.unillanos.listasuper.infraestructure.entity.LocationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface JPALocationRepository extends JpaRepository<LocationEntity, Long> {

    @Query("SELECT l FROM LocationEntity l WHERE l.market.id = ?1")
    LocationEntity findById(int id);
}
