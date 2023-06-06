package com.unillanos.listasuper.domain.ports.in;

import com.unillanos.listasuper.domain.model.Picture;
import org.springframework.stereotype.Service;

@Service
public interface IPictureService {

    Picture createPicture(Picture picture);
}
