package com.unillanos.listasuper.domain.ports.in;

import com.unillanos.listasuper.domain.model.User;
import org.springframework.stereotype.Service;

@Service
public interface IUserService {
    User createUser(User user);
    User loginUser(User user);
}
