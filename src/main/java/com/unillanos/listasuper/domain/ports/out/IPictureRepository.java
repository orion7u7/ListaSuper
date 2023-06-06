package com.unillanos.listasuper.domain.ports.out;

import com.unillanos.listasuper.domain.model.Picture;
import org.springframework.stereotype.Repository;

@Repository
public interface IPictureRepository {

    Picture save(Picture picture);
}
