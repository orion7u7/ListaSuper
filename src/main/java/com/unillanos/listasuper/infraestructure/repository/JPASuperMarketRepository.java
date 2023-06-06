package com.unillanos.listasuper.infraestructure.repository;

import com.unillanos.listasuper.infraestructure.entity.SuperMarketEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JPASuperMarketRepository extends CrudRepository<SuperMarketEntity, Long> {

}
