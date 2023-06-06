package com.unillanos.listasuper.application.usecases;

import com.unillanos.listasuper.domain.model.Picture;
import com.unillanos.listasuper.domain.ports.out.IPictureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreatePictureUseCase {

    @Autowired
    private IPictureRepository pictureRepository;

    public Picture run(Picture picture){return pictureRepository.save(picture);
    }
}
