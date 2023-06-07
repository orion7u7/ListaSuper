package com.unillanos.listasuper.infraestructure.repository;

import com.unillanos.listasuper.domain.model.Picture;
import com.unillanos.listasuper.domain.model.SuperMarket;
import com.unillanos.listasuper.domain.ports.out.ISuperMarketRepository;
import com.unillanos.listasuper.infraestructure.entity.PictureEntity;
import com.unillanos.listasuper.infraestructure.entity.SuperMarketEntity;
import com.unillanos.listasuper.infraestructure.mappers.GenericMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SuperMarketRepository implements ISuperMarketRepository {

    @Autowired
    private JPASuperMarketRepository jpaSuperMarketRepository;
    @Autowired
    private JPAPictureRepository jpaPictureRepository;



    @Override

    public SuperMarket save(SuperMarket superMarket) {
        SuperMarketEntity superMarketEntity = GenericMapper.map(superMarket, SuperMarketEntity.class);
        PictureEntity pictureEntity = jpaPictureRepository.save(superMarketEntity.getPicture());
        superMarketEntity.setPicture(pictureEntity);
        superMarketEntity = jpaSuperMarketRepository.save(superMarketEntity);
        superMarket = GenericMapper.map(superMarketEntity, SuperMarket.class);
        return superMarket;

    }

}
