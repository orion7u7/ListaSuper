package com.unillanos.listasuper.domain.ports.out;

import com.unillanos.listasuper.domain.model.SuperMarket;
import org.springframework.stereotype.Repository;


@Repository
public interface ISuperMarketRepository {

    SuperMarket save(SuperMarket superMarket);

}
