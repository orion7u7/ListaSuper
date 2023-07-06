package com.unillanos.listasuper.infraestructure.repository;

import com.unillanos.listasuper.domain.model.SuperMarket;
import com.unillanos.listasuper.domain.ports.out.ISuperMarketRepository;
import com.unillanos.listasuper.infraestructure.entity.SuperMarketEntity;
import com.unillanos.listasuper.infraestructure.mappers.GenericMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

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

    @Override
    public SuperMarket findById(int id) {
        SuperMarketEntity superMarketEntity = jpaSuperMarketRepository.findById(id);
        SuperMarket superMarket = GenericMapper.map(superMarketEntity, SuperMarket.class);
        return superMarket;
    }

    @Override
    public Optional<SuperMarket> findByName(String name) {
        Optional<SuperMarketEntity> superMarketEntity = jpaSuperMarketRepository.findByName(name);
        if(superMarketEntity.isPresent()){
            SuperMarket superMarket = GenericMapper.map(superMarketEntity.get(), SuperMarket.class);
            return Optional.of(superMarket);
        }
        return Optional.empty();
    }

    @Override
    public List<SuperMarket> findAll() {
         List<SuperMarketEntity> superMarketEntities = jpaSuperMarketRepository.findAll();
         List<SuperMarket> superMarkets = GenericMapper.mapList(superMarketEntities, SuperMarket.class);
         return superMarkets;
    }
}
