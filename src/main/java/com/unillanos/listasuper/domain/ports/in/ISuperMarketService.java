package com.unillanos.listasuper.domain.ports.in;

import com.unillanos.listasuper.domain.model.SuperMarket;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ISuperMarketService {

    SuperMarket createSuperMarket(SuperMarket superMarket);

    SuperMarket findById(int id);

    Optional<SuperMarket> findByName(String name);

    List<SuperMarket> findAll();




}
