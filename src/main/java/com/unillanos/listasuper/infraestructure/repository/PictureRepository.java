package com.unillanos.listasuper.infraestructure.repository;

import com.unillanos.listasuper.domain.model.Picture;
import com.unillanos.listasuper.domain.ports.out.IPictureRepository;
import com.unillanos.listasuper.infraestructure.entity.PictureEntity;
import com.unillanos.listasuper.infraestructure.mappers.GenericMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PictureRepository implements IPictureRepository {

    @Autowired
    private JPAPictureRepository jpaPictureRepository;

    @Override
    public Picture save(Picture picture) {
        PictureEntity pictureEntity = GenericMapper.map(picture, PictureEntity.class);
        pictureEntity = jpaPictureRepository.save(pictureEntity);
        picture = GenericMapper.map(pictureEntity, Picture.class);
        return picture;
    }
}
