package com.unillanos.listasuper.domain.ports.out;

import com.unillanos.listasuper.domain.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository {
    User save(User user);
    User login(User user);
}
