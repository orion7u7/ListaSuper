package com.unillanos.listasuper.infraestructure.repository;

import com.unillanos.listasuper.infraestructure.entity.SuperMarketEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface JPASuperMarketRepository extends JpaRepository<SuperMarketEntity, Long> {

    @Query("SELECT s FROM SuperMarketEntity s WHERE s.id = ?1")
    SuperMarketEntity findById(int id);

    @Query("SELECT s FROM SuperMarketEntity s WHERE s.name like  CONCAT('%',?1,'%')")
    Optional<SuperMarketEntity> findByName(String name);


}
