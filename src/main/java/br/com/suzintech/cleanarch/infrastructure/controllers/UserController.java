package br.com.suzintech.cleanarch.infrastructure.controllers;

import br.com.suzintech.cleanarch.application.usecase.CreateUserInteractor;
import br.com.suzintech.cleanarch.domain.User;
import br.com.suzintech.cleanarch.infrastructure.controllers.request.CreateUserRequest;
import br.com.suzintech.cleanarch.infrastructure.controllers.response.CreateUserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
@RequiredArgsConstructor
public class UserController {

    private final CreateUserInteractor createUserInteractor;

    private final UserDTOMapper mapper;

    @PostMapping
    CreateUserResponse create(@RequestBody CreateUserRequest request) {
        User userBusinessObj = mapper.toUser(request);
        User user = createUserInteractor.createUser(userBusinessObj);

        return mapper.toResponse(user);
    }
}
