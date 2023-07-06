package com.unillanos.listasuper.application.usecases;

import com.unillanos.listasuper.domain.model.Location;
import com.unillanos.listasuper.domain.ports.out.ILocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShowLocationUseCase {

    @Autowired
    private ILocationRepository locationRepository;

    public Location run(int id){
        return locationRepository.findById(id);
    }
}
