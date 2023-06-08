package com.unillanos.listasuper.application.usecases;

import com.unillanos.listasuper.domain.model.SuperMarket;
import com.unillanos.listasuper.domain.ports.out.ISuperMarketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ShowSuperMarketUseCase {

    @Autowired
    private ISuperMarketRepository superMarketRepository;

    public List<SuperMarket> run(){
        return superMarketRepository.findAll();
    }




}
