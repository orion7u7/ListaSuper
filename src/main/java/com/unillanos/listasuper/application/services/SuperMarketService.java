package com.unillanos.listasuper.application.services;

import com.unillanos.listasuper.application.usecases.CreateSuperMarketUseCase;
import com.unillanos.listasuper.application.usecases.ShowSuperMarketUseCase;
import com.unillanos.listasuper.domain.model.SuperMarket;
import com.unillanos.listasuper.domain.ports.in.ISuperMarketService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class SuperMarketService implements ISuperMarketService {

    private final CreateSuperMarketUseCase createSuperMarketUseCase;
    private final ShowSuperMarketUseCase showSuperMarketUseCase;

    @Override
    public SuperMarket createSuperMarket(SuperMarket superMarket) {
        return createSuperMarketUseCase.run(superMarket);
    }

    @Override
    public SuperMarket findById(int id) {
        return showSuperMarketUseCase.run(id);
    }

    @Override
    public Optional<SuperMarket> findByName(String name) {
        return showSuperMarketUseCase.run(name);
    }


    @Override
    public List<SuperMarket> findAll() {
        return showSuperMarketUseCase.run();
    }
}
