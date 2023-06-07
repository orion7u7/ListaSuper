package com.unillanos.listasuper.application.services;

import com.unillanos.listasuper.application.usecases.CreatePictureUseCase;
import com.unillanos.listasuper.domain.model.Picture;
import com.unillanos.listasuper.domain.ports.in.IPictureService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PictureService implements IPictureService {

    private final CreatePictureUseCase createPictureUseCase;


    @Override
    public Picture createPicture(Picture picture) {
        return createPictureUseCase.run(picture);
    }



}
