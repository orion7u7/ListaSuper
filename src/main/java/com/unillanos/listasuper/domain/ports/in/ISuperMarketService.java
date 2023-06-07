package com.unillanos.listasuper.domain.ports.in;

import com.unillanos.listasuper.domain.model.SuperMarket;
import org.springframework.stereotype.Service;

@Service
public interface ISuperMarketService {

    SuperMarket createSuperMarket(SuperMarket superMarket);



}
