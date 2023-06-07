package com.unillanos.listasuper.application.services;

import com.unillanos.listasuper.application.usecases.CreateSuperMarketUseCase;
import com.unillanos.listasuper.domain.model.SuperMarket;
import com.unillanos.listasuper.domain.ports.in.ISuperMarketService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class SuperMarketService implements ISuperMarketService {

    private final CreateSuperMarketUseCase createSuperMarketUseCase;

    @Override
    public SuperMarket createSuperMarket(SuperMarket superMarket) {
        return createSuperMarketUseCase.run(superMarket);
    }
}
