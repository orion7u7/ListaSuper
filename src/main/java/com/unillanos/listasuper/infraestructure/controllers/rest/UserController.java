package com.unillanos.listasuper.infraestructure.controllers.rest;

import com.unillanos.listasuper.infraestructure.controllers.constatnt.UserConstants;
import com.unillanos.listasuper.infraestructure.controllers.transfer.dto.UserDTO;
import com.unillanos.listasuper.infraestructure.controllers.transfer.responses.GenericResponse;
import com.unillanos.listasuper.infraestructure.mappers.GenericMapper;
import com.unillanos.listasuper.domain.model.User;
import com.unillanos.listasuper.domain.ports.in.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {

    private final IUserService userService;
    private final GenericMapper mapper = new GenericMapper();

    @PostMapping
    public ResponseEntity createUser(@RequestBody UserDTO user) {
        User userCreated = userService.createUser(mapper.map(user, User.class));
        return ResponseEntity.ok(
                new GenericResponse(userCreated,
                        UserConstants.USER_CREATED)
        );
    }

    @PostMapping("/login")
    public ResponseEntity loginUser(@RequestBody UserDTO user) {
        User userLogged = userService.loginUser(mapper.map(user, User.class));
        return ResponseEntity.ok(
                new GenericResponse(userLogged,
                        UserConstants.USER_LOGGED)
        );
    }


}
