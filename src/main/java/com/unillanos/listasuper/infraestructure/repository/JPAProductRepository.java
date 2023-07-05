package com.unillanos.listasuper.infraestructure.repository;

import com.unillanos.listasuper.infraestructure.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface JPAProductRepository extends JpaRepository<ProductEntity, Long> {

    @Query("SELECT p FROM ProductEntity p WHERE p.name like  CONCAT('%',?1,'%')")
    Optional<ProductEntity> findByName(String name);
}
