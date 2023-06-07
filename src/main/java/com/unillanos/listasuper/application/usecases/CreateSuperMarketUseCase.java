package com.unillanos.listasuper.application.usecases;

import com.unillanos.listasuper.domain.model.SuperMarket;
import com.unillanos.listasuper.domain.ports.out.ISuperMarketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreateSuperMarketUseCase {

    @Autowired
    private ISuperMarketRepository superMarketRepository;

    public SuperMarket run(SuperMarket superMarket){
        return superMarketRepository.save(superMarket);
    }


}
