package com.unillanos.listasuper.infraestructure.repository;

import com.unillanos.listasuper.infraestructure.entity.SuperMarketEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface JPASuperMarketRepository extends JpaRepository<SuperMarketEntity, Long> {

    @Query("SELECT s FROM SuperMarketEntity s WHERE s.name = ?1")
    Optional<SuperMarketEntity> findByName(String name);


}
