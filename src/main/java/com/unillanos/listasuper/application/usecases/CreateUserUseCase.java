package com.unillanos.listasuper.application.usecases;

import com.unillanos.listasuper.domain.model.User;
import com.unillanos.listasuper.domain.ports.out.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreateUserUseCase {

    @Autowired
    private IUserRepository userRepository;


    public User run(User user) {
        return userRepository.save(user);
    }
}
