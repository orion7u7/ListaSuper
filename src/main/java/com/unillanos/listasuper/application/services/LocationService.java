package com.unillanos.listasuper.application.services;

import com.unillanos.listasuper.application.usecases.ShowLocationUseCase;
import com.unillanos.listasuper.domain.model.Location;
import com.unillanos.listasuper.domain.ports.in.ILocationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LocationService implements ILocationService {

    private final ShowLocationUseCase showLocationUseCase;

    @Override
    public Location findById(int id) {
        return showLocationUseCase.run(id);
    }
}

