package com.unillanos.listasuper.domain.ports.out;

import com.unillanos.listasuper.domain.model.SuperMarket;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface ISuperMarketRepository {

    SuperMarket save(SuperMarket superMarket);

    Optional<SuperMarket> findByName(String name);

    List<SuperMarket> findAll();


}
