package com.unillanos.listasuper.infraestructure.repository;

import com.unillanos.listasuper.infraestructure.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JPAUserRepository extends CrudRepository<UserEntity, Long> {

    UserEntity findByEmailAndPassword(String email, String password);
}
