package com.unillanos.listasuper.infraestructure.repository;

import com.unillanos.listasuper.domain.model.SuperMarket;
import com.unillanos.listasuper.domain.ports.out.ISuperMarketRepository;
import com.unillanos.listasuper.infraestructure.entity.SuperMarketEntity;
import com.unillanos.listasuper.infraestructure.mappers.GenericMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SuperMarketRepository implements ISuperMarketRepository {

    @Autowired
    private JPASuperMarketRepository jpaSuperMarketRepository;

    @Override
    public SuperMarket save(SuperMarket superMarket) {
        SuperMarketEntity superMarketEntity = GenericMapper.map(superMarket, SuperMarketEntity.class);
        superMarketEntity = jpaSuperMarketRepository.save(superMarketEntity);
        superMarket = GenericMapper.map(superMarketEntity, SuperMarket.class);
        return superMarket;
    }

}
