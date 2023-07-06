package com.unillanos.listasuper.domain.ports.in;

import com.unillanos.listasuper.domain.model.Location;
import org.springframework.stereotype.Service;

@Service
public interface ILocationService {

    Location findById(int id);
}
