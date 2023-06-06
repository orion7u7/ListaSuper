package com.unillanos.listasuper.infraestructure.repository;

import com.unillanos.listasuper.domain.model.User;
import com.unillanos.listasuper.domain.ports.out.IUserRepository;
import com.unillanos.listasuper.infraestructure.entity.UserEntity;
import com.unillanos.listasuper.infraestructure.mappers.GenericMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository implements IUserRepository {

    @Autowired
    private JPAUserRepository jpaUserRepository;

    @Override
    public User save(User user) {
        UserEntity userEntity = GenericMapper.map(user, UserEntity.class);
        userEntity = jpaUserRepository.save(userEntity);
        user = GenericMapper.map(userEntity, User.class);
        return user;
    }

    @Override
    public User login(User user) {
        UserEntity userEntity = jpaUserRepository.findByEmailAndPassword(user.getEmail(), user.getPassword());
        user = GenericMapper.map(userEntity, User.class);
        return user;
    }


}
