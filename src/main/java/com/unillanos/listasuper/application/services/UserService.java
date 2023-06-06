package com.unillanos.listasuper.application.services;

import com.unillanos.listasuper.application.usecases.CreateUserUseCase;
import com.unillanos.listasuper.application.usecases.LoginUserUseCase;
import com.unillanos.listasuper.domain.model.User;
import com.unillanos.listasuper.domain.ports.in.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService implements IUserService {

    private final CreateUserUseCase createUserUseCase;

    private final LoginUserUseCase loginUserUseCase;


    @Override
    public User createUser(User user) {
        return createUserUseCase.run(user);
    }

    @Override
    public User loginUser(User user) {
        return loginUserUseCase.run(user);
    }
}
